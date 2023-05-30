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
        DashBoardInfo dashBoardInfo = dashBoardDao.getDashBoardInfo(map);
        return dashBoardInfo;
    }
}
