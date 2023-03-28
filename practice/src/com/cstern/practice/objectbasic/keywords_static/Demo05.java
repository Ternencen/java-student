package com.cstern.practice.objectbasic.keywords_static;

/**
 * @author Ternence
 * @date 2023-03-26 11:34
 * @description
 * 创建一个学生类,  有2个属性: 姓名String name , 学号int id
 * 统计外部创建Student类对象的个数 假设给Student类的对象自动编号
 * 这个编号第一次创建对象是10001 随后每创建一个新对象就+1
 */
public class Demo05 {
    public static void main(String[] args) {
        Student2 zs = new Student2("zs");
        Student2 ls = new Student2("ls");
        Student2 ww = new Student2("ww");
        zs.printStuInformation();
        ls.printStuInformation();
        ww.printStuInformation();
    }
}
class Student2 {
    String name;
    int stuId;
    static int id = 10000;

    public Student2() {

    }
    public Student2(String name) {
        this.name = name;
        id++;
        stuId = id;
    }
    public void printStuInformation() {
        System.out.println(name + "学号是" + stuId);
    }
}
