package com.cstern.practice.array;

import java.util.Arrays;

/*
二维数组存储杨辉三角形
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1. 首先，肯定需要声明初始化一个二维数组，由于每个一维数组的长度不同，更好的选择是使用动态初始化格式二。
2. 接下来使用for循环完成每一个一维数组的动态初始化，分配它们的长度。
3. 开始赋值：
   1. 首先为每一个一维数组的首尾元素赋值1
   2. 为第三列之后的元素赋值：元素值 = 上一行同列的元素值 + 上一行上一列的元素值
   注：不要忘记了首尾元素已经赋值过了，不要再重复赋值，导致数组越界。
4. 赋值完毕后，开始按照杨辉三角的格式打印二维数组（实际上就是遍历二维数组），注意格式就行了。
 */
public class YangHuiTriangle {
    public static void main(String[] args) {
        // 使用动态初始化的一种方式 需手动初始化二维数组每一个一维数组，长度可有自己给出，相对灵活
        int[][] storeArray = new int[10][];
        // 如二维数组storeArray01动态初始化表示有5个一维数组，每个一维数组能存储6个元素
        int[][] storeArray01 = new int[5][6];
        System.out.println(storeArray01.length);
        // 手动初始化二维数组——>第0个（第一行）一维数组有1个元素
        //                   ——>第1个（第二行）一维数组有2个元素
        //                   ——>第2个（第三行）一维数组有3个元素
        for (int i = 0; i < storeArray.length; i++) {
            storeArray[i] = new int[i+1];
        }
        for (int i = 0; i < storeArray.length; i++) {
            // 每行第一个元素
            storeArray[i][0] = 1;
            // 每行最后一个元素
            storeArray[i][i] = 1;
        }
        // 为除每行第一与最后元素赋值
        for (int i = 2; i < storeArray.length; i++) {
            for (int j = 1; j <= i - 1; j++) {
                storeArray[i][j] = storeArray[i-1][j] + storeArray[i-1][j-1];
            }
        }
        //printArray01(storeArray);
        printArrat02(storeArray);
    }
    // 打印
    public static void printArray01(int[][] a) {
        // 第一层遍历的时候因为二维数组中的每一个元素都是一个数组，所以遍历应将每个元素(数组)遍历到一个新的数组中
        // 第二层遍历由于第一层遍历完成后，每个元素都是一个一维数组，则只需要使用一个变量来遍历数组中的每个元素，然后进行输出即可
        for (int[] b : a) {
            for (int c : b) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    public static void printArrat02(int[][] a) {
        // 把多维数组拆分为一维数组进行操作
        for (int[] b : a) {
            System.out.println(Arrays.toString(b));
        }
    }
}
