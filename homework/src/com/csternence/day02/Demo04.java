package com.csternence.day02;
/*
实参的自动类型转换小范围-》大范围
 */
public class Demo04 {
    public static void main(String[] args) {
        byte a = 1;
        test1(a);

        short b = 2;
        test1(b);
    }
    public static void test1 (int a) {
        System.out.println("a = " + a);
    }
}
