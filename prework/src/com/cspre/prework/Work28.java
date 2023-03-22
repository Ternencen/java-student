package com.cspre.prework;

import java.util.Scanner;

public class Work28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("情输入一大于0的数：");
        int num = input.nextInt();
        double sum = 0;
        double tmp = 0;
        if(num % 2 == 0){
            for(int i = 2;i <= num;i += 2){
                tmp = 1.0 / i;
                sum += tmp;
            }
            System.out.println("结果为" + sum);
        }else{
            for(int j = 1;j <= num;j += 2){
                tmp = 1.0 / j;
                sum += tmp;
            }
            System.out.println("结果为" + sum);
        }
    }
}
