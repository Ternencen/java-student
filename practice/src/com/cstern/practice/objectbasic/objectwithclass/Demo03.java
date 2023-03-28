package com.cstern.practice.objectbasic.objectwithclass;

/**
 * @author Ternence
 * @date 2023-03-25 21:07
 * @description
 * 成员变量赋值顺序练习
 * 1.Demo类加载,main方法执行
 * 2.Student类加载,创建Student对象,调用2参构造
 * 3.此时2参构造不会执行,会因为this(单参)调用单参构造,
 * 4.此时单参构造不会执行,会先对对象中成员变量默认初始化,进行默认赋值
 * 5.进行显式赋值
 * 6.Cat cat = new Cat(1000);执行到这里,会触发Cat类加载
 * 7.调用Cat单参构造方法
 * 8.Cat单参构造方法先不执行,先默认赋值,没有显式赋值,执行构造方法进行赋值
 * 9.Student类中的成员全部显式赋值成功--->进行构造器赋值
 * 10.Student的单参构造器先执行,再执行两参构造器
 * 11.Student对象创建成功并完成了赋值--->回到main方法继续执行
 * 12.输出相应结果
 */
public class Demo03 {
    public static void main(String[] args) {
        Student s = new Student(18, "长风");
        System.out.println(s.age);
        System.out.println(s.name);
        System.out.println(s.var);
        System.out.println(s.cat.price);
    }
}
class Student {
    int age = 10;
    String name = "张三";
    double var = 20;

    public Student(int age) {
        System.out.println("Student age");
        this.age = age;
    }

    public Student() {
    }

    public Student(int age, String name) {
        this(age);
        System.out.println("Student age,name");
        this.name = name;
    }
    Cat cat = new Cat(1000);
    Cat c2;
}

class Cat {
    double price;

    public Cat() {
    }

    public Cat(double price) {
        System.out.println("Cat price");
        this.price = price;
    }
}