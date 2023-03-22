package com.cspre.prework;

import java.util.Scanner;

public class Work29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input.nextInt();
        System.out.print("请输入月份：");
        int month = input.nextInt();
        int day = 0;
        switch (month){
            case 1: case 3:case 5:case 7:case 8:case 10:case 12:
                day = 31;
                break;
            case 4:case 6:case 9:case 11:
                day = 30;
                break;
            case 2:
            {
                if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)) {
                    day = 29;
                    break;
                }
                else {
                    day = 28;
                    break;
                }
            }
        }
        System.out.println("这个月应该有" + day + "天");
    }
}
