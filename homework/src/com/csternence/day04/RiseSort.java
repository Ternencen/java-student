package com.csternence.day04;

import java.util.Arrays;

/**
 * @author Ternence
 * @date 2023-03-24 20:24
 * @description
 * 随意给出一个长度为10的int数组，然后升序排列它。
 * 注：
 * 如果想自己手写排序实现，可以使用最简单的冒泡排序或者选择排序。（简单的算法知识，不会就百度一下）
 * 排序对于数组而言是非常常见的操作，Java源码工具类中，早有对应的实现，比如Arrays.sort。
 * 请百度查询一下，不需要了解它具体怎么实现的（实际上它使用的是变异的双端快速排序算法），会用即可。
 * （百度并学习是非常重要的能力，我们不可能在课堂上学会所有的知识）
 */
public class RiseSort {
    public static void main(String[] args) {
        int[] array = {1,3,6,4,8,6,12,15,31,10};
        // 工具类Arrays.sort
        // Arrays.sort(array);
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    // 冒泡排序
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
