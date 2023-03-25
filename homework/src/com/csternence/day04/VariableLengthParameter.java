package com.csternence.day04;

/**
 * @author Ternence
 * @date 2023-03-24 19:32
 * @description
 * 可变参数练习
 * 可变参数的本质是数组，完成下列需求：
 * 求不限定个数参数的最大值（要求使用可变参数，使用int类型即可）
 * 注：纯粹语法练习,可变参数直接当数组处理即可.
 */
public class VariableLengthParameter {
    public static void main(String[] args) {
        int max = getMax(1,2,3,4,5);
        System.out.println("最大值为：" + max);
    }

    public static int getMax(int... a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
