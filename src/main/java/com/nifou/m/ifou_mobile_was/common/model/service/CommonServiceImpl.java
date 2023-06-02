package com.nifou.m.ifou_mobile_was.common.model.service;

import com.nifou.m.ifou_mobile_was.common.model.dao.CommonDao;
import com.nifou.m.ifou_mobile_was.common.model.vo.ColumnsInfo;
import com.nifou.m.ifou_mobile_was.common.model.vo.CommonInfo;
import com.nifou.m.ifou_mobile_was.common.model.vo.MenuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class CommonServiceImpl implements CommonService{
    @Autowired
    private CommonDao commonDao;

    @Override
    public ArrayList<MenuInfo> getMenu(HashMap<String, Object> map) {
        ArrayList<MenuInfo> menuInfo = commonDao.getMenu(map);
        return menuInfo;
    }

    @Override
    public ArrayList<CommonInfo> getDep(HashMap<String, Object> map) {
        ArrayList<CommonInfo> commonInfo = commonDao.getDep(map);
        return commonInfo;
    }
    @Override
    public ArrayList<CommonInfo> getAcq(HashMap<String, Object> map) {
        ArrayList<CommonInfo> commonInfo = commonDao.getAcq(map);
        return commonInfo;
    }

    @Override
    public ArrayList<ColumnsInfo> getTbSysDomain(HashMap<String, Object> map) {
        ArrayList<ColumnsInfo> columnsInfo = commonDao.getTbSysDomain(map);
        return columnsInfo;
    }

    @Override
    public ArrayList<CommonInfo> getTid(HashMap<String, Object> map) {
        ArrayList<CommonInfo> commonInfo = commonDao.getTid(map);
        return commonInfo;
    }


}
