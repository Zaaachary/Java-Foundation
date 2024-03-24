package opterator;

public class Demo02 {
    public static void main(String[] args) {
        long a  = 12312412515425135L;
        int  b = 123;
        short c = 10;
        byte d = 9;

        System.out.println(a+b+c+d);    // long+int -> long
        System.out.println(b+c+d);      // int+short+byte -> int
        System.out.println(c+d);        // short+byte -> int

        System.out.println((double)c+d);// double + byte -> double
    }
}
