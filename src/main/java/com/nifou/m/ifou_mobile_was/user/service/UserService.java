package com.nifou.m.ifou_mobile_was.user.service;

import com.nifou.m.ifou_mobile_was.user.vo.UserInfo;
import com.nifou.m.ifou_mobile_was.user.vo.UserUauth;

import java.util.HashMap;


public interface UserService {
    UserInfo getUserInfo(HashMap<String, Object> map);

    UserUauth getUserUauth(HashMap<String, Object> map);
}
