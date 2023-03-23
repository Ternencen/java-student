package com.csternence.day03;

import java.util.Arrays;

/*
定义一个String数组，输出该数组的长度，并用多种方式遍历打印数组元素（常见的方式遍历即可）
 */
public class Work04 {
    public static void main(String[] args) {
        String[] str = {"ab" , "cd" , "ef"};
        System.out.println("数组长度为" + str.length);
        forPrint(str);
        strongForPrint(str);
        arraysPrint(str);
    }
    // for遍历打印数组元素
    public static void forPrint(String[] a) {
        for (int i = 0; i < a.length; i++) {
            if(i == 0) {
                System.out.print("[");
            }
            System.out.print(a[i]);
            System.out.print(",");
        }
        System.out.print("\b]");
    }
    // 增强for打印数组元素
    public static void strongForPrint(String[] a) {
        System.out.print("[");
        for (String s : a) {
            System.out.print(s);
            System.out.print(",");
        }
        System.out.print("\b]");
    }
    // 工具类打印数组元素
    public static void arraysPrint(String[] a) {
        System.out.println(Arrays.toString(a));
    }
}
