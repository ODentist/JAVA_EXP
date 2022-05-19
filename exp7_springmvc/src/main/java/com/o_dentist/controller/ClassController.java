package com.o_dentist.controller;

import com.o_dentist.mapper.ClassMapper;
import com.o_dentist.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ClassController implements ClassMapper {

    private final SqlSessionFactory sqlSessionFactory=MyBatisUtil.getSqlSessionFactory();

    @RequestMapping(value = "/queryclass.action")
    @ResponseBody
    public List<Map<String, Object>> queryclass() {
        List<Map<String, Object>> queryclass = null;
        try(SqlSession sqlSession = sqlSessionFactory.openSession()) {
            ClassMapper mapper = sqlSession.getMapper(ClassMapper.class);
            queryclass = mapper.queryclass();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  queryclass;
    }
}