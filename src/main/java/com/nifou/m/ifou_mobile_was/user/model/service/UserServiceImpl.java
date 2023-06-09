package com.nifou.m.ifou_mobile_was.user.model.service;

import com.nifou.m.ifou_mobile_was.user.model.dao.UserDao;
import com.nifou.m.ifou_mobile_was.user.model.vo.UserInfo;
import com.nifou.m.ifou_mobile_was.user.model.vo.UserUauth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public UserInfo getUserInfo(HashMap<String, Object> map) {
        UserInfo uInfo = userDao.getUserInfo(map);

        return uInfo;

    }

    @Override
    public UserUauth getUserUauth(HashMap<String, Object> map) {
        UserUauth uUauth = userDao.getUserUauth(map);
        return uUauth;
    }
}
