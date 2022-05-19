package com.o_dentist.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface ClassMapper {
    @MapKey("stuno")
    @Select("select * from exp_stu")
    List<Map<String, Object>> queryclass();
}
