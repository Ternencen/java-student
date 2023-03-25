package com.csternence.day04;

/**
 * @author Ternence
 * @date 2023-03-25 8:16
 * @description
 * 十进制转二进制用递归实现
 */
public class Recurison02 {
    public static void main(String[] args) {
        decimalToBinary(2147483647);
    }
    public static void decimalToBinary(int n) {
        //如果商是0了，表示递归需要结束了
        if (n >= 2) {
            //只要商不是0，就继续递归
            decimalToBinary(n / 2);
        }
        System.out.print(n % 2);
    }
}
