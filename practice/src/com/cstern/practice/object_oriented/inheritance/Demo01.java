package com.cstern.practice.object_oriented.inheritance;

/**
 * @author Ternence
 * @date 2023-03-27 22:04
 * @description
 * 理解继承的优点
 * > 练习：
 * > 在一款游戏中，我们设计了三种类型的鸭子，这些鸭子有一些共同的属性，也有共同的行为，比如都可以叫，都会游泳等。
 * > 编写程序，描述这些鸭子。
 * > 后来，需求更改了，这些鸭子不能游泳了，但是都会飞，怎么改呢？
 * > 再后来，需求又改了，新增了一种鸭子，但这个鸭子不会飞，又怎么办呢？
 */
public class Demo01 {
    public void main(String[] args) {
        Duck01 duck01 = new Duck01();
        Duck02 duck02 = new Duck02();
        duck01.sound();
        duck01.goal();

        // 可以在子类中重新定义方法覆盖父类中的方法
        duck01.fly();
        duck02.fly();
    }
}

class Animal {
    public void goal() {
        System.out.println("早日打败人类，征服地球！！");
    }
}

class Duck extends Animal{
    double price;
    String color;
    int a = 1;

    public void sound() {
        System.out.println("嘎~嘎~嘎~");
    }

    public void swim() {
        System.out.println("狠狠地游");
    }

    public void fly() {
        System.out.println("狠狠地飞");
    }
}

class Duck01 extends Duck{
    int a = 10;

    public void fly() {
        System.out.println("焯！我直接原地起飞~");
        System.out.println("————调用父类成员变量————");
        System.out.println(super.a);
    }


}

class Duck02 extends Duck{

}

class Duck03 extends Duck{

}