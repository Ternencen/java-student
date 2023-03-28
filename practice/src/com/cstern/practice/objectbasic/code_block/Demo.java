package com.cstern.practice.objectbasic.code_block;

/**
 * @author Ternence
 * @date 2023-03-26 15:55
 * @description
 * 考虑以下代码输出顺序
 */
public class Demo {
    public static void main(String[] args) {
        Cat c = new Cat(28, "紫色");
        System.out.println(c.age);
        System.out.println(c.color);
        System.out.println(Cat.catSound);
    }
}

class Cat {
    static String catSound;
    {
        age = 18;
        catSound = "miaomiaomiao";
        System.out.println("age building block");
    }

    int age = 10;
    String color = "黄色";

    {
        color = "黑色";
        System.out.println("color building block");
    }

    public Cat() {
    }

    public Cat(int age) {
        System.out.println("age constructor");
        this.age = age;
    }

    public Cat(int age, String color) {
        this(age);
        System.out.println("age color constructor");
        this.color = color;
    }
}
