package com.csternence.day03;

import java.util.Scanner;

/*
数组基本使用练习
定义一个double数组用来存放学生成绩，然后键盘录入10位同学的成绩并存入数组，求这10位同学成绩的平均值。（提示：这里可以用循环来完成十次键盘录入）
注：
请合理使用方法，不要胡子眉毛一把抓把代码全部写在main方法里。
数组遍历的方式，比如for、增强for或者使用工具类等等。
 */
public class Work03 {
    public static void main(String[] args) {
        double[] stuScore = new double[10];
        scanScore(stuScore);
        System.out.println("10位同学平均成绩为" + averageScore(stuScore));
    }
    // 录入成绩
    public static void scanScore(double[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入10位同学成绩：");
        for (int i = 0; i < 10; i++) {
            double score = sc.nextDouble();
            a[i] = score;
        }
    }
    // 计算成绩平均值
    public static double averageScore(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / 10;
    }
}
