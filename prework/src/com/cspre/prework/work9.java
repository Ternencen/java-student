package com.cspre.prework;

public class work9 {
    public static void main(String[] args) {
        int num = 0;
        int count = 0;
        //a,b,c分别代表个位、十位、百位
        for(int a = 1;a < 5;a++){
            for(int b = 1;b < 5;b++) {
                for (int c = 1; c < 5; c++) {
                    if (a == b || a == c || b == c) {
                        continue;
                    }
                    System.out.println(a + "" + b + "" + c);
                    count++;
                }
            }
         }
        System.out.println("能组成" + count +"个不相等且无重复数字的三位数");
    }
}
