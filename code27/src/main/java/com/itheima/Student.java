package com.itheima;

import java.util.Objects;

public class Student {
    private  String name;
    private  Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    public Student(String item) {
        this.name =item.split(",")[0];
        this.age = Integer.parseInt(item.split(",")[1]);
    }
    public Student() {
    }


    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }
    public  String geNameAndAge(){
        return  name + "-" + age;
    }


    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        if(age>18 && age< 20 )   this.age = age; else throw  new RuntimeException();


    }

}
