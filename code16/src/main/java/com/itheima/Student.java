package com.itheima;

import java.util.Arrays;
import java.util.Objects;

public class Student implements  Cloneable{
    private  String name;
    private  int age;
private  int[] ages;

    public Student(String name, int age, int[] ages) {
        this.name = name;
        this.age = age;
        this.ages = ages;
    }

    public int[] getAges() {
        return ages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.deepEquals(ages, student.ages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, Arrays.hashCode(ages));
    }

    public void setAges(int[] ages) {
        this.ages = ages;
    }

    public Student() {
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ages=" + Arrays.toString(ages) +
                '}';
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
