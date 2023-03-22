package com.cspre.prework;

import java.util.Scanner;

public class work18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        while(num % 9 == 0){
            num = num / 9;
            count ++;
        }
        System.out.println("该数可以被" + count + "个9整除");
    }
}
