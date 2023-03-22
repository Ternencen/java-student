package com.cspre.prework;

import java.util.Scanner;
/*
分解质因数：
对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：

(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。

(2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。

(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
 */
public class work20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int n = 2;
        System.out.print(num + "=" );
        for(int i = 1;i <51;i++){
            if(num == n){
            System.out.print(n);
            break;
            }else if(num > n & num % n == 0 ){
            System.out.print(n + "*");
            num = num / n;
            }else{
            n += 1;
            }
        }

    }
}
