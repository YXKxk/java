package com.itheima;

public class Person {
    private String name;
    private int age;
    public void keepPet(Animal animal,String something){
        System.out.println(age + "岁的" + name);
        System.out.print(animal.getColor() + ","+animal.getAge()+",");
        animal.eat(something);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
