package com.csternence.day07;

/**
 * @author Ternence
 * @date 2023-03-27 20:06
 * @description
 * 定义一个Student类：
 * 成员变量：String name，int stuId，String gender，int age，double score（表示学生Java考试成绩）
 * 构造器：无参构造器，全参构造器等，自由发挥。
 * 成员方法：print()，打印对象所有属性的取值。
 * 类定义完毕后，创建五个Student对象存入Student对象数组中，完成以下两个操作：
 * 1. 遍历输出每个学生的属性信息（遍历对象调用print()方法）
 * 2. 求成绩平均值。
 * 注：
 * 1. 数组既可以存储基本数据类型（的值），也可以存储引用数据类型（的引用）。它们的使用没有本质区别。
 * 2. 可以考虑提取方法实现功能，不要把所有代码一股脑写在main方法中。
 */
public class Demo07 {
    public static void main(String[] args) {
        Student[] stu = new Student[5];
        stu[0] = new Student("张三", 01, "男", 18, 80);
        stu[1] = new Student("李四", 02, "nv", 20, 70);
        stu[2] = new Student("王五", 03, "男", 17, 60);
        stu[3] = new Student("俊杰", 04, "男", 37, 50);
        stu[4] = new Student("徐伦", 05, "女", 24, 90);

        // 打印对象所有属性的取值
        for (int i = 0; i < stu.length; i++) {
            stu[i].print();
        }

        getAverageScore(stu);
    }

    // 求平均成绩
    public static void getAverageScore(Student[] stu) {
        int sum = 0;
        for (int i = 0; i < stu.length; i++) {
            sum += stu[i].score;
        }
        System.out.println("成绩平均值为：" + (sum / stu.length));
    }
}
class Student {
    String name;
    int stuId;
    String gender;
    int age;
    double score;

    public Student() {

    }

    public Student(String name, int stuId, String gender, int age, double score) {
        this.name = name;
        this.stuId = stuId;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    public void print() {
        System.out.println("姓名：" + name + " 学生ID:" + stuId + " 性别:" + gender + " 年龄：" + age + " Java考试成绩:" + score);
    }
}