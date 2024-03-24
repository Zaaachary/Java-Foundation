# Chapter 03 变量、方法、类

[Link](https://codegym.cc/zh/quests/lectures/zh.questsyntax.level02.lecture01)

## 对象交互
“Java 程序员就像设计工程师一样，只是他们不制作蓝图，而是编写类。船舶零件是根据蓝图制造的，而对象是基于类创建的。”

```JAVA
package com.codegym.lesson2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream("c:\data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("c:\result.txt");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
```

## 基本数据类型

原始类型: int, char
复合类型: String
