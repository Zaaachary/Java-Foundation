# Chapter 1 - Introduction

[Course Link](https://codegym.cc/zh/quests/lectures?quest=QUEST_JAVA_SYNTAX&level=0)


Java 中的程序由类组成。 可能有数万个类。最小程序含有一个类。对于每个类，都创建一个单独的文件。文件的名称与类的名称相匹配

“假设你决定创建一个描述住宅 (home) 的类。你需要创建一个将保存在 Home.java 文件中的 Home 类。”

“如果你想在程序中描述一只猫 (cat) ，那么你必须创建一个 Cat.java 文件，并在文件中声明 Cat 类，等等。”

类主体可能包含多个变量（也称为数据）和方法（‘函数’），

```java
public class Home {
    int a;
    int b;

    public static void main(String[] args){
        System.out.println("1");
    }

    public stattic double pi() {
        return 3.14;
    }
}
```

一个最小程序必须至少包含一个类，该类必须包含至少一个方法/函数才能使程序运行。这个方法必须命名为‘main’。

```java
public class Home
{
    public static void main (String[] args)
    {
    }
}
```

每个变量都有三个重要的属性：类型、名称和值。

```java
int a;

String s;

double c;

int x = 333;
String s = "阿米戈" + x;
```
“添加字符串和数字时，结果始终是一个字符串。”



`System.out.println("阿米"+"戈");`



## 什么是编译器？

c++ code -> 编译器 -> 机器语言

Java code -> Java 编译器 -> 字节码 -> JVM -> 机器代码

## 注释

```java
/*
    中间的部分将被忽视
*/

// 注释一行

```
