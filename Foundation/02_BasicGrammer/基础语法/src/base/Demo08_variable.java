package base;

public class Demo08_variable {

    // 类变量
    static double salary = 2500;

    // 属性

    // 实例变量：从属于对象
    String name;
    int age;

    // main 方法
    public static void main(String[] args) {

        // 局部变量;
        int i = 10;
        System.out.println(i);

        // 调用实例变量
        Demo08_variable demo = new Demo08_variable();
        System.out.println(demo.age);

        // 调用类变量
        System.out.println(demo.salary);
    }

    // 其他方法
    public void add() {

    }
}
