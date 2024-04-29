package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int g = scanner.nextInt();
//        int i = 0;
//        boolean f = true;
//      for (int j = 1;  j <= g ;j ++ ){
//        if(g % j == 0 && j != 1 && j!=g){
//            f = false;
//            break;
//        }
//      }
//        System.out.println(f == true ? "质数" : "不是质数");
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(i);
    }
}