package com.cspre.prework;

import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要打印的等腰三角形行数：");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int blank = 1; blank <= num - i; blank++)
                System.out.print(" ");
            for (int star = 1; star <= i * 2 - 1; star++)
                System.out.print("*");
                System.out.println();
        }
    }
}
