package com.itheima;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        if(i>10){
//           System.out.println("小伙子真不错");
//       }
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        switch (i) {
//            case 1 -> System.out.println(1);
//
//            case 2 -> System.out.println(2);
//
//            case 3 -> System.out.println(3);
//
//            default -> System.out.println("没有这种选项");
//        }
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        int temp = i;
//        int sum = 0;
//        while (i != 0){
//            int g = i%10;
//            i = i/10;
//            sum = sum * 10 + g;
//        }
//        System.out.println(sum);
//        System.out.println(sum == temp);
        int i = 100;
        int j = 10;
        int count = 0;
        while (i >= j){
            i -=j;
            count++;
        }
        System.out.println("除数"+count);
        System.out.println("余数"+i);

}}