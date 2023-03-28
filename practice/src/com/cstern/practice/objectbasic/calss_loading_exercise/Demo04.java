package com.cstern.practice.objectbasic.calss_loading_exercise;

/**
 * @author Ternence
 * @date 2023-03-26 16:27
 * @description
 * 类加载练习1
 */
public class Demo04 {
    static {
        System.out.println("Demo类开始初始化步骤了!");
    }

    static Cat02 cat = new Cat02();//1
    Dog dog = new Dog();

    public static void main(String[] args) {
        System.out.println("hello world!");
        Demo04 d = new Demo04();
    }

    public Demo04() {
        System.out.println("demo");
    }
}

class Cat02 {
    static {
        System.out.println("Cat类开始初始化步骤了!");
    }

    static Dog dog = new Dog();//2

    public Cat02() {
        System.out.println("cat");
    }
}

class Dog {
    static {
        System.out.println("Dog类开始初始化步骤了!");
    }

    static Demo04 demo = new Demo04();//

    public Dog() {
        System.out.println("dog");
    }
}