package com.csternence.day02;

public class Demo03 {
    public static void main(String[] args) {
        // 在main方法中直接或间接调用别的方法
        test1();
        double sum = getSum(1.1,2.2,3.3);
        System.out.println("sum =" + sum);

        // 方法返回值为引用类型
        String s = test3();
        System.out.println(s);
        String str = test4("haha" , "heihei");
        System.out.println(str);
    }
    public static void test1() {
        test2();
        System.out.println("test1");
    }
    public static void test2() {
        System.out.println("test2");
    }
    public static double getSum(double v1,double v2,double v3) {
        return v1 + v2 +v3;
    }
    public static String test3() {
        return "abcd";
    }
    public static String test4(String s1,String s2) {
        return s1 + s2;
    }
}
