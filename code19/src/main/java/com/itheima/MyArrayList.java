package com.itheima;

import java.util.Arrays;

public class MyArrayList<E> {
    Object[] list = new Object[10];
    int size;
    public boolean  add(E e){
        list[size] = e;
        size++;
        return true;
    }
    public E get(int index){
        return (E)list[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }
}
