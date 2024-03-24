package com.zrawberry.Sacnner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        // 数据
        int i = 0;
        float f = 0.0f;

        System.out.println("请输入整数或小数");

        if (scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("输入的是整数：" + i);
        }
        else if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("输入的是小数：" + f);
        }


        scanner.close();
    }
}
