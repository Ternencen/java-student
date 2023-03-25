package com.cstern.practice.array;

import java.util.Arrays;

/*
数组的长度是不可以改变的，所以如果想要实现数组元素真正意义上的删除和新增，一般需要使用数组的拷贝。
大致思路是，创建一个新数组,然后拷贝赋值：
1. 首先需要明确新数组的长度，初始化这个新数组。
2. 然后遍历原先的数组，过滤掉（或者新增）一些元素，给新数组赋值。
 */
public class CopyArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[6];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[5] = 6;
        System.out.println(Arrays.toString(b));
    }
}
