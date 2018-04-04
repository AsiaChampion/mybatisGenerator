package com.feiniu.pmadmin.dao;

import com.feiniu.pmadmin.entity.TxdPromItemsEntity;

public interface ITxdPromItemsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TxdPromItemsEntity record);

    int insertSelective(TxdPromItemsEntity record);

    TxdPromItemsEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TxdPromItemsEntity record);

    int updateByPrimaryKey(TxdPromItemsEntity record);
}