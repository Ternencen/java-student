package com.csternence.day03;

import org.junit.Test;

import java.util.Scanner;

/*
@Test用于执行单独的一部分方法_用alt + enter可以导入所需包
 */
public class Demo01 {
    public static void main(String[] args) {

    }
    // @Test方法只能用public void做前缀
    @Test
    public void test01() {
        System.out.println("test1");
    }
    // @Test方法无法做输入
    @Test
    public void testScanner() {
        System.out.println("testScanner");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
    }
}
