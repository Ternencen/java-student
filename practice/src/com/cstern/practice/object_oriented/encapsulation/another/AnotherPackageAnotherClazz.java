package com.cstern.practice.object_oriented.encapsulation.another;

/**
 * @author Ternence
 * @date 2023-03-28 9:03
 * @description
 * 在包名为another的包中创建类：
 * 1. AnotherPackageAnotherClazz，即不同包下非子类。
 * 2. AnotherPackageSonClazz，即不同包下子类。
 */
public class AnotherPackageAnotherClazz {
    public static void main(String[] args) {

        // 不同包下非子类不能访问protected修饰的成员变量
        // System.out.println(a);
    }
}
