package com.cspre.prework;

public class work17 {
    public static void main(String[] args) {
        double height = 100;
        double sum = 0;
        for(int i = 1;i <= 10;i++){
            sum += height;
            height = height / 2;
            sum += height;
        }
        System.out.println("第10次反弹高度为" + height + "米");
        System.out.println("共经过" + sum  + "米");
    }
}
