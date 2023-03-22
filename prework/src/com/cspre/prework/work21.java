package com.cspre.prework;

import java.util.Scanner;

public class work21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = 0;
        if(a >= b){
            max = a;
        }else if(b >= c){
            max = b;
        }else{
            max = c;
        }
        System.out.println("最大值为" + max);
    }
}
