package com.itheima;

public class Gril {
    private  String name;
    private  Integer age;
    private  double height;

    public Gril(String name, Integer age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Gril() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Gril{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
