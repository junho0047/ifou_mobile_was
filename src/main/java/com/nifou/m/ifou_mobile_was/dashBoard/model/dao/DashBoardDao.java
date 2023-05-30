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
        // 전일매출현황/월매출통계 조회
        return  sqlSession.selectOne("dashBoardInfo.selectDashBoard",map);

    }

    public DashBoardInfo getDashBoardInfo2(HashMap<String, Object> map) {
        // 당일입금현황 조회
        return  sqlSession.selectOne("dashBoardInfo.selectDashBoard2",map);
    }
}
