package com.csternence.day08;

/**
 * @author Ternence
 * @date 2023-03-28 21:51
 * @description
 * 综合访问权限修饰符，static等知识点，做一个综合的练习。
 *  定义一个Student类，并要求在其他类中，最多只能创建10个Student类的对象。
 *      分析：
 *          1，如果允许外部直接创建对象，显然无法控制创建对象的个数
 *          2，需要计数器指示外部创建对象的个数
 * 注意: 该题目具有一定综合性 如果一时想不明白 可最后做!
 */
public class Demo05 {
    public static void main(String[] args) {
        Student stu01 = Student.foundStu();
        Student stu02 = Student.foundStu();
        Student stu03 = Student.foundStu();
        Student stu04 = Student.foundStu();
        Student stu05 = Student.foundStu();
        Student stu06 = Student.foundStu();
        Student stu07 = Student.foundStu();
        Student stu08 = Student.foundStu();
        Student stu09 = Student.foundStu();
        Student stu010 = Student.foundStu();
        Student stu011 = Student.foundStu();
    }
}

class Student {
    private static int count = 0;

    // 禁止外部直接创建类
    private Student() {

    }

    // 内部创建类传出并统计个数 到10停止
    public static Student foundStu() {
        if(count < 10) {
            Student stu = new Student();
            count++;
            System.out.println("创建对象成功！");
            return stu;
        }
        System.out.println("创建对象失败！");
        return null;
    }
}

