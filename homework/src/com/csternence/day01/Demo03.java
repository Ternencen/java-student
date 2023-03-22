package com.csternence.day01;

import java.util.Scanner;

/*
模拟账号登录功能
1.用户名(String):admin
2.密码(String): 123456
3.使用scanner进行输入, 有3次机会可以重新输入, 用户名密码匹配成功提示登陆成功并结束, 否则提示登陆失败还剩几次机会 , 一旦3次都失败提示锁定账户结束程序.
 */
public class Demo03 {
    public static void main(String[] args) {
        // scanner输入
        Scanner sc = new Scanner(System.in);
        // for循环三次，若正确终止循环，三次都错则锁定账户
        for (int i = 1; i <= 3; i++) {
            System.out.print("请输入用户名：");
            String userName = sc.nextLine();
            System.out.print("请输入密码：");
            String passWord = sc.nextLine();
            if (userName.equals("admin") && passWord.equals("123456")) {
                System.out.println("登陆成功");
                break;
            } else if (i < 3) {
                System.out.println("登陆失败还剩" + (3 - i) + "次机会");
            } else {
                System.out.println("账户已被锁定");
            }
        }
    }
}
