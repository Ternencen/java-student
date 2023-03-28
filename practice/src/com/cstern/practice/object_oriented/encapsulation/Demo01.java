package com.cstern.practice.object_oriented.encapsulation;

/**
 * @author Ternence
 * @date 2023-03-27 14:01
 * @description 定义一个员工Employer类，类中有3个属性：姓名，年龄，工资
 * 提供一个打印基本信息的pulic方法
 * ①对上述例子进行修改, 要求通过无参构造方法去创建对象, 通过set方法对成员变量进行设置值,
 * 要求年龄范围在1-100之间 , 工资在10K-15K范围内, 不在此范围内, 赋予默认值.
 * ②对上述例子的基础上, 要求通过有参构造方法去创建对象,
 * 要求年龄范围在1-100之间 , 工资在10K-15K范围内, 不在此范围内, 赋予默认值.
 */
public class Demo01 {
    public static void main(String[] args) {
        // 需求①
        Employer employer = new Employer();
        Employer employer01 = new Employer();
        employer.setInformation("zs", 18, 1000);
        employer01.setInformation("ls", 101, 13000);
        employer.printInformation();
        employer01.printInformation();

        // 需求②
        Employer employer02 = new Employer("ikun", 25, 1000);
        Employer employer03 = new Employer("wu", 101, 14000);
        employer02.printInformation();
        employer03.printInformation();
    }
}

class Employer {
    public String name;
    private int age;
    private double salary;

    public Employer() {

    }

    // 需求②
    public Employer(String name, int age, double salary) {
        this.name = name;
        if (1 <= age && age <= 100) {
            this.age = age;
        }
        if (10000 <= salary && salary <= 15000) {
            this.salary = salary;
        }
    }

    public void printInformation() {
        System.out.println("姓名：" + name + " 年龄：" + age + " 薪水：" + salary);
    }

    // 需求①
    public void setInformation(String name, int age, double salary) {
        this.name = name;
        if (1 <= age && age <= 100) {
            this.age = age;
        }
        if (10000 <= salary && salary <= 15000) {
            this.salary = salary;
        }
    }
}