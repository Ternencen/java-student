package com.cspre.prework;

public class work15 {
    public static void main(String[] args) {
        int num = 0;
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            if (Math.sqrt(i + 100) % 1 == 0 & Math.sqrt(i + 268) % 1 == 0) {
                num = i;
                count++;
                System.out.println(num);
            }
        }
        System.out.println("这样的数有" + count + "个");
    }
}
