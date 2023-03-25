package com.cstern.practice.array;

import java.util.Arrays;

/*
求数组最大值
 */
public class Demo03 {
    public static void main(String[] args) {
        int[] a = {1,3,5,6,7,4};
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println(Arrays.toString(a));
    }
}