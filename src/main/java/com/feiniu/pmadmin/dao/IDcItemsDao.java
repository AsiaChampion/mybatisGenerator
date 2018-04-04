package com.feiniu.pmadmin.dao;

import com.feiniu.pmadmin.entity.DcItemsEntity;

public interface IDcItemsDao {
    int deleteByPrimaryKey(Integer itemNo);

    int insert(DcItemsEntity record);

    int insertSelective(DcItemsEntity record);

    DcItemsEntity selectByPrimaryKey(Integer itemNo);

    int updateByPrimaryKeySelective(DcItemsEntity record);

    int updateByPrimaryKey(DcItemsEntity record);
}