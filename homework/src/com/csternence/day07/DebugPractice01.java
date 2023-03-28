package com.csternence.day07;

/**
 * @author Ternence
 * @date 2023-03-27 20:24
 * @description
 */

public class DebugPractice01 {
    public static void main(String[] args) {// ①执行main方法
        Person p = new Person(18);// ②Person类加载  ④创建Person对象，单参构造方法  ⑧创建对象完成
    }
}
class Person {
    int age = 10;// ⑥显式赋值age成员变量
    static String nationality = "美国";// ③类加载的同时显式赋值静态成员变量nationality

    public Person(int age) {// ⑤还不执行构造方法 构造器赋值在最后一步
        this.age = age;// ⑦构造器赋值
    }


    public Person() {
    }

    public Person(String nationality) {
        Person.nationality = nationality;
    }
}
