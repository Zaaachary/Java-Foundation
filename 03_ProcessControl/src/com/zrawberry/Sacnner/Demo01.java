package com.zrawberry.Sacnner;

import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {
        // 创建对象，接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("use next method");
        // 判断有无输入字符串
        if (scanner.hasNext()) {
            // 使用 next 方式接收, 接收空格
            String str = scanner.next();
            System.out.println(str);

        }

        // 使用完关闭 IO 流的类
        scanner.close();
    }
}

