package com.feiniu.pmadmin.dao;

import com.feiniu.pmadmin.entity.SkuCodeEntity;
import java.util.List;

public interface SkuCodeEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SkuCodeEntity record);

    SkuCodeEntity selectByPrimaryKey(Integer id);

    List<SkuCodeEntity> selectAll();

    int updateByPrimaryKey(SkuCodeEntity record);
}