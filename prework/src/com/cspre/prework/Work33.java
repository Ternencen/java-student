package com.cspre.prework;
//计算 2 + 4 + 6 + … + 100 的值。
public class Work33 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 2;i <= 100;i += 2) {
            sum += i;
        }
        System.out.println(sum);
        int[] num = {1,2,3,4};
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
    }
}
