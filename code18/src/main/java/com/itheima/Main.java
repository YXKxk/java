package com.itheima;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

//        int[] arr = new int[12];
//        arr[0] = 1;
//        arr[1] = 1;
//        for (int i = 2; i < arr.length; i++) {
//            arr[i] = arr[i-2] + arr[i-1];
//        }
//        System.out.println(Arrays.toString(arr));

        int fn = Fn(20);
        System.out.println(fn);
    }
    public  static  int Fn(int x){
        if(x == 1 ){
            return 1;
        }
        if(x == 2){
            return  2;
        }
        if(x == 3){
            return  4;
        }
        return Fn(x-1) + Fn(x-2) + Fn(x -3);
    }

}