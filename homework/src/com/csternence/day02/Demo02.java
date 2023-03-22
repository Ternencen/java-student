package com.csternence.day02;
/*
将Demo01要求用方法实现
 */
public class Demo02 {
    public static void main(String[] args) {
        int result1 = getSum(10,20);
        System.out.println("result1=" + result1);

        int result2 = getSum(111,222);
        System.out.println("result2=" + result2);

        int result3 = getSum(333,444);
        System.out.println("result3=" + result3);
    }
    public static int getSum(int a,int b) {
        return a + b;
    }
}
