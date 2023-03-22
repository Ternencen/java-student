package com.cspre.prework;

//循环输入一个不为0的数进行累加，直到输入的数字为0，结束循环并最后输出累加的结果。

import java.util.Scanner;

public class Work35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = input.nextDouble();
        while(sum != 0){
            double number = input.nextDouble();
            if(number == 0){
                break;
            }
            sum += number;
        }
        System.out.println(sum);
    }
}
