package com.nifou.m.ifou_mobile_was.result.model.vo;

public class ResultInfo {
    private String depNm;
    private String tid;
    private String termNm;
    private String trAcqnm;
    private String trMid;
    private String acqCd;
    private String aCnt;
    private String cCnt;
    private String aAmt;
    private String cAmt;
    private String totCnt;
    private String totAmt;
    private String hidden;

    public String getDepNm() {
        return depNm;
    }

    public void setDepNm(String depNm) {
        this.depNm = depNm;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTermNm() {
        return termNm;
    }

    public void setTermNm(String termNm) {
        this.termNm = termNm;
    }

    public String getTrAcqnm() {
        return trAcqnm;
    }

    public void setTrAcqnm(String trAcqnm) {
        this.trAcqnm = trAcqnm;
    }

    public String getTrMid() {
        return trMid;
    }

    public void setTrMid(String trMid) {
        this.trMid = trMid;
    }

    public String getAcqCd() {
        return acqCd;
    }

    public void setAcqCd(String acqCd) {
        this.acqCd = acqCd;
    }

    public String getaCnt() {
        return aCnt;
    }

    public void setaCnt(String aCnt) {
        this.aCnt = aCnt;
    }

    public String getcCnt() {
        return cCnt;
    }

    public void setcCnt(String cCnt) {
        this.cCnt = cCnt;
    }

    public String getaAmt() {
        return aAmt;
    }

    public void setaAmt(String aAmt) {
        this.aAmt = aAmt;
    }

    public String getcAmt() {
        return cAmt;
    }

    public void setcAmt(String cAmt) {
        this.cAmt = cAmt;
    }

    public String getTotCnt() {
        return totCnt;
    }

    public void setTotCnt(String totCnt) {
        this.totCnt = totCnt;
    }

    public String getTotAmt() {
        return totAmt;
    }

    public void setTotAmt(String totAmt) {
        this.totAmt = totAmt;
    }

    public String getHidden() {
        return hidden;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    public ResultInfo() {
        super();
    }

    public ResultInfo(String depNm, String tid, String termNm, String trAcqnm, String trMid, String acqCd, String aCnt, String cCnt, String aAmt, String cAmt, String totCnt, String totAmt, String hidden) {
        this.depNm = depNm;
        this.tid = tid;
        this.termNm = termNm;
        this.trAcqnm = trAcqnm;
        this.trMid = trMid;
        this.acqCd = acqCd;
        this.aCnt = aCnt;
        this.cCnt = cCnt;
        this.aAmt = aAmt;
        this.cAmt = cAmt;
        this.totCnt = totCnt;
        this.totAmt = totAmt;
        this.hidden = hidden;
    }

    @Override
    public String toString() {
        return "ResultInfo{" +
                "depNm='" + depNm + '\'' +
                ", tid='" + tid + '\'' +
                ", termNm='" + termNm + '\'' +
                ", trAcqnm='" + trAcqnm + '\'' +
                ", trMid='" + trMid + '\'' +
                ", acqCd='" + acqCd + '\'' +
                ", aCnt='" + aCnt + '\'' +
                ", cCnt='" + cCnt + '\'' +
                ", aAmt='" + aAmt + '\'' +
                ", cAmt='" + cAmt + '\'' +
                ", totCnt='" + totCnt + '\'' +
                ", totAmt='" + totAmt + '\'' +
                ", hidden='" + hidden + '\'' +
                '}';
    }
}
