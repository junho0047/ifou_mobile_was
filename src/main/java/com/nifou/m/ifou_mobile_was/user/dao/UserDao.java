package com.nifou.m.ifou_mobile_was.user.dao;

import com.nifou.m.ifou_mobile_was.user.vo.UserInfo;
import com.nifou.m.ifou_mobile_was.user.vo.UserUauth;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserDao {
    @Autowired
    @Qualifier(value="sqlSessionTemplate")
    private SqlSessionTemplate sqlSession;

    public UserInfo getUserInfo(HashMap<String, Object> map) {
        return  sqlSession.selectOne("userInfo.selectUserInfo",map);
    }

    public UserUauth getUserUauth(HashMap<String, Object> map) {
        return  sqlSession.selectOne("userInfo.selectUserUauth",map);
    }
}
