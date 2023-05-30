package com.nifou.m.ifou_mobile_was.dashBoard.model.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DashBoardInfo {
    @JsonProperty("appDd")
    private String appDd;
    @JsonProperty("expDd")
    private String expDd;
    @JsonProperty("CC_AMT")
    private String ccAmt;
    @JsonProperty("CB_AMT")
    private String cbAmt;
    @JsonProperty("IC_AMT")
    private String icAmt;
    @JsonProperty("SUM_AMT")
    private String sumAmt;
    @JsonProperty("CC_CNT")
    private String ccCnt;
    @JsonProperty("CB_CNT")
    private String cbCnt;
    @JsonProperty("IC_CNT")
    private String icCnt;
    @JsonProperty("SUM_CNT")
    private String sumCnt;
    @JsonProperty("SALE_AMT")
    private String saleAmt;
    @JsonProperty("FEE")
    private String fee;
    @JsonProperty("SUM")
    private String sum;


    public String getAppDd() {
        return appDd;
    }

    public String getExpDd() { return expDd; }

    public String getCcAmt() {
        return ccAmt;
    }

    public String getCbAmt() {
        return cbAmt;
    }

    public String getIcAmt() {
        return icAmt;
    }

    public String getSumAmt() {
        return sumAmt;
    }

    public String getCcCnt() {
        return ccCnt;
    }

    public String getCbCnt() {
        return cbCnt;
    }

    public String getIcCnt() {
        return icCnt;
    }

    public String getSumCnt() {
        return sumCnt;
    }

    public String getSaleAmt() {
        return saleAmt;
    }

    public String getFee() {
        return fee;
    }

    public String getSum() {
        return sum;
    }

    public void setAppDd(String appDd) {
        this.appDd = appDd;
    }

    public void setExpDd(String expDd) { this.expDd = expDd; }

    public void setCcAmt(String ccAmt) {
        this.ccAmt = ccAmt;
    }

    public void setCbAmt(String cbAmt) {
        this.cbAmt = cbAmt;
    }

    public void setIcAmt(String icAmt) {
        this.icAmt = icAmt;
    }

    public void setSumAmt(String sumAmt) {
        this.sumAmt = sumAmt;
    }

    public void setCcCnt(String ccCnt) {
        this.ccCnt = ccCnt;
    }

    public void setCbCnt(String cbCnt) {
        this.cbCnt = cbCnt;
    }

    public void setIcCnt(String icCnt) {
        this.icCnt = icCnt;
    }

    public void setSumCnt(String sumCnt) {
        this.sumCnt = sumCnt;
    }

    public void setSaleAmt(String saleAmt) {
        this.saleAmt = saleAmt;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "DashBoardInfo{" +
                "appDd='" + appDd + '\'' +
                ", expDd='" + expDd + '\'' +
                ", ccAmt='" + ccAmt + '\'' +
                ", cbAmt='" + cbAmt + '\'' +
                ", icAmt='" + icAmt + '\'' +
                ", sumAmt='" + sumAmt + '\'' +
                ", ccCnt='" + ccCnt + '\'' +
                ", cbCnt='" + cbCnt + '\'' +
                ", icCnt='" + icCnt + '\'' +
                ", sumCnt='" + sumCnt + '\'' +
                ", saleAmt='" + saleAmt + '\'' +
                ", fee='" + fee + '\'' +
                ", sum='" + sum + '\'' +
                '}';
    }

    public DashBoardInfo(String appDd, String expDd, String ccAmt, String cbAmt, String icAmt, String sumAmt,
                         String ccCnt, String cbCnt, String icCnt, String sumCnt, String saleAmt, String fee, String sum) {
        this.appDd = appDd;
        this.expDd = expDd;
        this.ccAmt = ccAmt;
        this.cbAmt = cbAmt;
        this.icAmt = icAmt;
        this.sumAmt = sumAmt;
        this.ccCnt = ccCnt;
        this.cbCnt = cbCnt;
        this.icCnt = icCnt;
        this.sumCnt = sumCnt;
        this.saleAmt = saleAmt;
        this.fee = fee;
        this.sum = sum;
    }

    public DashBoardInfo() {
        super();
    }
}


