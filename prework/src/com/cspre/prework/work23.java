package com.cspre.prework;

public class work23 {
    public static void main(String[] args) {
        int mult = 0;
        int count = 0;
        int j = 1;//记录i的位数
        int tmp = 0;
        for(int i = 1;i < 10000;i++){ //循环扫描10000以内的数
            mult = i * i;
            tmp = i;
            j = 1;
            while(tmp / 10 != 0){ //找到i的位数
               tmp = tmp / 10;
               j++;
            }
            if(mult % Math.pow(10,j) == i){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("自首数个数为" + count);
    }
}
