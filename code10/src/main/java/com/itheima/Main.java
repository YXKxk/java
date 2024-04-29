package com.itheima;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String A = "123456789";
        String B = "567891234";
        for (int i = 0 ; i< A.length();i++) {
            if(!luoma(A).equals(B)){
                A = luoma(A);
                System.out.println("不可以选择字符串，重新选择");
            }else{
                System.out.println("可以选择字符串");
                break;
            }

        }

    }
    public  static  String luoma(String A){
        String s =A;
        String substring = A.substring(1);
        StringBuilder stringBuilder = new StringBuilder(substring);
        s = stringBuilder.append(s.charAt(0)).toString();
        return s;
    }
}