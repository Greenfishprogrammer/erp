package com.accp.mapper;

import com.accp.pojo.StockorderDetail;

import java.util.List;

public interface StockorderDetailMapper {
    int deleteByPrimaryKey(Integer tbLineId);

    int deleteBybillno(String billno);

    int insert(StockorderDetail record);

    int insertSelective(StockorderDetail record);

    StockorderDetail selectByPrimaryKey(Integer tbLineId);

    int updateByPrimaryKeySelective(StockorderDetail record);

    int updateByPrimaryKey(StockorderDetail record);

    List<StockorderDetail> queryDetail();

    int updates(List<StockorderDetail> details);
}