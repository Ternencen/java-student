package com.csternence.day07;

/**
 * @author Ternence
 * @date 2023-03-27 18:59
 * @description 编写一个类模拟银行账户（Account）的功能，包含的属性有"账户名（ID）"、"密码"、"账户余额"、"储蓄年利率"等。 其中：
 * 账号名：要求每个账户的账户名都是唯一的，且按照固定格式自动生成：
 * 第一位账户的账户名是"10001"
 * 其后账户的账户名依次加1。比如第二位账户的账户名就是"10002"，第三位就是"10003".....
 * 密码：新建账户时，可以选择自定义密码，也可以选择使用默认密码："000000"（6个0）
 * 账户余额：可以选择在新建账户时预设一个值，也可以保持默认值0
 * 储蓄年利率：由银行设置，和账户本身没有关系。你可以将它设置为"0.3%"（活期年利率一般都非常低，聊胜于无）
 * 定义完属性后，再给出两个成员方法：
 * 1，打印账户自身所有属性。2，根据传入的年限和储蓄年利率，计算本息合计后的余额。
 * 注：计算利息时简单点，不考虑利滚利。即利息 = 利率 * 时间 * 本金
 */
public class Bank {
    public static void main(String[] args) {
        // 测试账户名功能
        Account customer01 = new Account();
        Account customer02 = new Account();
        Account customer03 = new Account();

        // 修改密码
        customer02.password = "010100";

        // 设置账户余额
        customer03.accountBalance = 15000;
        customer01.printInformation();
        customer02.printInformation();
        customer03.printInformation();

        //计算本息合计后的余额
        System.out.println("————————————测试本金为0——————————");
        customer01.fianlAccountBalance(3);
        System.out.println("————————————测试本金非0——————————");
        customer03.fianlAccountBalance(3);
    }

}

class Account {
    int id = 1000;
    String password = "000000";
    double accountBalance;
    static double rate = 0.003;
    // 设置一count值记录new了多少个对象
    static int count = 0;

    public Account() {
        count++;
        id += count;
    }

    // 打印账户自身所有属性
    public void printInformation() {
        System.out.println("账户名：" + id + "\n密码：" + password + "\n账户余额:" + accountBalance + "\n储蓄年利率：" + rate);
    }

    // 根据传入的年限和储蓄年利率，计算本息合计后的余额
    public void fianlAccountBalance(int year) {
        if (accountBalance == 0) {
            System.out.println("您的账户余额为0！！");
            return;
        }
        double interest = rate * year * accountBalance;
        accountBalance += interest;
        System.out.println("本息合计后的金额为：" + accountBalance);
    }
}