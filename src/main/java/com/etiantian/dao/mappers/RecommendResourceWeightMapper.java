package com.etiantian.dao.mappers;

import com.etiantian.entity.RecommendResourceWeight;
import com.etiantian.entity.RecommendResourceWeightExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecommendResourceWeightMapper {
    int countByExample(RecommendResourceWeightExample example);

    int deleteByExample(RecommendResourceWeightExample example);

    int deleteByPrimaryKey(BigDecimal ref);

    int insert(RecommendResourceWeight record);

    int insertSelective(RecommendResourceWeight record);

    List<RecommendResourceWeight> selectByExample(RecommendResourceWeightExample example);

    RecommendResourceWeight selectByPrimaryKey(BigDecimal ref);

    int updateByExampleSelective(@Param("record") RecommendResourceWeight record, @Param("example") RecommendResourceWeightExample example);

    int updateByExample(@Param("record") RecommendResourceWeight record, @Param("example") RecommendResourceWeightExample example);

    int updateByPrimaryKeySelective(RecommendResourceWeight record);

    int updateByPrimaryKey(RecommendResourceWeight record);
}