package com.nifou.m.ifou_mobile_was.common.model.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CommonInfo {
    @JsonProperty("orgcd")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String orgCd;
    @JsonProperty("dep_nm")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String depNm;
    @JsonProperty("dep_cd")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String depCd;
    @JsonProperty("tid_nm")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String tidNm;
    @JsonProperty("tid_cd")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String tidCd;
    @JsonProperty("pur_nm")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String purNm;
    @JsonProperty("pur_cd")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String purCd;
    @JsonProperty("pur_koces")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String purKoces;

    public String getOrgCd() {
        return orgCd;
    }

    public void setOrgCd(String orgCd) {
        this.orgCd = orgCd;
    }

    public String getDepNm() {
        return depNm;
    }

    public void setDepNm(String depNm) {
        this.depNm = depNm;
    }

    public String getDepCd() {
        return depCd;
    }

    public void setDepCd(String depCd) {
        this.depCd = depCd;
    }

    public String getTidNm() {
        return tidNm;
    }

    public void setTidNm(String tidNm) {
        this.tidNm = tidNm;
    }

    public String getTidCd() {
        return tidCd;
    }

    public void setTidCd(String tidCd) {
        this.tidCd = tidCd;
    }

    public String getPurNm() {
        return purNm;
    }

    public void setPurNm(String purNm) {
        this.purNm = purNm;
    }

    public String getPurCd() {
        return purCd;
    }

    public void setPurCd(String purCd) {
        this.purCd = purCd;
    }

    public String getPurKoces() {
        return purKoces;
    }

    public void setPurKoces(String purKoces) {
        this.purKoces = purKoces;
    }

    public CommonInfo(String orgCd, String depNm, String depCd, String tidNm, String tidCd, String purNm, String purCd, String purKoces) {
        this.orgCd = orgCd;
        this.depNm = depNm;
        this.depCd = depCd;
        this.tidNm = tidNm;
        this.tidCd = tidCd;
        this.purNm = purNm;
        this.purCd = purCd;
        this.purKoces = purKoces;
    }

    @Override
    public String toString() {
        return "CommonInfo{" +
                "orgCd='" + orgCd + '\'' +
                ", depNm='" + depNm + '\'' +
                ", depCd='" + depCd + '\'' +
                ", tidNm='" + tidNm + '\'' +
                ", tidCd='" + tidCd + '\'' +
                ", purNm='" + purNm + '\'' +
                ", purCd='" + purCd + '\'' +
                ", purKoces='" + purKoces + '\'' +
                '}';
    }

    public CommonInfo() {
        super();
    }
}

