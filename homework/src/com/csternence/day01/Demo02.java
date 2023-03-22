package com.csternence.day01;

import java.util.Scanner;

/*
Scanner基础使用练习
使用Scanner依次接收以下三种数据类型的值：
int类型
String类型
double类型
接收三个值后，再计算：
求和：int + double
拼接字符串：int + double + String
分别接收计算结果后，输出该计算结果。
注：
使用Scanner时，注意不要混用next系列和nextLine方法。（原因可以查看详细文档说明）
代码直接全部写在main方法中即可。
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请依次输入int类型，String类型，double类型的值：");
        // a接收int类型
        String a = sc.nextLine();
        // b接收String类型
        String b = sc.nextLine();
        // c接收double类型
        String c = sc.nextLine();
        double sum = Integer.parseInt(a) + Double.parseDouble(c);
        String str = a + c + b;
        System.out.println("求和：int + double结果为：" + sum);
        System.out.println("拼接字符串：int + double + String的结果为：" + str);
    }
}
