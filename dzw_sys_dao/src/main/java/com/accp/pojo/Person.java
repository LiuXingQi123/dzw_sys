package com.accp.pojo;

import java.util.Date;

public class Person {
    private Integer pid;

    private String pname;

    private Integer psex;

    private Date pdate;

    private String pimg;

    private String pimgdata;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getPsex() {
        return psex;
    }

    public void setPsex(Integer psex) {
        this.psex = psex;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg == null ? null : pimg.trim();
    }

    public String getPimgdata() {
        return pimgdata;
    }

    public void setPimgdata(String pimgdata) {
        this.pimgdata = pimgdata == null ? null : pimgdata.trim();
    }
}