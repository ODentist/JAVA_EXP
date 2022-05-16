package com.o_dentist_mapper;

import com.o_dentist.mapper.stuDao;
import com.o_dentist.pojo.exp_stu;
import com.o_dentist.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class mybatisTest {

    @Test
    public void test(){
        //1.获取SqlSession对象-getconnection()
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        //2.执行SQL
        // 方式一：getMapper
        stuDao mapper = sqlSession.getMapper(stuDao.class);
        exp_stu ABao = new exp_stu();
        //mapper.addUser(ABao);
        HashMap<String, Object> map = new HashMap<>();
        map.put("name",ABao.getName());
        map.put("score",ABao.getScore());
        Map getstu = mapper.getstu(5);
        System.out.println(getstu);




    }

}
