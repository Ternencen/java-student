package com.csternence.day04;

import java.util.Scanner;

/**
 * @author Ternence
 * @date 2023-03-24 21:54
 * @description
 * 二维数组不是必须要掌握的知识点，对于JavaWeb实际开发而言，它也没有太大的作用。
 * 但就像嵌套for循环一样，二维数组毕竟比一维数组更复杂一些，但本质不变。
 * 练习二维数组，可以锻炼逻辑思维能力，建议大家去自学一下，并且在时间充裕的情况下，完成下列两道题。
 * 如果时间不多，建议不要做这两道二维数组题目！！！
 * 题目1
 * 某公司该年度，每个季度的销售额（单位：万元）如下：
 * 第一季度：30,66, 48 第二季度：10, 33, 20 第三季度: 10,99,103 第四季度: 9,18,27
 * 请使用二维数组存储数据 并计算： 1，每个季度平均销售额 2，年度销售总额
 * 题目2
 * 已知有3个班级（一班，二班，三班）分别有3人，2人，5人
 * 键盘录入每个班级的学生的成绩，并使用二维数组存储数据
 * 然后计算： 每个班级的平均成绩，每个班级中的最高成绩和最低成绩，并输出。
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        System.out.println("__________以下为题目一__________");
        int[][] sales = {{30,66,48},{10,33,20},{10,99,103},{9,18,27}};
        work01(sales);
        double[][] score = new double[3][];
        score[0] = new double[3];
        score[1] = new double[2];
        score[2] = new double[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("__________以下为题目二__________");
        // 循环输入成绩
        for (int i = 0; i < score.length; i++) {
            System.out.print("请输入" + (i+1) +"班学生成绩：");
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = sc.nextDouble();
            }
        }
        work02(score);
    }
    // 题目1
    public static void work01(int[][] sales) {
        double AverageSales = 0;
        int totalSales = 0;
        int tempSum = 0;
        for (int quarter = 0; quarter < sales.length; quarter++) {
            tempSum = 0;
            for (int month = 0; month < 3; month++) {
                tempSum += sales[quarter][month];
                totalSales += sales[quarter][month];
            }
            AverageSales = tempSum / 3.0;
            System.out.println("第" + (quarter + 1) + "季度平均销售额为" + AverageSales);
        }
        System.out.println("年度销售总额为：" + totalSales);
    }
    // 题目2
    public static void work02(double[][] score) {
        double sum;
        for (int i = 0; i < score.length; i++) {
            sum = 0;
            double highestScore = score[i][0];
            double lowestScore = score[i][0];
            for (int j = 0; j < score[i].length; j++) {
                if(score[i][j] > highestScore) {
                    highestScore = score[i][j];
                }
                if(score[i][j] < lowestScore) {
                    lowestScore = score[i][j];
                }
                sum += score[i][j];
            }
            System.out.println((i + 1) + "班平均成绩为：" + (sum / score[i].length));
            System.out.println((i + 1) + "班最高成绩为：" + highestScore);
            System.out.println((i + 1) + "班最低成绩为：" + lowestScore);
        }
    }
}
