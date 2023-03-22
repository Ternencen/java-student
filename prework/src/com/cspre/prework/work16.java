package com.cspre.prework;

public class work16 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        //100以内所有奇数和
        for(int i = 1;i < 100;i += 2){
            sum1 += i;
        }
        System.out.println("100以内奇数和" + sum1);
        for (int j = 2;j < 100;j += 2){
            sum2 += j;
        }
        System.out.println("100以内偶数和" + sum2);
    }
}
