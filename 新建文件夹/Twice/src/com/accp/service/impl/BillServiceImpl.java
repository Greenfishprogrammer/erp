package com.accp.service.impl;

import com.accp.mapper.StockOrderMapper;
import com.accp.mapper.StockorderDetailMapper;
import com.accp.pojo.StockOrder;
import com.accp.pojo.StockorderDetail;
import com.accp.service.IBillService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BillServiceImpl  implements IBillService {

    @Autowired
    StockorderDetailMapper detailMapper;

    @Autowired
    StockOrderMapper orderMapper;

    @Override
    public List<StockorderDetail> queryDetail() {
        return detailMapper.queryDetail();
    }

    @Override
    public List<StockOrder> queryAll() {
        return orderMapper.queryAll();
    }

    @Override
    public String update(StockOrder order) {
        String code ="default";
        int res1=orderMapper.updateByPrimaryKey(order);
        int res2=detailMapper.updates(order.getDetails());
        if(res1>0&&res2>0){
            code="success";
        }
        return code;
    }

    @Override
    public String delete(String billno) {
        String code ="default";
        int res1=orderMapper.deleteByPrimaryKey(billno);
        int res2=detailMapper.deleteBybillno(billno);
        if(res1>0&&res2>0){
            code="success";
        }
        return code;
    }
}
