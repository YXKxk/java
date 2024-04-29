package com.itheima;

public class Cat extends  Animal{
    public void catchMouse(){
        System.out.println("抓老鼠");
    }

    public Cat() {
    }

    public Cat(String color, int age) {
        super(color, age);
    }
}
