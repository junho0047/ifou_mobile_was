package com.nifou.m.ifou_mobile_was.user.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nifou.m.ifou_mobile_was.common.SHA256Util;
import com.nifou.m.ifou_mobile_was.user.model.service.UserService;
import com.nifou.m.ifou_mobile_was.user.model.vo.UserInfo;
import com.nifou.m.ifou_mobile_was.user.model.vo.UserUauth;
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
import java.util.Base64;
import java.util.HashMap;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/user/login.gaon", method = RequestMethod.POST)
    public ResponseEntity<String> userLogin(
                                @RequestParam(value = "userid", required=false) String userId,
                                @RequestParam(value = "userpw", required=false) String userPw,
//                                @RequestBody Map<String, Object> body,
                                UserInfo userInfo,
                                UserUauth userUauth,
                                HttpServletRequest request,
                                HttpServletResponse response) throws NoSuchAlgorithmException, JsonProcessingException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=UTF-8");
        response.setHeader("Accept", "application/x-www-form-urlencoded");
        response.setHeader("Access-Control-Allow-Origin", "*");

        // 비밀번호 암호화 작업
        SHA256Util sha256 = new SHA256Util();
        String encUserPw = sha256.encrypt(userPw);
        String rtnmsg = "9999";

        // 유저정보를 담을 객체 생성
        UserInfo uInfo = new UserInfo();
        UserUauth uUauth = new UserUauth();


        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userId);
        map.put("userPw", encUserPw);

        // 유저정보 조회 후 저장 userId,userPw,depCd,orgCd,userLv,authSeq
        uInfo = userService.getUserInfo(map);

        if(uInfo!=null) {
            if(uInfo.getUserPw().equals(encUserPw)) {
                rtnmsg = "0000"; // 유저정보 일치

            } else {
                rtnmsg = "0001"; // 비밀번호 오류
            }
        } else {
            rtnmsg = "0002";    //아이디 오류
        }

        // 유저정보가 일치 할 경우 uauth 조회
        if(rtnmsg.equals("0000")) {
            uUauth = userService.getUserUauth(map);

        }


        // userId|orgCd|depCd|orgNo|pTab|vTab|dTab|userLv|transNo|authSeq|userNm 형태로 저장 후 base64 인코딩
        String strUserUauth = uUauth.toString();
        String uauth_base64 = Base64.getEncoder().encodeToString(strUserUauth.getBytes());

        // Json 파싱관련
        JSONObject jsonob = new JSONObject();
        jsonob.put("RTN_MSG",rtnmsg);
        jsonob.put("uauth", uauth_base64);

        System.out.println(jsonob);
        return ResponseEntity.ok(jsonob.toString());
    }

}
