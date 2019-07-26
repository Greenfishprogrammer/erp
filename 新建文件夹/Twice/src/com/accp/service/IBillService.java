package com.accp.service;

import com.accp.pojo.StockOrder;
import com.accp.pojo.StockorderDetail;

import java.util.List;

public interface IBillService {
    public List<StockorderDetail> queryDetail();

    public List<StockOrder> queryAll();

    public String update(StockOrder order);

    public String delete(String billno);

}
