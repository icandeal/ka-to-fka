package com.etiantian.service;

import com.etiantian.launcher.SpringContext;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

/**
 * Created by yuchunfan on 2017/2/6.
 */
@Service
public class ServiceFacade {
    private static Logger logger = Logger.getLogger(ServiceFacade.class);
    public static final char UNDERLINE = '_';

    public void doService(String topicName, JSONObject json) {
        try {
            topicName = topicName.toLowerCase();
            // get service object
            String mapperName = underlineToCamel(topicName) + "Mapper";
            String mapperClassName = "com.etiantian.dao.mappers." + toFirstUpperCase(mapperName);
            Class mapperClazz = Class.forName(mapperClassName);
            Object mapper = SpringContext.getBean(mapperName, mapperClazz);

            // get entity obj
            String entityName = underlineToCamel(topicName);
            String entityClassName = "com.etiantian.entity." + toFirstUpperCase(entityName);
            Class entityClazz = Class.forName(entityClassName);
            Object entity = entityClazz.newInstance();
            setParamsByRulesJson(entity, json);

            // get example obj
            String exampleClassName = entityClassName + "Example";
            Class exampleClazz = Class.forName(exampleClassName);
            Object example = exampleClazz.newInstance();
            setExampleByJson(example, json);

            if (json.has("query")) {
                int affectRows = (Integer) callMethod(mapper, "updateByExampleSelective", entity, example);
                if(affectRows<1) {
                    callMethod(mapper, "insertSelective", entity);
                }
            } else {
                callMethod(mapper, "insertSelective", entity);
            }
        } catch (Exception e) {
            logger.error("doService ERROR!!\n",e);
        }
    }

    /**
     *  将带下划线的字符串转换成驼峰形式
     * @param str 字符串
     * @return
     */
    public static String underlineToCamel(String str){
        if (str==null||"".equals(str.trim())){
            return "";
        }
        int len=str.length();
        StringBuilder sb=new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c=str.charAt(i);
            if (c==UNDERLINE){
                if (++i<len){
                    sb.append(Character.toUpperCase(str.charAt(i)));
                }
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     *  将字符串首字母大写
     * @param str 字符串
     * @return
     */
    public static String toFirstUpperCase(String str) {
        return str.replaceFirst(str.substring(0,1),str.substring(0,1).toUpperCase());
    }

    /**
     *  根据约定的规则设置设置参数
     *  {
            "query": {
                "colum1": "23",
                "column2": "324"
            },
            "update": {
                "column3": "ffw"
            }
        }
     * @param t     实体类
     * @param json
     * @param <T>
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static <T>void setParamsByRulesJson(T t, JSONObject json) throws Exception {
        if(json.has("query")) {
            setParamsByJson(t, (JSONObject)json.get("query"));
        }
        if(json.has("update")) {
            setParamsByJson(t, (JSONObject)json.get("update"));
        }
    }

    public static <T>boolean setExampleByJson(T t, JSONObject json) throws Exception{
        if(!json.has("query")) {
            return false;
        }

        Object criteria = t.getClass().getMethod("createCriteria", null).invoke(t, null);
        JSONObject queryJson = (JSONObject)json.get("query");
        Iterator<String> it = queryJson.keys();
        while(it.hasNext()) {
            String key = it.next();
            Object value = queryJson.get(key);
            String methodName = "and" + toFirstUpperCase(underlineToCamel(key)) + "EqualTo";
            callMethod(criteria, methodName, value);
        }

        return true;
    }

    public static <T>void setParamsByJson(T t, JSONObject json) throws Exception {
        Iterator<String> it = json.keys();
        while(it.hasNext()) {
            String key = it.next();
            Object value = json.get(key);
            String methodName = "set"+toFirstUpperCase(underlineToCamel(key));

            callMethod(t, methodName, value);
        }
    }

    public static <T>void setUniqueKeyByJson(T t, JSONObject json) {

    }

    public static <T>Object callMethod(T t, String methodName, Object ...params) throws Exception {
        Object rtn = null;
        Method[] methods = t.getClass().getMethods();
        for(Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class<?>[] types = method.getParameterTypes();
                if (types != null && types.length > 0 && params != null && params.length > 0) {
                    int index = 0;
                    for (Object param : params) {
                        if (!types[index].getSimpleName().toLowerCase().equals("string")
                                && !types[index].getSimpleName().toLowerCase().equals("date")) {
                            param = ConvertUtils.convert(param, types[index]);
                        } else if (types[index].getSimpleName().toLowerCase().equals("string")) {
                            param = param.toString().replace("&apos;", "'");
                        }
                        params[index] = param;
                        index++;
                    }
                    rtn = method.invoke(t, params);
                    break;
                }
            }
        }
        return rtn;
    }
}
