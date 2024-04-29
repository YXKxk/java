package com.itheima;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String s = scanner.nextLine();
            try {
                student.setName( s.split(" ")[0]);
                student.setAge(Integer.parseInt(s.split(" ")[1]));
            } catch (NumberFormatException e) {
              e.printStackTrace();
            }catch (NameFormatException e){
                e.printStackTrace();
            }catch (AgeOutOfBoundsException e){
                e.printStackTrace();
            }
            System.out.println(student);
        }
    }
}