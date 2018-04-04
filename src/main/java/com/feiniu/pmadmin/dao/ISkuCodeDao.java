package com.feiniu.pmadmin.dao;

import com.feiniu.pmadmin.entity.SkuCodeEntity;

public interface ISkuCodeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SkuCodeEntity record);

    int insertSelective(SkuCodeEntity record);

    SkuCodeEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SkuCodeEntity record);

    int updateByPrimaryKey(SkuCodeEntity record);
}