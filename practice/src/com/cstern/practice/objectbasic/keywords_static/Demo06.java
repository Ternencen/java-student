package com.cstern.practice.objectbasic.keywords_static;

/**
 * @author Ternence
 * @date 2023-03-26 13:22
 * @description
 * 分析static执行顺序
 * 你能得出什么结论?
 * 1.静态成员变量的显式赋值，是在类加载过程中执行的。不管何种方式触发该类的类加载，这个过程都要执行。
 * 2.类加载可以连环触发，一个类可以最先开始类加载，但是不一定会最先完成类加载
 * 3.无论是静态成员变量还是成员变量，只有声明且没有其它任何赋值方式赋值，那就只有默认值。
 */
public class Demo06 {
    static Cat1 cat = new Cat1();
    Dog dog = new Dog();
    Dog dog2;
    static Dog dog3;
    static int number01 = 1;
    int numer02 = 2;
    public static void main(String[] args) {
        System.out.println("hello world!");
        Demo06 d = new Demo06();
        Demo06 f = new Demo06();
    }

    public Demo06() {
        System.out.println("demo");
    }
}

class Cat1 {
    static int catSound = 1;
    static Dog dog = new Dog();

    public Cat1() {
        System.out.println("cat");
    }
}

class Dog {
    static String daoSound = "汪汪汪";
    public Dog() {
        System.out.println("dog");
    }
}