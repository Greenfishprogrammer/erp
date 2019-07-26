package com.accp.pojo;

public class Dept {
    private String tbDeptno;

    private String tbDeptname;

    public String getTbDeptno() {
        return tbDeptno;
    }

    public void setTbDeptno(String tbDeptno) {
        this.tbDeptno = tbDeptno == null ? null : tbDeptno.trim();
    }

    public String getTbDeptname() {
        return tbDeptname;
    }

    public void setTbDeptname(String tbDeptname) {
        this.tbDeptname = tbDeptname == null ? null : tbDeptname.trim();
    }
}