package com.cstern.practice;

import java.util.Arrays;

/*
数组逆序
 */
public class Demo04 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    public static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }
}
