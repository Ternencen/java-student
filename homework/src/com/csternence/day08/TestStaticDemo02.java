package com.csternence.day08;

/**
 * @author Ternence
 * @date 2023-03-28 20:45
 * @description
 */
public class TestStaticDemo02 {
    public static void main(String[] args) {
        staticMethod(); // 17.
    }

    static TestStaticDemo02 ts = new TestStaticDemo02();// 1.  7.

    static {
        System.out.println("静态代码块"); // 8.
    }

    {
        System.out.println("构造代码块"); // 3.  12.
    }

    public TestStaticDemo02() {// 2.  11.
        System.out.println("无参构造器");// 5.  14.
        System.out.println("a=" + a + ",b=" + b);// 6.  15.
    }

    public static void staticMethod() {
        System.out.println("静态成员方法"); // 18.
    }

    int a = 666; // 4.  13.
    static int b = 777; // 9.
    static TestStaticDemo02 ts2 = new TestStaticDemo02();// 10.  16.
}