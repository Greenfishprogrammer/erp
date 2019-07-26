package com.accp.pojo;

public class Person {
    private String tbPersonno;

    private String tbPersonname;

    private String tbDeptno;

    public String getTbPersonno() {
        return tbPersonno;
    }

    public void setTbPersonno(String tbPersonno) {
        this.tbPersonno = tbPersonno == null ? null : tbPersonno.trim();
    }

    public String getTbPersonname() {
        return tbPersonname;
    }

    public void setTbPersonname(String tbPersonname) {
        this.tbPersonname = tbPersonname == null ? null : tbPersonname.trim();
    }

    public String getTbDeptno() {
        return tbDeptno;
    }

    public void setTbDeptno(String tbDeptno) {
        this.tbDeptno = tbDeptno == null ? null : tbDeptno.trim();
    }
}