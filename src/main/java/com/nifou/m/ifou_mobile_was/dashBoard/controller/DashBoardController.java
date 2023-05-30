package com.nifou.m.ifou_mobile_was.dashBoard.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nifou.m.ifou_mobile_was.dashBoard.model.service.DashBoardService;
import com.nifou.m.ifou_mobile_was.dashBoard.model.vo.DashBoardInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

@RestController
public class DashBoardController {
    @Autowired
    private DashBoardService dashBoardService;
@RequestMapping(value = "/common/get_main_dashboard", method = RequestMethod.POST)
    public DashBoardInfo get_main_dashboard (@RequestParam(value = "orgcd",required = false) String orgCd,
                                    @RequestParam(value = "appdd",required = false) String appDd,
                                    HttpServletRequest request,
                                    HttpServletResponse response
                                                                ) throws NoSuchAlgorithmException, JsonProcessingException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=UTF-8");
        response.setHeader("Accept", "application/x-www-form-urlencoded");
        response.setHeader("Access-Control-Allow-Origin", "*");


        // 대시보드정보에 담을 객체 생성
        DashBoardInfo dashBoardInfo = new DashBoardInfo();
        dashBoardInfo.setAppDd(appDd);

        String where_qry = "";

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("orgCd", orgCd);
        map.put("appDd", appDd);

        // 날짜 조건 ( 전일매출현황/월매출통계 구분 )
        if(appDd.length()<8) {
            // 월매출통계
            where_qry = " AND SUBSTR(APPDD,0,6) = " + appDd;
        } else {
            // 전일매출현황
            where_qry = " AND APPDD = "+ appDd;
        }
        map.put("where_qry",where_qry);


        // 조회
        dashBoardInfo = dashBoardService.getDashBoardInfo(map);

        System.out.println(dashBoardInfo);

        return dashBoardInfo;
    }
}
