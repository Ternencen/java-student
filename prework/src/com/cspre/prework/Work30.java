package com.cspre.prework;

public class Work30 {
    public static void main(String[] args) {
        double price1 = 0;//优惠价price1
        double price2 = 0;//折扣价price2
        double money = 0;
        price2 = (24 + 8 + 3) * 0.8;
        price1 = 16 + 8 + 3;
        money = (price1 > price2 ? price2 : price1);
        System.out.println("最少要花" + money);
    }
}
