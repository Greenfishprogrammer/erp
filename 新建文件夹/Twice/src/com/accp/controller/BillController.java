package com.accp.controller;

import com.accp.pojo.StockOrder;
import com.accp.pojo.StockorderDetail;
import com.accp.service.IBillService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/bill")
@CrossOrigin(value = "*")
public class BillController {

    @Autowired
    IBillService iBillService;

    //查询明细
    @RequestMapping("/queryDetail")
    @ResponseBody
    public List<StockorderDetail> queryDetail(){
        return iBillService.queryDetail();
    }

    //订单主表联从表查询
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<StockOrder> queryAll(){
        return iBillService.queryAll();
    }


    //修改
    @RequestMapping("/update")
    @ResponseBody
    public String update(StockOrder order){
        return iBillService.update(order);
    }


    //删除
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(String billno){
        return iBillService.delete(billno);
    }


}

