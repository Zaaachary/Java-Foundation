package com.zrawberry.Sacnner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        while(scanner.hasNextDouble()) {
            // 无double输入则终止, e.g. Ctrl D

            double x = scanner.nextDouble();
            count ++;
            sum = sum + x;
        }

        System.out.println(count + "个数的和为" + sum);
        System.out.println(count + "个数的均值为" + (sum/count));

        scanner.close();

    }
}
