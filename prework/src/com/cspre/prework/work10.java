package com.cspre.prework;

import java.util.Scanner;

public class work10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scan = input.nextInt();
        int i = 10;
        int count = 1;
        while(scan / i != 0){
            i = i* 10;
            count++;
        }
        System.out.println("它是"+ count +"位数");
        while (scan != 0){
            int c = scan % 10;
            System.out.print(c);
            scan = scan /10;
        }
    }
}
