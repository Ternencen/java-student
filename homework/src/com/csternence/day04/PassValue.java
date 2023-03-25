package com.csternence.day04;

/**
 * @author Ternence
 * @date 2023-03-24 18:38
 * @description Java有且仅有值传递，Java中的方法不能直接改变实参本身
 * 对于下列代码：
 * public static void main(String[] args) {
 * int a = 10;
 * int b = 20;
 * method(a, b);
 * System.out.println("a = " + a);
 * System.out.println("b = " + b);
 * }
 * public static void method(int a, int b) {
 * a *= 2;
 * b *= 2;
 * }
 * 思考以下问题：
 * 对于以上Java代码，method()方法可以把a，b的取值变为原先的2倍吗？如果不能，为什么？
 * 上述main方法不变，修改method方法实现，让程序输出：
 * a = 20
 * b = 40
 * 如何实现呢？
 */
public class PassValue {
    public static void main(String[] args) {
        // 题目中的代码method()方法不能把a,b的取值变为原先2倍
        // 原因是Java中只有值传递，传入method方法中的是实参的拷贝，方法改变的是实参拷贝的值
        int a = 10;
        int b = 20;
        method(a,b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void method(int a,int b) {
        a *= 2;
        b *= 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.exit(0);
    }
}
