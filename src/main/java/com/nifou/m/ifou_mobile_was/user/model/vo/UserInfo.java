package com.nifou.m.ifou_mobile_was.user.model.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInfo {
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("userPw")
    private String userPw;
    @JsonProperty("depCd")
    private String depCd;
    @JsonProperty("orgCd")
    private String orgCd;
    @JsonProperty("userLv")
    private String userLv;
    @JsonProperty("authSeq")
    private String authSeq;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getDepCd() {
        return depCd;
    }

    public void setDepCd(String depCd) {
        this.depCd = depCd;
    }

    public String getOrgCd() {
        return orgCd;
    }

    public void setOrgCd(String orgCd) {
        this.orgCd = orgCd;
    }

    public String getUserLv() {
        return userLv;
    }

    public void setUserLv(String userLv) {
        this.userLv = userLv;
    }

    public String getAuthSeq() {
        return authSeq;
    }

    public void setAuthSeq(String authSeq) {
        this.authSeq = authSeq;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                ", depCd='" + depCd + '\'' +
                ", orgCd='" + orgCd + '\'' +
                ", userLv='" + userLv + '\'' +
                ", authSeq='" + authSeq + '\'' +
                '}';
    }

    public UserInfo(String userId, String userPw, String depCd, String orgCd, String userLv, String authSeq) {
        this.userId = userId;
        this.userPw = userPw;
        this.depCd = depCd;
        this.orgCd = orgCd;
        this.userLv = userLv;
        this.authSeq = authSeq;
    }

    public UserInfo() {
        super();
    }
}
