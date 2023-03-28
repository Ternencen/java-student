package com.cstern.practice.objectbasic.code_block;

/**
 * @author Ternence
 * @date 2023-03-26 15:35
 * @description
 * 构造代码块的出现就是为了提取构造函数的共同量,减少各个构造函数的代码而产生的.
 * 在执行 this() 时不会执行构造代码块
 */
public class Client {
    public static int count = 0;
    {
        count++;
    }

    public Client() {

    }

    public Client(int i) {
        this();
    }

    public Client(String string) {
    }

    public static void main(String[] args) {
        new Client();
        new Client(1);
        new Client("1");
        System.out.println(Client.count);
    }
}