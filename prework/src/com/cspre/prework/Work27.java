package com.cspre.prework;

public class Work27 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;//记录数字是否含7
        int tmp = 0;
        int mark = 0;//记录是否跳出while循环
        for(int i = 1;i < 101;i++){
            mark = 0;
            if(i % 7 == 0 ){
                continue;
            }
            tmp = i;
            while(tmp / 10 != 0){
                num = tmp % 10;
                tmp /= 10;
                if(num == 7){
                    mark = 1;
                    break;
                }
            }
            if(tmp == 7 || mark == 1){
                continue;
            }
            sum += i;
            System.out.println(i);
        }
        System.out.println("和为" + sum);
    }
}
