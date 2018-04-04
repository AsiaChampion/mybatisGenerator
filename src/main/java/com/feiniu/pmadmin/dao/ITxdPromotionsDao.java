package com.feiniu.pmadmin.dao;

import com.feiniu.pmadmin.entity.TxdPromotionsEntity;

public interface ITxdPromotionsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TxdPromotionsEntity record);

    int insertSelective(TxdPromotionsEntity record);

    TxdPromotionsEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TxdPromotionsEntity record);

    int updateByPrimaryKey(TxdPromotionsEntity record);
}