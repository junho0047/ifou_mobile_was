package com.nifou.m.ifou_mobile_was.dashBoard.model.service;

import com.nifou.m.ifou_mobile_was.dashBoard.model.dao.DashBoardDao;
import com.nifou.m.ifou_mobile_was.dashBoard.model.vo.DashBoardInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class DashBoardServiceImpl implements DashBoardService {
    @Autowired
    private DashBoardDao dashBoardDao;

    @Override
    public DashBoardInfo getDashBoardInfo(HashMap<String, Object> map) {
        // 전일매출현황/월매출통계 조회
        DashBoardInfo dashBoardInfo = dashBoardDao.getDashBoardInfo(map);
        return dashBoardInfo;
    }

    @Override
    public DashBoardInfo getDashBoardInfo2(HashMap<String, Object> map) {
        // 당일입금현황 조회
        DashBoardInfo dashBoardInfo = dashBoardDao.getDashBoardInfo2(map);
        return dashBoardInfo;
    }
}
