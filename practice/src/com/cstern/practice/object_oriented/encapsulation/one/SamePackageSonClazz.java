package com.cstern.practice.object_oriented.encapsulation.one;

/**
 * @author Ternence
 * @date 2023-03-28 8:59
 * @description
 */
public class SamePackageSonClazz extends CurrentClazz {
    public static void main(String[] args) {
        // 同包子类可以访问父类中的protected成员变量
        System.out.println(a);
    }
}
