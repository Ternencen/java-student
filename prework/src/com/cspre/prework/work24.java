package com.cspre.prework;
/*
将所有钱买饮料再全部卖出，剩余钱再全部买饮料...
 */
public class work24 {
    public static void main(String[] args) {
        int money = 20;
        int bottle = 0;
        while(money >= 3){
            money = money - 3;
            bottle++;
            money++;
        }
        System.out.println("最多可喝到饮料数为" + bottle);
    }
}
