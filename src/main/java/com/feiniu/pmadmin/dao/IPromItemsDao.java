package com.feiniu.pmadmin.dao;

import com.feiniu.pmadmin.entity.PromItemsEntity;
import com.feiniu.pmadmin.entity.PromItemsEntityKey;

public interface IPromItemsDao {
    int deleteByPrimaryKey(PromItemsEntityKey key);

    int insert(PromItemsEntity record);

    int insertSelective(PromItemsEntity record);

    PromItemsEntity selectByPrimaryKey(PromItemsEntityKey key);

    int updateByPrimaryKeySelective(PromItemsEntity record);

    int updateByPrimaryKey(PromItemsEntity record);
}