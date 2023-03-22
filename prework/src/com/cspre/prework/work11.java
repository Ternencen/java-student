package com.cspre.prework;

public class work11 {
    public static void main(String[] args) {
        //a为分母，b为分子
        double a = 1;
        double b = 2;
        double c = 0;
        double result = 0;
        for (int i = 1; i < 21; i++) {
            result += b / a;
            c = b;
            b += a;
            a = c;
        }
        System.out.println("数列前20项之和为" + result);
    }

}
