package com.itheima;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

       String str = "aababcabcdabcde";
        TreeMap<String, Integer> TreeMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String c1 = String.valueOf(c);
            if( TreeMap.containsKey(c1)){
               int i1 = TreeMap.get(c1);
               i1++;
               TreeMap.put(c1,i1);
           }else{
               TreeMap.put(c1,1);
           }

        }
        Set<Map.Entry<String, Integer>> entries = TreeMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.print(key+"("+value+") ");
        }
    }

}