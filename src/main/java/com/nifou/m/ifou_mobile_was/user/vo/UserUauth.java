package com.nifou.m.ifou_mobile_was.user.vo;

public class UserUauth {

    private String userId;
    private String orgCd;
    private String depCd;
    private String orgNo;
    private String pTab;

    private String vTab;

    private String dTab;

    private String userLv;
    private String transNo;
    private String authSeq;

    private String userNm;

    public String getUserId() {
        return userId;
    }

    public String getOrgCd() {
        return orgCd;
    }

    public String getDepCd() {
        return depCd;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public String getpTab() {
        return pTab;
    }

    public String getvTab() {
        return vTab;
    }

    public String getdTab() {
        return dTab;
    }

    public String getUserLv() {
        return userLv;
    }

    public String getTransNo() {
        return transNo;
    }

    public String getAuthSeq() {
        return authSeq;
    }

    public String getUserNm() {
        return userNm;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setOrgCd(String orgCd) {
        this.orgCd = orgCd;
    }

    public void setDepCd(String depCd) {
        this.depCd = depCd;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public void setpTab(String pTab) {
        this.pTab = pTab;
    }

    public void setvTab(String vTab) {
        this.vTab = vTab;
    }

    public void setdTab(String dTab) {
        this.dTab = dTab;
    }

    public void setUserLv(String userLv) {
        this.userLv = userLv;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public void setAuthSeq(String authSeq) {
        this.authSeq = authSeq;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    @Override
    public String toString() {
        return userId + "|" +
                orgCd + "|" +
                depCd + "|" +
                orgNo + "|" +
                pTab + "|" +
                vTab + "|" +
                dTab + "|" +
                userLv + "|" +
                transNo + "|" +
                authSeq + "|" +
                userNm + "|" ;

    }
    public UserUauth() {
        super();
    }
    public UserUauth(String userId, String orgCd, String depCd, String orgNo, String pTab, String vTab, String dTab, String userLv, String transNo, String authSeq, String userNm) {
        this.userId = userId;
        this.orgCd = orgCd;
        this.depCd = depCd;
        this.orgNo = orgNo;
        this.pTab = pTab;
        this.vTab = vTab;
        this.dTab = dTab;
        this.userLv = userLv;
        this.transNo = transNo;
        this.authSeq = authSeq;
        this.userNm = userNm;
    }
}

