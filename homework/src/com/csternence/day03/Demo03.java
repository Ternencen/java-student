package com.csternence.day03;
/*
局部变量生效在方法内
 */
public class Demo03 {
    public static void main(String[] args) {
        int a = 1;
        test01();
        System.out.println(a);
    }
    public static void test01() {
        int a = 2;
        test02();
    }
    public static void test02() {
        int a = 3;
    }
}
