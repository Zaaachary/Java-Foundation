package base;

public class demo04 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;   // 内存溢出
        double d = i;

        System.out.println(i);
        System.out.println(b);
        System.out.println(d); // 自动类型转换
    }
}
