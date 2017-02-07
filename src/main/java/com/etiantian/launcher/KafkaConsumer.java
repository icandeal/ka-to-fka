package com.etiantian.launcher;

import com.etiantian.ConsumerCallback;
import com.etiantian.PooledKafka;
import com.etiantian.service.ServiceFacade;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;

/**
 * Created by yuchunfan on 2017/2/4.
 */
@Component
public class KafkaConsumer {
    @Autowired
    ServiceFacade serviceFacade;

    public void execute() throws IOException {
        PooledKafka kafka = new PooledKafka();
        kafka.setConfigLocation(new ClassPathResource("kafka.properties"));

        Properties properties = new Properties();
        properties.load(new ClassPathResource("config.properties").getInputStream());

        try {
            kafka.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        kafka.receive(new ConsumerCallback() {
            public void afterReceive(ConsumerRecords consumerRecords) {
                Iterator<ConsumerRecord> it = consumerRecords.iterator();
                while(it.hasNext()) {
                    ConsumerRecord record = it.next();
                    System.out.println(record.topic()+ "    " + record.value());
                    serviceFacade.doService(record.topic().toString(), new JSONObject(record.value().toString()));
                }

            }
        },"kafka-readback", Arrays.asList(properties.getProperty("topic.list").split(",")),2000l );
    }
}