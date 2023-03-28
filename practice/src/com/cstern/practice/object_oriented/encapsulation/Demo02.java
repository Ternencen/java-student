package com.cstern.practice.object_oriented.encapsulation;

/**
 * @author Ternence
 * @date 2023-03-27 21:19
 * @description
 * 定义一个银行账户类Account, 3个属性, 用户名, 密码, 余额.
 * 要求用户名长度4-6位
 * 密码长度6位
 * 余额大于100
 */
public class Demo02 {
    public static void main(String[] args) {
        Account customer = new Account();
        customer.setInformation("zsls", "123456", 2000);
        customer.getInformation();

        Account customer01 = new Account();
        customer01.setInformation("坤坤阿heip", "1234567", 99);
        customer01.getInformation();
    }
}
class Account {
    private String userName;
    private String password;
    private double balance;

    public void setInformation(String userName, String password, double balance) {
        if(4 <= userName.length() && userName.length() <=6) {
            this.userName = userName;
        }
        if(password.length() ==6) {
            this.password = password;
        }
        if(balance > 100) {
            this.balance = balance;
        }
    }

    public void getInformation() {
        System.out.println("用户名：" + userName + " 密码：" + password + " 账户余额：" + balance);
    }
}