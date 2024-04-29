package com.itheima;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Swim(){
            @Override
            public  void swim(){
                System.out.println("重写了游泳的方法");
            }
        };
    }
}