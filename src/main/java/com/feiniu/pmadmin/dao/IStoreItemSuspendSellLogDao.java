package com.feiniu.pmadmin.dao;

import com.feiniu.pmadmin.entity.StoreItemSuspendSellLogEntity;

public interface IStoreItemSuspendSellLogDao {
    int deleteByPrimaryKey(Integer id);

    int insert(StoreItemSuspendSellLogEntity record);

    int insertSelective(StoreItemSuspendSellLogEntity record);

    StoreItemSuspendSellLogEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StoreItemSuspendSellLogEntity record);

    int updateByPrimaryKey(StoreItemSuspendSellLogEntity record);
}