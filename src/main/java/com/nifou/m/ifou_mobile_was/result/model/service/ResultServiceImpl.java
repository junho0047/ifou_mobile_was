package com.nifou.m.ifou_mobile_was.result.model.service;

import com.nifou.m.ifou_mobile_was.result.model.dao.ResultDao;
import com.nifou.m.ifou_mobile_was.result.model.vo.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class ResultServiceImpl implements ResultService{

    @Autowired
    private ResultDao resultDao;
    @Override
    public ArrayList<ResultInfo> sub02_04(HashMap<String, Object> map) {
        ArrayList<ResultInfo> resultInfo = resultDao.sub02_04(map);
        return resultInfo;
    }
}
