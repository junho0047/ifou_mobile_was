package com.nifou.m.ifou_mobile_was.common.model.service;

import com.nifou.m.ifou_mobile_was.common.model.vo.ColumnsInfo;
import com.nifou.m.ifou_mobile_was.common.model.vo.CommonInfo;
import com.nifou.m.ifou_mobile_was.common.model.vo.MenuInfo;

import java.util.ArrayList;
import java.util.HashMap;

public interface CommonService {
    ArrayList<MenuInfo> getMenu(HashMap<String, Object> map);

    ArrayList<CommonInfo> getDep(HashMap<String, Object> map);

    ArrayList<CommonInfo> getTid(HashMap<String, Object> map);

    ArrayList<CommonInfo> getAcq(HashMap<String, Object> map);

    ArrayList<ColumnsInfo> getTbSysDomain(HashMap<String, Object> map);
}
