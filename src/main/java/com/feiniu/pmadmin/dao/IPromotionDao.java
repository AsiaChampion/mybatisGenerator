package com.feiniu.pmadmin.dao;

import com.feiniu.pmadmin.entity.PromotionEntity;

public interface IPromotionDao {
    int deleteByPrimaryKey(Short promotionNo);

    int insert(PromotionEntity record);

    int insertSelective(PromotionEntity record);

    PromotionEntity selectByPrimaryKey(Short promotionNo);

    int updateByPrimaryKeySelective(PromotionEntity record);

    int updateByPrimaryKey(PromotionEntity record);
}