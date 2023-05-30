package com.nifou.m.ifou_mobile_was.dashBoard.model.service;

import com.nifou.m.ifou_mobile_was.dashBoard.model.vo.DashBoardInfo;

import java.util.HashMap;

public interface DashBoardService {
    DashBoardInfo getDashBoardInfo(HashMap<String, Object> map);

    DashBoardInfo getDashBoardInfo2(HashMap<String, Object> map);
}
