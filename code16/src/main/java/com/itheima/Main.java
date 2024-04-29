package com.itheima;

import com.google.gson.Gson;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        String str = "1234567890Java8Java11";
        extracted(str);
    }

    private static void extracted(String str) {

        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher matcher = p.matcher(str);
        while (matcher.find()){

            String group = matcher.group();
            System.out.println(group);
        }


    }
}