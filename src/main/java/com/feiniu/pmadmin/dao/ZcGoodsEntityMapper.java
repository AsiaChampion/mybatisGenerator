package com.feiniu.pmadmin.dao;

import com.feiniu.pmadmin.entity.ZcGoodsEntity;
import java.math.BigDecimal;

public interface ZcGoodsEntityMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(ZcGoodsEntity record);

    int insertSelective(ZcGoodsEntity record);

    ZcGoodsEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(ZcGoodsEntity record);

    int updateByPrimaryKey(ZcGoodsEntity record);
}