package com.cspre.prework;

import java.util.Scanner;

public class work19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("为偶数");
        } else
            System.out.println("为奇数");
    }
}
