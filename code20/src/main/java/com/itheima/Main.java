package com.itheima;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>((o1,  o2) -> {
               int temp = o1.getName().compareTo(o2.getName());
               temp = temp == 0 ? o1.getAge() - o2.getAge() : temp;
               if(temp > 0){
                   return 1;
               }else if (temp < 0){
                   return -1;
               }else {
                   return  0;
               }


        });
        Student student = new Student("axk", 18);
        Student student1 = new Student("yxk", 18);
        Student student2 = new Student("yxk", 20);
        ts.add(student);
        ts.add(student1);
        ts.add(student2);
        ts.forEach(System.out::println);
    }
}