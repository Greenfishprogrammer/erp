package com.accp.mapper;

import com.accp.pojo.StockOrder;

import java.util.List;
import java.util.ListResourceBundle;

public interface StockOrderMapper {
    int deleteByPrimaryKey(String tbBillno);

    int insert(StockOrder record);

    int insertSelective(StockOrder record);

    StockOrder selectByPrimaryKey(String tbBillno);

    int updateByPrimaryKeySelective(StockOrder record);

    int updateByPrimaryKey(StockOrder record);

    List<StockOrder> queryAll();
}