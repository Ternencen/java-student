package com.csternence.day04;

import java.util.Arrays;

/**
 * @author Ternence
 * @date 2023-03-24 20:40
 * @description
 * 首先准备两个数组（简单起见，用两个普通int数组即可）将这两个数组合并。
 * 所谓合并就是将两个数组中的元素合并成一个新数组。
 * 比如对于数组1[1,2,3]和数组2[2,2,2]
 * 合并的结果是新数组[1,2,3,2,2,2]
 * 注：
 * 数组合并也是很常见的操作，实际开发中有很多现成的手段去完成它。由于有些手段是超纲的，所以这里不再细表。
 * 如果后续工作中碰到了，可以再百度学习一下。目前就先考虑自己手写实现就可以了。
 */
public class MergeArray {
    public static void main(String[] args) {
        int[] array01 = {1,2,3};
        int[] array02 = {2,2,2};
        System.out.println(Arrays.toString(mergeArray(array01,array02)));
    }

    private static int[] mergeArray(int[] array01, int[] array02) {
        int sumLength = array01.length + array02.length;
        int[] result = new int[sumLength];
        // 先把array01复制进result再把array02复制进result
        for (int i = 0; i < result.length; i++) {
            if(i < array01.length) {
                result[i] = array01[i];
            }else {
                result[i] = array02[i - array01.length];
            }
        }
        return result;
    }
}
