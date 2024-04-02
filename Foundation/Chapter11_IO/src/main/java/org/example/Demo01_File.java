package org.example;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class Demo01_File
{
    public static void main( String[] args ) throws IOException {
        File file1 = new File("./test.txt");
        System.out.println(file1);
        File file2 = new File("./home/test.txt");
        System.out.println(file2.getPath());
        System.out.println(file2.getAbsolutePath()); // 绝对路径
        System.out.println(file2.getCanonicalPath());   // 规范路径，需要函数捕获 IOException
        System.out.println(File.separator); // 根据当前平台打印"\"或"/"
    }
}
