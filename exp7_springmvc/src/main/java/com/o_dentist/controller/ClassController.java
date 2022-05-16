package com.o_dentist.controller;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
    public class ClassController {

        @RequestMapping(value = "/queryclass.action")
        @ResponseBody
        public List<Map<String, Object>> queryclass() {
            String s="{[{'score':'90','sex':'男','name':'张三','stuno':'001'},{'score':'92','sex':'女','name':'王芳','stuno':'002'}]}";
            JSONArray objects = JSON.parseArray(s);
            List<Map<String, Object>> c_list = new ArrayList<Map<String, Object>>();
            HashMap<String, Object> map = new HashMap<>();
            for (int i = 0; i < objects.size(); i++) {
                JSONObject jsonObject = objects.getJSONObject(i);
                map.put("score",jsonObject.get("score"));
                map.put("sex",jsonObject.get("sex"));
                map.put("name",jsonObject.get("name"));
                map.put("stuno",jsonObject.get("stuno"));
                System.out.println(jsonObject.get("name"));
            }

            c_list.add(map);
//            List<Map<String, Object>> c_list = new ArrayList<Map<String, Object>>();
//            HashMap<String, Object> map = new HashMap<>();
//            map.put("stuno","001");
//            map.put("name","张三");
//            map.put("sex","男");
//            map.put("score","90");
//            c_list.add(map);
//
//            HashMap<String, Object> map2 = new HashMap<>();
//            map2.put("stuno","002");
//            map2.put("name","王芳");
//            map2.put("sex","女");
//            map2.put("score","95");
//            c_list.add(map2);
            // 实现代码
            return c_list;
        }
}