package com.cspre.prework;

public class work4 {
    public static void main(String[] args) {
        //num1、num2、num3分别是个位、十位、百位
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        for(int i = 100;i < 1000;i++){
            num1 = i % 10;
            num2 = (i % 100) / 10;
            num3 = i / 100;
            if( i == Math.pow((double)num1,3)+ Math.pow((double)num2,3)+ Math.pow((double)num3,3)){
                System.out.println(i);
            }
        }
    }
}
