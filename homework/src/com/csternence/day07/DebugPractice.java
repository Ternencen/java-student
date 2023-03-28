package com.csternence.day07;

/**
 * @author Ternence
 * @date 2023-03-27 18:42
 * @description
 * 请自行debug查看变量赋值顺序
 */
public class DebugPractice {
    public static void main(String[] args) {
        Student01 stu = new Student01(18,"张三");
        System.out.println(stu.name + stu.age);
    }
}
class Student01 {
    int age = 10;
    String name = "张三";
    double a = 100;

    public Student01(int age) {
        System.out.println("Student age");
        this.age = age;
    }

    public Student01() {
    }

    public Student01(int age, String name) {
        this(age);
        System.out.println("Student age,name");
        this.name = name;
    }
}
