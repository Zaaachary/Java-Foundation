package com.zrawberry.Sacnner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("use nextLine method");

        if (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            System.out.println(str);
        }
    }
}
