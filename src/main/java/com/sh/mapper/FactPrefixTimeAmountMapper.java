package com.sh.mapper;

import com.sh.pojo.FactPrefixTimeAmount;
import com.sh.pojo.FactPrefixTimeAmountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FactPrefixTimeAmountMapper {
    int countByExample(FactPrefixTimeAmountExample example);

    int deleteByExample(FactPrefixTimeAmountExample example);

    int insert(FactPrefixTimeAmount record);

    int insertSelective(FactPrefixTimeAmount record);

    List<FactPrefixTimeAmount> selectByExample(FactPrefixTimeAmountExample example);

    int updateByExampleSelective(@Param("record") FactPrefixTimeAmount record, @Param("example") FactPrefixTimeAmountExample example);

    int updateByExample(@Param("record") FactPrefixTimeAmount record, @Param("example") FactPrefixTimeAmountExample example);
}