package com.itheima;


import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"zhangsan, 23","lisi, 24","wangwu, 25");
        Map<String, Integer> map = list.stream()
                .filter(item -> Integer.parseInt(item.split(", ")[1]) >= 24)
                .collect(Collectors.toMap(item -> item.split(", ")[0], item -> Integer.parseInt(item.split(", ")[1])));
        System.out.println(map);
        System.out.println("====================================================");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"张三,23","张三1,24","张三2,25","张三3,26");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"杨丽,23","杨丽1,24","小丽2,25","小丽3,26");
        Stream<String> stream1 = list2.stream().filter(item -> item.split(",")[0].length() == 3).limit(2);
        System.out.println("====================================================");
        Stream<String> stream2 = list3.stream().skip(1).filter(item -> item.split(",")[0].startsWith("杨"));
        System.out.println("====================================================");
//        Stream.concat(list2.stream().filter(item -> item.split(",")[0].length() == 3).limit(2),
//                        list3.stream().skip(1).filter(item -> item.split(",")[0].startsWith("杨")))
//                .forEach(System.out::println);
        System.out.println("====================================================");
        List<Actor> actorList = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println("actorList = " + actorList);
        System.out.println("========================================");

    }

}