package com.cstern.practice.objectbasic.calss_loading_exercise;

/**
 * @author Ternence
 * @date 2023-03-26 16:49
 * @description
 * 类加载练习二
 */
public class TestStaticDemo {
    public static void main(String[] args) {
        staticMethod();
    }

    static TestStaticDemo ts = new TestStaticDemo();

    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("构造代码块");
    }

    public TestStaticDemo() {
        System.out.println("无参构造器");
        System.out.println("a=" + a + ",b=" + b);
    }

    public static void staticMethod() {
        System.out.println("静态成员方法");
    }

    int a = 666;
    static int b = 777;
    static TestStaticDemo ts2 = new TestStaticDemo();
}
