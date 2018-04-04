package com.feiniu.pmadmin.dao;

import com.feiniu.pmadmin.entity.ZcStoreItemEntity;

public interface ZcStoreItemEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZcStoreItemEntity record);

    int insertSelective(ZcStoreItemEntity record);

    ZcStoreItemEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZcStoreItemEntity record);

    int updateByPrimaryKey(ZcStoreItemEntity record);
}