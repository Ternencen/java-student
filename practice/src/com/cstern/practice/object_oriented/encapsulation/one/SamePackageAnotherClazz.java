package com.cstern.practice.object_oriented.encapsulation.one;

/**
 * @author Ternence
 * @date 2023-03-28 8:58
 * @description
 */
public class SamePackageAnotherClazz {
    public void main(String[] args) {
        // 同包非子类可以访问同包下其他类protected修饰的成员变量
        int b = CurrentClazz.a;
    }
}
