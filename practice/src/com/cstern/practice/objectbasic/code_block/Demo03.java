package com.cstern.practice.objectbasic.code_block;

import java.sql.SQLOutput;

/**
 * @author Ternence
 * @date 2023-03-26 15:41
 * @description
 * 创建一个类Student，类中有多个构造器，请写代码统计外部创建Student对象的次数
 */
public class Demo03 {
    public static void main(String[] args) {
        Student stu01 = new Student();
        Student stu02 = new Student(1,2);
        Student stu03 = new Student(3,4,5);
        Student stu04 = new Student(6,7,8);
        System.out.println(Student.count);
    }

}
class Student {
    static int count;
    int number01 = 0;
    int number02 = 0;
    int number03 = 0;
    {
        count++;
    }
    // 无参构造
    public Student() {

    }
    // 一参构造
    public Student(int number01) {

    }
    // 二参构造
    public Student(int number01,int number02) {
        this.number01 = number01;
        this.number02 = number02;
    }
    // 三参构造
    public Student(int number01,int number02,int number03) {
        //this();
        this.number01 = number01;
        this.number02 = number02;
        this.number03 = number03;
    }
}
