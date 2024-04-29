package com.itheima;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        String s = list.get(0);
        System.out.println("s = " + s);
        System.out.println(list);
    }
    public  static void  Fn(List<? extends Ye>  list){

    }
}
class Ye{

}
class Fu extends  Ye{

}
class Zi extends  Fu{

}