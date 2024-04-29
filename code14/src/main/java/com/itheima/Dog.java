package com.itheima;

public class Dog  extends  Animal{
    public void lookHome(){
        System.out.println("看家");
    }

    public Dog() {
    }

    public Dog(String color, int age) {
        super(color, age);
    }
}
