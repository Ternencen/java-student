package com.cspre.prework;

public class work14 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 28;
        int max1 = 0;
        int max2 = 0;
        //if比较最大值
        if(a >= b)
            max1 = a;
        else if(b <= c) {
            max1 = c;
        }else
            max1 = b;
        System.out.println("三个数中最大值是" + max1);
        //三目运算求最大值
        max2 = a >= b ? a : b;
        max2 = max2 >= c ? max2 : c;
        System.out.println("三个数中最大值是" + max2);
    }
}
