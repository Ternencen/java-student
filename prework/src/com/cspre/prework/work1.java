package com.cspre.prework;

public class work1 {
    public static void main(String[] args) {
        //count统计5位回文数个数
        int count = 0;
        //num1、num2、num4、num5分别表示个位、十位、百位
        for(int num1 = 1;num1 < 10;num1++)
            for(int num2 = 0;num2 < 10;num2++)
                for(int num3 = 0;num3 < 10;num3++){
                    System.out.print(num1 + "" + num2 + "" + num3 + "" + num2 + "" + num1 + "  ");
                    count++;
                    if(count % 10 == 0){
                        System.out.println();
                    }
                }
        System.out.println("回文数个数是：" + count );
    }
}
