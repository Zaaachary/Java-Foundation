package org.example;

import java.util.Arrays;

/**
 * Hello world!
 */
public class demo01 {
    public static void main(String[] args) {
        InitArray.array01();
        InitArray.array02();
    }
}

class InitArray {
    public static void array01() {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=0; i<ns.length; i++) {
            int n = ns[i];
            System.out.println(n);
        }
    }
    public static void array02() {
        int[] ns = { 1, 4, 9, 16, 25 };
        // for each 循环
        for (int i: ns){
            System.out.println(i);
        }

        System.out.println(Arrays.toString(ns));
    }
}