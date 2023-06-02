package com.nifou.m.ifou_mobile_was.common.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nifou.m.ifou_mobile_was.common.model.service.CommonService;
import com.nifou.m.ifou_mobile_was.common.model.vo.ColumnsInfo;
import com.nifou.m.ifou_mobile_was.common.model.vo.CommonInfo;
import com.nifou.m.ifou_mobile_was.common.model.vo.MenuInfo;
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
public class CommonController {
    @Autowired
    private CommonService commonService;
    @RequestMapping(value = "/common/get_menu.gaon", method = RequestMethod.POST)
    public ArrayList<MenuInfo> getMenu (@RequestParam(value = "auth_seq", required=false) String authSeq,
                                           @RequestParam(value = "orgcd", required=false) String orgCd,
                                           HttpServletRequest request,
                                           HttpServletResponse response) throws NoSuchAlgorithmException, JsonProcessingException, IOException {

        // ORGCD, 권한에 맞는 메뉴정보 조회
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=UTF-8");
        response.setHeader("Accept", "application/x-www-form-urlencoded");
        response.setHeader("Access-Control-Allow-Origin", "*");


        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("authSeq", authSeq);
        map.put("orgCd",orgCd);

        ArrayList<MenuInfo> menuInfo = commonService.getMenu(map);

        return menuInfo;
    }

    @RequestMapping(value = "/common/get_depcd", method = RequestMethod.POST)
    public ArrayList<CommonInfo> getDep ( @RequestParam(value = "orgcd", required=false) String orgCd,
                                        HttpServletRequest request,
                                        HttpServletResponse response) throws NoSuchAlgorithmException, JsonProcessingException, IOException {

        // orgcd로 사업부코드 조회
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=UTF-8");
        response.setHeader("Accept", "application/x-www-form-urlencoded");
        response.setHeader("Access-Control-Allow-Origin", "*");


        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("orgCd",orgCd);

        ArrayList<CommonInfo> commonInfo = commonService.getDep(map);

        return commonInfo;
    }

    @RequestMapping(value = "/common/get_acqcd", method = RequestMethod.POST)
    public ArrayList<CommonInfo> getAcq ( @RequestParam(value = "orgcd", required=false) String orgCd,
                                          HttpServletRequest request,
                                          HttpServletResponse response) throws NoSuchAlgorithmException, JsonProcessingException, IOException {

        // orgcd로 카드사 조회
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=UTF-8");
        response.setHeader("Accept", "application/x-www-form-urlencoded");
        response.setHeader("Access-Control-Allow-Origin", "*");


        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("orgCd",orgCd);

        ArrayList<CommonInfo> commonInfo = commonService.getAcq(map);

        return commonInfo;
    }
    @RequestMapping(value = "/common/get_tidcd", method = RequestMethod.POST)
    public ArrayList<CommonInfo> getTid ( @RequestParam(value = "orgcd", required=false) String orgCd,
                                          HttpServletRequest request,
                                          HttpServletResponse response) throws NoSuchAlgorithmException, JsonProcessingException, IOException {

        // orgcd로 단말기 조회
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=UTF-8");
        response.setHeader("Accept", "application/x-www-form-urlencoded");
        response.setHeader("Access-Control-Allow-Origin", "*");


        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("orgCd",orgCd);

        ArrayList<CommonInfo> commonInfo = commonService.getTid(map);

        return commonInfo;
    }

    @RequestMapping(value = "/common/columns.gaon", method = RequestMethod.POST)
    public ResponseEntity<String> getTbSysDomain (@RequestParam(value = "orgcd", required=false) String orgCd,
                                                  @RequestParam(value = "pages", required=false) String pages,
                                                  HttpServletRequest request,
                                                  HttpServletResponse response) throws NoSuchAlgorithmException, JsonProcessingException, IOException {

        // orgcd, pages로 그리드컬럼 조회
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=UTF-8");
        response.setHeader("Accept", "application/x-www-form-urlencoded");
        response.setHeader("Access-Control-Allow-Origin", "*");


        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("orgCd",orgCd);
        map.put("pages",pages);

        ArrayList<ColumnsInfo> columnsInfo = commonService.getTbSysDomain(map);
        System.out.println(columnsInfo.size());

        JSONObject jsonOb = new JSONObject();
        JSONArray jsonAllArray = new JSONArray();

        // ColumnsInfo에 저장된 데이터 뽑아서 json형식으로 변환
        for (ColumnsInfo i : columnsInfo) {
            jsonOb.put("width", i.getWidths());
            jsonOb.put("id", i.getPosField());

            // rowspan 컬럼이 0값이 아닐때
            if (i.getRowspan()!=0) {
                JSONObject jsonObHeader = new JSONObject();
                jsonObHeader.put("text", i.getFieldsTxt());
                jsonObHeader.put("rowspan", i.getRowspan());
                jsonObHeader.put("align", i.getAligns());

                JSONArray jsonArray = new JSONArray();
                jsonArray.put(jsonObHeader);
                jsonOb.put("header", jsonArray);
            }

            // colspan 컬럼이 0값이 아닐때
            if (i.getColspan()!=0) {
                JSONObject jsonObColHeader = new JSONObject();
                JSONObject jsonObHeader = new JSONObject();
                jsonObHeader.put("text", i.getFieldsTxt());
                jsonObHeader.put("colspan", i.getColspan());
                jsonObHeader.put("align", i.getAligns());

                jsonObColHeader.put("text2",i.getColTxt());

                JSONArray jsonArray = new JSONArray();
                jsonArray.put(jsonObHeader);
                jsonArray.put(jsonObColHeader);
                jsonOb.put("header", jsonArray);
            }


            if(i.getColspan()==0  && i.getRowspan()==0 && "Y".equals(i.getColChk())) {
                JSONObject jsonObHeader = new JSONObject();
                JSONObject jsonObColHeader = new JSONObject();
                jsonObHeader.put("text", i.getFieldsTxt());
                jsonObHeader.put("align", i.getAligns());
                jsonObColHeader.put("text2", "");

                JSONArray jsonArray = new JSONArray();
                jsonArray.put(jsonObHeader);
                jsonArray.put(jsonObColHeader);
                jsonOb.put("header", jsonArray);

            }
            if(i.getColspan()==0  && i.getRowspan()==0 && !"Y".equals(i.getColChk())) {
                JSONObject jsonObHeader = new JSONObject();
                JSONObject jsonObColHeader = new JSONObject();
                jsonObHeader.put("text", i.getFieldsTxt());
                jsonObHeader.put("align", i.getAligns());

                JSONArray jsonArray = new JSONArray();
                jsonArray.put(jsonObHeader);
                jsonOb.put("header", jsonArray);

            }
            if("int".equals(i.getSorts())) {
                jsonOb.put("format","#,###");
            }

            jsonAllArray.put(jsonOb);
            jsonOb = new JSONObject();
        }

        return ResponseEntity.ok(jsonAllArray.toString());
    }

}
