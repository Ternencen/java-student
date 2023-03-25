package com.csternence.day04;

import java.util.Scanner;

/**
 * @author Ternence
 * @date 2023-03-24 19:37
 * @description
 * 练习使用递归
 * 递归在实际开发中用途并不广泛，但我们仍有必要学习它的基本使用。
 * 这道题目如果想不明白，那就百度一下吧。
 *  使用递归，把十进制正整数（N>=0）转换成二进制数
 */
public class Recursion01 {
    public static void main(String[] args) {
        // 十进制转二进制——》除2取余 逆序排列
        System.out.print("请输入一个正整数：" );
        Scanner sc = new Scanner(System.in);
        int decimalInt = sc.nextInt();
        // int大小为4B 最多32位，最后一位record[32]保存数组有效长度
        int[] record = new int[33];
        transform(decimalInt,0,record);
        // 得到的数组将有效值倒序复制进新数组 新数组值为最终结果
        int[] result = new int[record[32] + 1];
        for (int i = record[32]; i >= 0; i--) {
            result[record[32] - i] = record[i];
        }
        // 输出最终结果
        System.out.print(decimalInt + "转2进制结果为：0" );
        for (int i : result) {
            System.out.print(i);
        }
    }

    // 十进制转二进制
    public static int[] transform(int decimalInt,int index,int[] record) {
        if(decimalInt / 2 == 0) {
            record[index] = 1;
            record[32] = index;
            return record;
        }
        record[index] = decimalInt % 2;
        index++;
        return transform(decimalInt / 2,index,record);
    }
}
