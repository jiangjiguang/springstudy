package com.jiangjg.jdbc;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by root on 16-4-16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        /*
        Main main = new Main();
        main.test();
        */
    }

    public void test(){
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("jdbc/jdbc.properties");
        System.out.println(inputStream);
    }
}
