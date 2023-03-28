package com.cstern.practice.array;

import java.util.Arrays;

/*
数组逆序
 */
public class Demo04 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        //reverse01(a);
        reverse02(a);
        System.out.println(Arrays.toString(a));
    }
    // 二分法
    public static void reverse01(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }
    // star end 标记法 当star遇见end则停止
    public static void reverse02(int[] a) {
        int star = 0;
        int end = a.length -1;
        if(star >= end) {
            int temp = 0;
            temp = a[star];
            a[star] = a[end];
            a[end] = a[star];
            star++;
            end--;
        }else {
            return;
        }
    }
}
