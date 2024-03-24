# Chapter 02 Output, String, int


1. Java 程序由类组成。每个类都存储在一个单独的文件中，其文件名称与类名一致。该文件的扩展名为 java。

    “所以，一个程序由一系列带有‘java’文件扩展名的文件组成，每个文件只包含一个类的代码，对吗？”


2. 当我们有许多类文件时，我们会将它们分组到文件夹和子文件夹中。此外，类还会被分组到包和子包中。包和子包的名称必须在类代码中指定，并且这些名称必须与驱动器上的文件夹和子文件夹名称相同。

    “因此，一方面，我们把文件存储在文件夹中，另一方面，类被存储在包中。一个类名还必须与描述该类的文件的名称一致。包名称要与存储该类的文件夹的名称一致。”

3. More Detail:

    “嵌套包的名称用句点分隔，类似于一个链接。”

    “换句话说，假设你有一个名为 Cat 的类，存储在 animals.pets 包中。这意味着：

    硬盘中存在一些文件夹（我们称之为 `src`），其中存储了所有项目文件。

    其中包含一个名为 `animals` 的文件夹，而该文件夹又包含一个名为 `pets` 的子文件夹。

    该 `pets` 文件夹包含一个 `Cat.java` 文件，该文件又包含 `Cat` 类的代码。”

    “是这样的。类和包的结构反映了驱动器上文件夹和文件的结构。如果我们有一个名为 `House.java` 的文件，其存储在 `src/com/houses` 文件夹中， 那么就存在一个名为 House 的类，其存储在 `com.houses` 包中。”


```java
        包名称
package com.futujava.lesson2;
import java.io.IOException;
/**
 * 用户名：普通
 * 日期：12/21/12
 * 时间：11:59
 */
             类名
public class Task1
{
                                                              ⎤
   private static String TEXT = "别开玩笑了";                  ⎥ 类变量
                                                              ⎦
                                                                ⎤
   public static void main(String[] args) throws IOException    ⎥
   {                                                            ⎥
      SCREEN OUTPUT                    单行注释                  ⎥
      System.out.println(TEXT); //显示单个字符串                 ⎥
        多行注释                                                 ⎥
      /*                                                        ⎥
        这是一个多行注释。                                        ⎥
        下面的代码将显示三个相同的字符串。                         ⎥ main() 方法
       */                                                       ⎥
      变量声明                                                   ⎥
      String s = "呵呵呵";                                       ⎥
      方法调用                                                   ⎥
      printTextMoreTimes(s, 3);                                 ⎥
   }                                                            ⎥
                                                                ⎦
                                          方法参数             ⎤
   public static void printTextMoreTimes(String s, int count) ⎥ 方法签名
                                                              ⎦
                                                                ⎤
   {                                                            ⎥
      循环                                                      ⎥
      for (int i = 0; i < count; i++)                           ⎥
      循环体                                                     ⎥ 方法体/方法代码
      {                                                         ⎥
         System.out.println(s);                                 ⎥
      }                                                         ⎥
   }                                                            ⎥
                                                                ⎦
}
```


