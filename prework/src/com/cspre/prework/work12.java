package com.cspre.prework;

import java.util.Scanner;

public class work12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入n的值：");
        int n = input.nextInt();
        int a = n;
        int sum = 0;
        for (; n > 0; n--) {
            sum += n;
        }
        System.out.println("前" + a + "个数的和是" + sum);
    }
}
