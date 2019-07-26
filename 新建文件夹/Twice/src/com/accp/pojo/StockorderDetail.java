package com.accp.pojo;

public class StockorderDetail {
    private Integer tbLineId;

    private String tbBillno;

    private String tbProdname;

    private Double tbAmount;

    private Double tbPrice;

    private Double tbMoneyAmt;

    private Integer tbIspresent;

    public Integer getTbLineId() {
        return tbLineId;
    }

    public void setTbLineId(Integer tbLineId) {
        this.tbLineId = tbLineId;
    }

    public String getTbBillno() {
        return tbBillno;
    }

    public void setTbBillno(String tbBillno) {
        this.tbBillno = tbBillno == null ? null : tbBillno.trim();
    }

    public String getTbProdname() {
        return tbProdname;
    }

    public void setTbProdname(String tbProdname) {
        this.tbProdname = tbProdname == null ? null : tbProdname.trim();
    }

    public Double getTbAmount() {
        return tbAmount;
    }

    public void setTbAmount(Double tbAmount) {
        this.tbAmount = tbAmount;
    }

    public Double getTbPrice() {
        return tbPrice;
    }

    public void setTbPrice(Double tbPrice) {
        this.tbPrice = tbPrice;
    }

    public Double getTbMoneyAmt() {
        return tbMoneyAmt;
    }

    public void setTbMoneyAmt(Double tbMoneyAmt) {
        this.tbMoneyAmt = tbMoneyAmt;
    }

    public Integer getTbIspresent() {
        return tbIspresent;
    }

    public void setTbIspresent(Integer tbIspresent) {
        this.tbIspresent = tbIspresent;
    }
}