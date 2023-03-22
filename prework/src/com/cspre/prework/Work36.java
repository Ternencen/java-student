package com.cspre.prework;

import java.util.Scanner;

public class Work36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        //tax 应纳税所得额
        double tax = 0;
        //payTax 应纳税额
        double payTax = 0;
        //taxRate 税率
        double taxRate = 0;
        //deduction 速算扣除数
        double deduction = 0;
        double finalSalary = 0;
        tax = salary - 2000;
        if(tax <= 0) {
            System.out.println("应缴纳个人所得税" + payTax + "最后得到的工资" + salary);
        }else if(tax <= 500) {
            taxRate = 0.05;
            deduction = 0;
        }else if(tax <= 2000) {
            taxRate = 0.1;
            deduction = 25;
        }else if(tax <= 5000) {
            taxRate = 0.15;
            deduction = 125;
        }else if(tax <= 20000) {
            taxRate = 0.2;
            deduction = 375;
        }else if(tax <= 40000) {
            taxRate = 0.25;
            deduction = 1375;
        }else if(tax <= 60000) {
            taxRate = 0.3;
            deduction = 3375;
        }else if(tax <= 80000) {
            taxRate = 0.35;
            deduction = 6375;
        }else if(tax <= 100000) {
            taxRate = 0.4;
            deduction = 10375;
        }else {
            taxRate = 0.45;
            deduction = 15375;
        }
        payTax = tax * taxRate - deduction;
        finalSalary = salary - payTax;
        System.out.println("应缴纳个人所得税" + payTax + "最后得到的工资" + finalSalary);
    }
}
