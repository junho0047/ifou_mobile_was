package com.nifou.m.ifou_mobile_was.result.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nifou.m.ifou_mobile_was.result.model.service.ResultService;
import com.nifou.m.ifou_mobile_was.result.model.vo.ResultInfo;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class ResultController {
    @Autowired
    private ResultService resultService;

    @RequestMapping(value = "/sub02/04.gaon", method = RequestMethod.POST)
    public ResponseEntity<String> sub02_04(
                        @RequestParam(value = "sappdd", required=false) String sappdd,
                        @RequestParam(value = "eappdd", required=false) String eappdd,
                        @RequestParam(value = "orgcd", required=false) String orgcd,
                        @RequestParam(value = "depcd", required=false) String depcd,
                        @RequestParam(value = "acqcd", required=false) String acqcd,
                        HttpServletRequest request,
                        HttpServletResponse response) throws NoSuchAlgorithmException, JsonProcessingException, IOException  {

        //카드사별 조회 API

        String setWhere = "";

        // 날짜 조건검색
        setWhere += " AND APPDD BETWEEN '"+sappdd+"' AND '"+eappdd+"'";

        // 사업부 조건 검색
        if(depcd==null||depcd.equals("")) {
            setWhere += "";
        } else {
            setWhere += " AND TID IN (SELECT TID FROM TB_BAS_TIDMAP  WHERE DEP_CD='"+depcd+"' AND ORG_CD='"+orgcd+"') ";
        }

        // 카드사 조건 검색
        if(acqcd==null||acqcd.equals("")) {
            setWhere += "";
        } else {
            setWhere += " AND ACQ_CD IN('"+acqcd+"')";
        }

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("orgCd",orgcd);
        map.put("setWhere",setWhere);

        ArrayList<ResultInfo> resultInfo = resultService.sub02_04(map);

        // ColumnsInfo에 저장된 데이터 뽑아서 json형식으로 변환
        JSONObject jsonOb = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        for (ResultInfo i : resultInfo) {

            jsonOb.put("AAMT", i.getaAmt());
            jsonOb.put("ACNT", i.getaCnt());
            jsonOb.put("CAMT", i.getcAmt());
            jsonOb.put("CCNT", i.getcCnt());
            jsonOb.put("HIDDEN", i.getHidden());
            jsonOb.put("TR_ACQNM", i.getTrAcqnm());
            jsonOb.put("DEP_NM", i.getDepNm());

            jsonArray.put(jsonOb);
            jsonOb = new JSONObject();
        }
        return ResponseEntity.ok(jsonArray.toString());
    }
}
