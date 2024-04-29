package com.itheima;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        list.add("南京市");
        list.add("扬州市");
        list.add("苏州市");
        list.add("无锡市");
        list.add("常州市");
        map.put("江苏省",list);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("武汉市");
        list2.add("孝感市");
        list2.add("十堰市");
        list2.add("宜昌市");
        list2.add("鄂州市");
        map.put("湖北省",list2);

        System.out.println(map);

       map.forEach((key,value)-> {
           StringBuilder stringBuilder = new StringBuilder(key);
           stringBuilder.append("=");
           for (int i = 0; i< value.size();i++) {
               if(i == value.size() - 1){
                   stringBuilder.append(value.get(i));
               }else{
                   stringBuilder.append(value.get(i)).append(",");
               }

           }
           System.out.println(stringBuilder);

       });

    }

}