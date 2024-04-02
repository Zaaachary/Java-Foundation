package com.zrawberry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Human greatPersonTom = new Human();
        greatPersonTom.setName("ChatGPT");
        System.out.println(greatPersonTom.getName());
        greatPersonTom.setAge(1);
        System.out.println(greatPersonTom.getAge());
    }
}


class Human {
    private String name;
    private int age;

    public Human() {
        // 重载构造函数（不带参数）
        this.name = "unknown";
        this.age = 0;
    }

    public Human(String name, int age) {
        // 构造函数无需返回值，如果改成 Person 则会提示需要返回值
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
        System.out.println("set name to " + name);
    }
    public void setAge(int age){
        this.age = age;
        System.out.println("set age to " + age);
    }

}