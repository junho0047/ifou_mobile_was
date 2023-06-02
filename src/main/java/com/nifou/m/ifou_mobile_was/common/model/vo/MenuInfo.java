package com.nifou.m.ifou_mobile_was.common.model.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MenuInfo {
    @JsonProperty("auth_seq")
    private String authSeq;
    @JsonProperty("orgcd")
    private String orgCd;
    @JsonProperty("PROGRAM_SEQ")
    private String programSeq;
    @JsonProperty("MENU_NAME")
    private String menuName;
    @JsonProperty("MENU_DEPTH")
    private String menuDepth;
    @JsonProperty("PARENT_SEQ")
    private String parentSeq;
    @JsonProperty("AUTH_R")
    private String authR;
    @JsonProperty("AUTH_C")
    private String authC;
    @JsonProperty("AUTH_U")
    private String authU;
    @JsonProperty("AUTH_D")
    private String authD;
    @JsonProperty("MURL")
    private String murl;


    public String getAuthSeq() {
        return authSeq;
    }

    public void setAuthSeq(String authSeq) {
        this.authSeq = authSeq;
    }

    public String getOrgCd() {
        return orgCd;
    }

    public void setOrgCd(String orgCd) {
        this.orgCd = orgCd;
    }

    public String getProgramSeq() {
        return programSeq;
    }

    public void setProgramSeq(String programSeq) {
        this.programSeq = programSeq;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuDepth() {
        return menuDepth;
    }

    public void setMenuDepth(String menuDepth) {
        this.menuDepth = menuDepth;
    }

    public String getParentSeq() {
        return parentSeq;
    }

    public void setParentSeq(String parentSeq) {
        this.parentSeq = parentSeq;
    }

    public String getAuthR() {
        return authR;
    }

    public void setAuthR(String authR) {
        this.authR = authR;
    }

    public String getAuthC() {
        return authC;
    }

    public void setAuthC(String authC) {
        this.authC = authC;
    }

    public String getAuthU() {
        return authU;
    }

    public void setAuthU(String authU) {
        this.authU = authU;
    }

    public String getAuthD() {
        return authD;
    }

    public void setAuthD(String authD) {
        this.authD = authD;
    }

    public String getMurl() {
        return murl;
    }

    public void setMurl(String murl) {
        this.murl = murl;
    }

    @Override
    public String toString() {
        return "MenuInfo{" +
                "authSeq='" + authSeq + '\'' +
                ", orgCd='" + orgCd + '\'' +
                ", programSeq='" + programSeq + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuDepth='" + menuDepth + '\'' +
                ", parentSeq='" + parentSeq + '\'' +
                ", authR='" + authR + '\'' +
                ", authC='" + authC + '\'' +
                ", authU='" + authU + '\'' +
                ", authD='" + authD + '\'' +
                ", murl='" + murl + '\'' +
                '}';
    }

    public MenuInfo(String authSeq, String orgCd, String programSeq, String menuName, String menuDepth, String parentSeq, String authR, String authC, String authU, String authD, String murl) {
        this.authSeq = authSeq;
        this.orgCd = orgCd;
        this.programSeq = programSeq;
        this.menuName = menuName;
        this.menuDepth = menuDepth;
        this.parentSeq = parentSeq;
        this.authR = authR;
        this.authC = authC;
        this.authU = authU;
        this.authD = authD;
        this.murl = murl;
    }
}
