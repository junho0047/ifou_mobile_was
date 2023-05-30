package com.nifou.m.ifou_mobile_was.dashBoard.model.dao;

import com.nifou.m.ifou_mobile_was.dashBoard.model.vo.DashBoardInfo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class DashBoardDao {
    @Autowired
    @Qualifier(value="sqlSessionTemplate")
    private SqlSessionTemplate sqlSession;

    public DashBoardInfo getDashBoardInfo(HashMap<String, Object> map) {

            return  sqlSession.selectOne("dashBoardInfo.selectDashBoard",map);

    }
}
