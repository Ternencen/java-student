package com.cstern.practice;
/*
定义一个方法，求圆的面积：

1. 方法参数:半径 (radius)
2. 圆周率:3.14（获取用Math.PI获取）
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println("圆的面积为：" + areaOfCircle(2));
        int a = 1;
        System.out.println(a++);
    }
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
}
