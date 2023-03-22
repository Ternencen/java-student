package com.csternence.day02;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

/*
方法是Java代码中最常用的语法结构，这里对方法的语法做一下练习。
在使用方法或者想要写一个方法时，首先要考虑的是方法需要的参数是什么数据类型，需要几个（形式参数），再考虑方法需要返回什么结果（返回值类型）。在调用方法时，需要搞清楚具体传入什么数值（实际参数）。
实现以下需求：
使用for循环遍历n以内(包括n)的奇数，并计算所有的奇数的和并输出。
打印倒三角形，并且行数（line）是可控制的。比如我想打印6行的倒三角形，则如下图：
******
*****
****
***
**
*
根据键盘录入打印nn乘法表，n是可变的。
键盘录入一个int数字，判断它是奇数还是偶数。
根据键盘录入打印n行m列井号，n和m是可变的。
（扩展题）输出前n个数当中的所有素数，并统计个数。注：可以百度查一下如何求素数，该题作为扩展题，可以不做。
 */
public class Demo05 {
    public static void main(String[] args) {
        // 需求1
        int n = 10;
        System.out.println(n + "以内（包括" + n + "）的奇数和为：" + getSumOddNumber(n));

        // 需求2
        int line = 6;
        printInvertTriangle(line);

        // 需求3
        System.out.println("3.请输入要打印的乘法表位数：");
        Scanner sc = new Scanner(System.in);
        printMulTable(sc.nextInt());

        // 需求4
        System.out.println("4.请输入一个非0数字：");
        judgeParity(sc.nextInt());

        // 需求5
        System.out.println("5.请输入要打印井号行数与列数：");
        printPoundKey(sc.nextInt(),sc.nextInt());

        // 需求6
        System.out.println("6.请输入要处理的n值：");
        printPrimeNumber(sc.nextInt());
    }

    // n以内（包括n）所有奇数和
    public static int getSumOddNumber (int n) {
        int sumOddNumber = 0;
        for (int i = 1; i <= n; i+= 2) {
            sumOddNumber += i;
        }
        return sumOddNumber;
    }

    // 打印倒三角形
    public static void printInvertTriangle (int line) {
        for (int i = line; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 键盘录入打印nn乘法表
    public static void printMulTable (int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "×" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }

    // 键盘录入数字判断奇偶
    public static void judgeParity (int number) {
        if(number % 2 == 0) {
            System.out.println("录入数字为偶数");
        }else {
            System.out.println("录入数字为奇数");
        }
    }

    // 打印n行m列井号
    public static void printPoundKey (int n ,int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    // 输出前n个数当中所有素数，并统计个数
    public static void printPrimeNumber (int n ) {
        int count = 1;
        if(n == 1) {
            System.out.println(1);
            System.out.println("素数个数" + count);
            return;
        }else {
            System.out.println(1);
            for (int i = 2; i <= n; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        break;
                    } else if (j == i - 1) {
                        System.out.println(i);
                        count++;
                    }
                }
            }
            System.out.println("前" + n + "个数中素数个数为" + count);
        }
    }
}
