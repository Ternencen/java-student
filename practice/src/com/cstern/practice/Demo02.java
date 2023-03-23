package com.cstern.practice;

/*
数组静态初始化与动态初始化
 */
public class Demo02 {

    public static void main(String[] args) {
        // 静态初始化
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr);
        outputArray(arr);
        System.out.println(arr.length);
        // 动态初始化
        int[] arr01 = {6, 7, 8, 9, 10};

        // 将arr地址值给arr01
        arr01 = arr;
        // 输出此时arr01所指数组值与arr01地址
        System.out.println(arr01);
        outputArray(arr01);
        // 对arr01数组进行赋值
        arr01[0] = 5;
        arr01[1] = 4;
        arr01[2] = 3;
        arr01[3] = 2;
        arr01[4] = 1;
        System.out.println("输出修改arr01数组值后arr的值与arr01的值");
        outputArray(arr);
        outputArray(arr01);
    }

    public static void outputArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}