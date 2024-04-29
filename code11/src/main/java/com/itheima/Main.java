package com.itheima;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        while (true) {
            System.out.println("-----欢迎来到黑马学生管理系统-----");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            switch(i){
                case 1 -> System.out.println(add(scanner, studentArrayList));
                case 2 -> System.out.println(delete(scanner, studentArrayList));
                case 3 -> System.out.println(update(scanner, studentArrayList));
                case 4 -> select(scanner,studentArrayList);
                case 5 -> {
                   System.exit(0);
                }

            }
        }
    }
    public  static String  add(Scanner scanner, ArrayList<Student> studentArrayList){
        System.out.println("请输入id:");
        String id = scanner.next();
        System.out.println("请输入姓名:");
        String name = scanner.next();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        Student student = new Student(id, name, age);
        studentArrayList.add(student);
        return "添加成功";
    }
    public  static  String  update( Scanner scanner,ArrayList<Student> studentArrayList){
        System.out.println("请输入id:");
        String id = scanner.next();
        for (int i = 0; i < studentArrayList.size(); i++) {
            String id1 = studentArrayList.get(i).getId();
            if(id1.equals(id)){
                System.out.println("年龄修改：");
                int age = scanner.nextInt();
                System.out.println("姓名修改为");
                String name = scanner.next();
                studentArrayList.get(i).setAge(age);
                studentArrayList.get(i).setName(name);
            }
        }
        return "id不存在";
    }
    public static void  select( Scanner scanner,ArrayList<Student> studentArrayList){
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = studentArrayList.get(i);
            System.out.println(student.getId()+","+student.getName()+","+student.getAge());

        }
    }
    public  static  String delete( Scanner scanner,ArrayList<Student> studentArrayList){
        System.out.println("请输入id:");
        String id = scanner.next();
        for (int i = 0; i < studentArrayList.size(); i++) {
            String id1 = studentArrayList.get(i).getId();
            if(id1.equals(id)){
                studentArrayList.remove(i);
                return "删除成功";
            }
        }
        return "id不存在";
    }

}