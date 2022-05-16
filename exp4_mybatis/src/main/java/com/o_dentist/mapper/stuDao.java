package com.o_dentist.mapper;

import com.o_dentist.pojo.exp_stu;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface stuDao {
    public void addUser(exp_stu stu);
    @Select("select  name, score from exp_stu where stuno=#{stuno}")
    public Map getstu(int stno);
}
