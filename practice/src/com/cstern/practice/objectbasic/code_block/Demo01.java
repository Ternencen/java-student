package com.cstern.practice.objectbasic.code_block;

/**
 * @author Ternence
 * @date 2023-03-26 14:36
 * @description
 * 静态构造代码块 - 构造代码块 - 构造函数
 */
public class Demo01 {
    public static void main(String[] args) {
        // 匿名对象测试
        new HelloA();
    }
}
class HelloA {
    public HelloA(){//构造函数
        System.out.println("A的构造函数");
    }
    {//构造代码块
        System.out.println("A的构造代码块");
    }
    static {//静态代码块
        System.out.println("A的静态代码块");
    }
}
