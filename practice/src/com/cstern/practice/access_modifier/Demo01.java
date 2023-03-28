package com.cstern.practice.access_modifier;

/**
 * @author Ternence
 * @date 2023-03-26 19:34
 * @description
 */
public class Demo01 {
    public static void main(String[] args) {
        // Student student01 = new Student();
        Student.printName();
    }
}
// 定义工具类（即无成员变量——只有方法？） 通过private权限符修饰无参构造方法
// 可以避免创建该工具类对象 有利于代码管理
class Student {
    private Student() {

    }
    static void printName() {
        System.out.println("学生您好");
    }
}
