package com.nifou.m.ifou_mobile_was.result.model.dao;

import com.nifou.m.ifou_mobile_was.result.model.vo.ResultInfo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class ResultDao {
    @Autowired
    @Qualifier(value="sqlSessionTemplate")
    private SqlSessionTemplate sqlSession;

    public ArrayList<ResultInfo> sub02_04(HashMap<String, Object> map) {
        return new ArrayList<ResultInfo> (sqlSession.selectList("Result.sub02_04",map));
    }
}
