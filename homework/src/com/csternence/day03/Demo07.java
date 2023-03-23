package com.csternence.day03;

import java.util.Arrays;

/*
遍历数组
 */
public class Demo07 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        forTraverse01(a);
        forTraverse02(a);
        traverse(a);
    }

    // for循环遍历
    public static void forTraverse01(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(",");
        }
        // 最后打印多出来的“，”可用退格符\b
        System.out.println("\b");
    }
    // 增强for循环
    public static void forTraverse02(int[] a) {
        for (int i : a) {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println("\b");
    }
    // Arrays.toString打印
    public static void traverse(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
