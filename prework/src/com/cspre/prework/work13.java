package com.cspre.prework;

import java.util.Scanner;

public class work13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入n的值：");
        int n = input.nextInt();
        int a = n;
        int mult = 1;
        for (; n > 0; n--) {
            mult *= n;
        }
        System.out.println("前" + a + "个数的积是" + mult);
    }
}
