package com.nifou.m.ifou_mobile_was.user.model.service;

import com.nifou.m.ifou_mobile_was.user.model.vo.UserInfo;
import com.nifou.m.ifou_mobile_was.user.model.vo.UserUauth;

import java.util.HashMap;


public interface UserService {
    UserInfo getUserInfo(HashMap<String, Object> map);

    UserUauth getUserUauth(HashMap<String, Object> map);
}
