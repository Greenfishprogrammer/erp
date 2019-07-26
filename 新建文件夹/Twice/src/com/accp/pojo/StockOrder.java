package com.accp.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class StockOrder {
    private String tbBillno;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tbBilldate;

    private String tbCustomer;

    private String tbCustomerAddress;

    private String tbBuyer;

    private String tbMaker;

    private String tbDeptname;

    private String tbPermitter;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tbPermitDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tbCreatTime;

    private String tbRemark;

    private List<StockorderDetail> details;

    public List<StockorderDetail> getDetails() {
        return details;
    }

    public void setDetails(List<StockorderDetail> details) {
        this.details = details;
    }

    public String getTbBillno() {
        return tbBillno;
    }

    public void setTbBillno(String tbBillno) {
        this.tbBillno = tbBillno == null ? null : tbBillno.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getTbBilldate() {
        return tbBilldate;
    }

    public void setTbBilldate(Date tbBilldate) {
        this.tbBilldate = tbBilldate;
    }

    public String getTbCustomer() {
        return tbCustomer;
    }

    public void setTbCustomer(String tbCustomer) {
        this.tbCustomer = tbCustomer == null ? null : tbCustomer.trim();
    }

    public String getTbCustomerAddress() {
        return tbCustomerAddress;
    }

    public void setTbCustomerAddress(String tbCustomerAddress) {
        this.tbCustomerAddress = tbCustomerAddress == null ? null : tbCustomerAddress.trim();
    }

    public String getTbBuyer() {
        return tbBuyer;
    }

    public void setTbBuyer(String tbBuyer) {
        this.tbBuyer = tbBuyer == null ? null : tbBuyer.trim();
    }

    public String getTbMaker() {
        return tbMaker;
    }

    public void setTbMaker(String tbMaker) {
        this.tbMaker = tbMaker == null ? null : tbMaker.trim();
    }

    public String getTbDeptname() {
        return tbDeptname;
    }

    public void setTbDeptname(String tbDeptname) {
        this.tbDeptname = tbDeptname == null ? null : tbDeptname.trim();
    }

    public String getTbPermitter() {
        return tbPermitter;
    }

    public void setTbPermitter(String tbPermitter) {
        this.tbPermitter = tbPermitter == null ? null : tbPermitter.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getTbPermitDate() {
        return tbPermitDate;
    }

    public void setTbPermitDate(Date tbPermitDate) {
        this.tbPermitDate = tbPermitDate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getTbCreatTime() {
        return tbCreatTime;
    }

    public void setTbCreatTime(Date tbCreatTime) {
        this.tbCreatTime = tbCreatTime;
    }

    public String getTbRemark() {
        return tbRemark;
    }

    public void setTbRemark(String tbRemark) {
        this.tbRemark = tbRemark == null ? null : tbRemark.trim();
    }
}