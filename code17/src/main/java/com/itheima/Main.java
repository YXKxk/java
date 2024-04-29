package com.itheima;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.spi.LocaleServiceProvider;

public class Main {
    public static void main(String[] args) throws ParseException {

        LocalDate localDate = LocalDate.of(2002, 9, 13);
        LocalDateTime now = LocalDateTime.now();
        long between = ChronoUnit.DAYS.between(localDate, now);
        System.out.println("between = " + between);

    }


}