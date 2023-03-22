package com.cspre.prework;

import java.util.Scanner;

public class Work26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int keyBoard = input.nextInt();
        int num = 0;
        int sum = 0;
        while(keyBoard / 10 != 0){
            num = keyBoard % 10;
            keyBoard /= 10;
            sum += num;
        }
        sum += keyBoard;
        System.out.println("各位数字之和为" + sum);
    }
}
