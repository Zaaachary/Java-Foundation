package base;

public class demo03 {
    public static void main(String[] args){
        // 整数扩展：

        // 浮点数扩展
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f==d); // false  舍入误差

        float d1 = 12312412541235135135135f;
        float d2 = d1 + 1;
        System.out.println(d1==d2);// true

        // 字符扩展
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println((int)c1);
        System.out.println((int)c2);
        char c3 = '\u0061';
        System.out.println(c3);

        // 字符串扩展  对象、从内存分析
        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa==sb); // false

        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc==sd); // true

        // 布尔值扩展
        boolean flag = true;
        if (flag){
            System.out.println("true");
        }
    }
}
