package com.nifou.m.ifou_mobile_was.common.model.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ColumnsInfo {
    @JsonProperty("orgcd")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String orgCd;

    @JsonProperty("FIELDS_TXT")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String fieldsTxt;

    @JsonProperty("ALIGNS")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String aligns;
    @JsonProperty("COL_TYPE")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String colType;

    @JsonProperty("SORTS")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String sorts;

    @JsonProperty("WIDTHS")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String widths;

    @JsonProperty("POS_FIELD")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String posField;

    @JsonProperty("VAN_FIELD")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String vanField;

    @JsonProperty("CASH_FIELD")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String cashField;

    @JsonProperty("PAGES")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String pages;

    @JsonProperty("ORN")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String orn;

    @JsonProperty("ROWSPAN")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private int rowspan;

    @JsonProperty("COLSPAN")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private int colspan;
    @JsonProperty("COL_CHK")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String colChk;

    @JsonProperty("COL_TXT")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String colTxt;

    public String getOrgCd() {
        return orgCd;
    }

    public void setOrgCd(String orgCd) {
        this.orgCd = orgCd;
    }

    public String getFieldsTxt() {
        return fieldsTxt;
    }

    public void setFieldsTxt(String fieldsTxt) {
        this.fieldsTxt = fieldsTxt;
    }

    public String getAligns() {
        return aligns;
    }

    public void setAligns(String aligns) {
        this.aligns = aligns;
    }

    public String getColType() {
        return colType;
    }

    public void setColType(String colType) {
        this.colType = colType;
    }

    public String getSorts() {
        return sorts;
    }

    public void setSorts(String sorts) {
        this.sorts = sorts;
    }

    public String getWidths() {
        return widths;
    }

    public void setWidths(String widths) {
        this.widths = widths;
    }

    public String getPosField() {
        return posField;
    }

    public void setPosField(String posField) {
        this.posField = posField;
    }

    public String getVanField() {
        return vanField;
    }

    public void setVanField(String vanField) {
        this.vanField = vanField;
    }

    public String getCashField() {
        return cashField;
    }

    public void setCashField(String cashField) {
        this.cashField = cashField;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getOrn() {
        return orn;
    }

    public void setOrn(String orn) {
        this.orn = orn;
    }

    public int getRowspan() {
        return rowspan;
    }

    public void setRowspan(int rowspan) {
        this.rowspan = rowspan;
    }

    public int getColspan() {
        return colspan;
    }

    public void setColspan(int colspan) {
        this.colspan = colspan;
    }

    public String getColChk() {
        return colChk;
    }

    public void setColChk(String colChk) {
        this.colChk = colChk;
    }

    public String getColTxt() {
        return colTxt;
    }

    public void setColTxt(String colTxt) {
        this.colTxt = colTxt;
    }

    public ColumnsInfo() {
        super();
    }

    @Override
    public String toString() {
        return "ColumnsInfo{" +
                "orgCd='" + orgCd + '\'' +
                ", fieldsTxt='" + fieldsTxt + '\'' +
                ", aligns='" + aligns + '\'' +
                ", colType='" + colType + '\'' +
                ", sorts='" + sorts + '\'' +
                ", widths='" + widths + '\'' +
                ", poField='" + posField + '\'' +
                ", vanField='" + vanField + '\'' +
                ", cashField='" + cashField + '\'' +
                ", pages='" + pages + '\'' +
                ", orn='" + orn + '\'' +
                ", rowspan='" + rowspan + '\'' +
                ", colspan='" + colspan + '\'' +
                ", colChk='" + colChk + '\'' +
                ", colTxt='" + colTxt + '\'' +
                '}';
    }

    public ColumnsInfo(String orgCd, String fieldsTxt, String aligns, String colType, String sorts, String widths, String poField,
                       String vanField, String cashField, String pages, String orn, int rowspan, int colspan, String colChk, String colTxt) {
        this.orgCd      = orgCd;
        this.fieldsTxt  = fieldsTxt;
        this.aligns     = aligns;
        this.colType    = colType;
        this.sorts      = sorts;
        this.widths     = widths;
        this.posField    = poField;
        this.vanField   = vanField;
        this.cashField  = cashField;
        this.pages      = pages;
        this.orn        = orn;
        this.rowspan    = rowspan;
        this.colspan    = colspan;
        this.colChk     = colChk;
        this.colTxt     = colTxt;
    }
}
