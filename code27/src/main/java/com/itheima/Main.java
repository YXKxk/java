package com.itheima;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        String[] arr = new String[1];
//
//
//
//
//        Collections.addAll(list,"张三,23","张三1,24","张三2,25");
//        Student[] array = list.stream()
//                .map(Student::new)
//                .toArray(Student[]::new);
//        System.out.println(Arrays.toString(array));
//        System.out.println("=========================");
//        List<Student> list1 = new ArrayList<>();
//        Student student = new Student("张三", 23);
//        Student student1 = new Student("张三1", 24);
//        Student student2 = new Student("张三2", 25);
//        Collections.addAll(list1,student,student1,student2);
//        String[] array1 = list1.stream().map(Student::getName).toArray(String[]::new);
//        System.out.println(Arrays.toString(array1));
//        System.out.println("=======================");
//        List<Student> list2 = new ArrayList<>();
//        Collections.addAll(list2,student,student1,student2);
//        String[] array2 = list2.stream().map(Student::geNameAndAge).toArray(String[]::new);
//        System.out.println(Arrays.toString(array2));
        Student student = new Student();
        System.out.println(student);
        System.out.println(student.getName());
    }


}