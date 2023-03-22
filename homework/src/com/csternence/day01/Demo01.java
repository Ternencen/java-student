package com.csternence.day01;

import java.util.Scanner;
/*
Scanner基础使用练习
键盘输入某个学生的三门学科（数学，语文，英语）成绩，然后分别求出三科成绩的平均分，最低分，最高分，三科的总分。
注：
代码直接写在main()方法中即可，注意命名规范！
注意录入数据的数据类型。
注意命名规范。
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int highestScore = 0;
        int lowestScore = 0;
        int averageScore = 0;
        int totalScore = 0;
        // 输入数学成绩
        System.out.println("请输入数学成绩：");
        int math = sc.nextInt();
        // 输入语文成绩
        System.out.println("请输入语文成绩：");
        int chinese = sc.nextInt();
        // 输入英语成绩
        System.out.println("请输入英语成绩：");
        int english = sc.nextInt();
        totalScore = math + chinese + english;
        if(math >= chinese) {
            highestScore = (math >= english) ? math : english;
            lowestScore = (chinese <= english) ? chinese : english;
        }else {
            highestScore = (chinese >= english) ? chinese : english;
            lowestScore = (math <= english) ? math : english;
        }
        System.out.println("三科成绩的平均分：" + (totalScore / 3.0));
        System.out.println("三科成绩的最低分：" + lowestScore);
        System.out.println("三科成绩的最高分：" + highestScore);
        System.out.println("三科成绩的总分：" + totalScore);

    }
}
