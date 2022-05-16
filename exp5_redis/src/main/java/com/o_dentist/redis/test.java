package com.o_dentist.redis;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static Jedis jedis = new Jedis("localhost",6379);

    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("word1");
//        list.add("word2");
//        list.add("word3");
//        list.add("word4");
//        list.add("word4");
//        for (String s : list) {
//            jedis.lpush("word",s);
//        }
//        List<String> word = jedis.lrange("word", 0, 4);
//        for (String s : word) {
//            System.out.println(s);
//        }
        ArrayList<String> list = new ArrayList<>();
        list.add("word1");
        list.add("word2");
        list.add("word3");
        list.add("word4");
        list.add("word4");
        for (String s : list) {
            jedis.sadd("word-2",s);
        }
        System.out.println(jedis.smembers("word-2"));


    }
}
