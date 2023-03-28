package com.cstern.practice.object_oriented.encapsulation.another;

/**
 * @author Ternence
 * @date 2023-03-28 9:04
 * @description
 */
public class AnotherPackageSonClazz extends com.cstern.practice.object_oriented.encapsulation.one.CurrentClazz {

    // 不同包下子类可以访问父类protected修饰的成员变量
    static int b = a;

    public static void main(String[] args) {
        System.out.println(a);
    }
}
