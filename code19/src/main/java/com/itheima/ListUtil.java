package com.itheima;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
    private ListUtil() {
    }
    public  static <E>  void  addAll(List<E> list,E...e){
        for (E e1 : e) {
            list.add(e1);
        }
    }
}
