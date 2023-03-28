package com.csternence.day08;

/**
 * @author Ternence
 * @date 2023-03-28 20:30
 * @description
 *
 */
public class TestStaticDemo01 {
    public static void main(String[] args) {
        staticMethod(); // 9.执行main方法
    }

    static TestStaticDemo01 ts = new TestStaticDemo01(); // 1.类加载过程静态成员赋值 类初始化完成前就可以创建对象了 6.完成对象创建

    static {
        System.out.println("静态代码块");// 7.继续往下执行 静态代码块
    }

    {
        System.out.println("构造代码块");// 3.执行构造代码块
    }

    public TestStaticDemo01() { // 2.调用TestStaticDemo无参构造方法
        System.out.println("无参构造器"); // 5.执行无参构造方法
        System.out.println("a=" + a + ",b=" + b);
    }

    public static void staticMethod() {
        System.out.println("静态成员方法"); // 10.执行静态成员方法 （静态成员方法在调用时才会执行）
    }

    int a = 666; // 4.成员变量显式赋值
    static int b = 777; // 8.执行静态成员变量显式赋值
}
