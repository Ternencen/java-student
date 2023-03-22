package com.cspre.prework;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        int grade = input.nextInt();
        if(grade >= 90){
            System.out.println("成绩优秀");
        }else if(grade >= 80){
            System.out.println("成绩良好");
        }else if(grade >= 70) {
            System.out.println("成绩中等");
        }else if(grade >= 60) {
            System.out.println("成绩及格");
        }else
            System.out.println("成绩不及格");
    }
}
