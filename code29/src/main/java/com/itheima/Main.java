package com.itheima;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("code29\\a.txt");
        FileOutputStream fo = new FileOutputStream("code29\\c.txt");
        int f;
        while ((f = fi.read(new byte[1024 * 1024 * 5])) != -1){
            fo.write(f);
        }
        fo.close();
        fi.close();
    }

    }
