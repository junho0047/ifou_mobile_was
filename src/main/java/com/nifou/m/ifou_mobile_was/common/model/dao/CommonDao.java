package com.nifou.m.ifou_mobile_was.common.model.dao;

import com.nifou.m.ifou_mobile_was.common.model.vo.ColumnsInfo;
import com.nifou.m.ifou_mobile_was.common.model.vo.CommonInfo;
import com.nifou.m.ifou_mobile_was.common.model.vo.MenuInfo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class CommonDao {
    @Autowired
    @Qualifier(value="sqlSessionTemplate")
    private SqlSessionTemplate sqlSession;

    public ArrayList<MenuInfo> getMenu(HashMap<String, Object> map) {
        return new ArrayList<MenuInfo> (sqlSession.selectList("Common.selectMenu",map));
    }

    public ArrayList<CommonInfo> getDep(HashMap<String, Object> map) {
        return new ArrayList<CommonInfo> (sqlSession.selectList("Common.selectDep",map));
    }
    public ArrayList<CommonInfo> getAcq(HashMap<String, Object> map) {
        return new ArrayList<CommonInfo> (sqlSession.selectList("Common.selectAcq",map));
    }
    public ArrayList<CommonInfo> getTid(HashMap<String, Object> map) {
        return new ArrayList<CommonInfo> (sqlSession.selectList("Common.selectTid",map));
    }


    public ArrayList<ColumnsInfo> getTbSysDomain(HashMap<String, Object> map) {
        return new ArrayList<ColumnsInfo> (sqlSession.selectList("Common.selectTbSysDomain",map));
    }
}
