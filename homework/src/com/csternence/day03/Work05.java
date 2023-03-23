package com.csternence.day03;

/*
对于任意两个字符串对象的引用str1，str2。
怎么判断这两个字符串对象的内容相同呢？
注：如果有一个引用等于null，那么另一个引用也等于null，也可算内容相同
思考一下，写出你的答案。
 */
public class Work05 {
    public static void main(String[] args) {
        String[] str1 = {"a","b","c"};
        String[] str2 = {"a","b","c"};
        String[] str3 = null;
        String[] str4 = {"a"};
        compare(str1,str2);
        compare(str3,str4);
    }
    public static void compare(String[] str1,String[] str2) {
        // 引用等于null
        if(str1 == null || str2 == null) {
            if(str1 == null && str2 == null) {
                System.out.println("内容相同");
                return;
            }else {
                System.out.println("内容不同");
                return;
            }
        }
        // 若两数组长度不等则比不同
        if(str1.length != str2.length) {
            System.out.println("内容不同");
        }else {
            // 可用for循环依次扫描数组并比较内容
            for (int i = 0; i < str1.length; i++) {
                if(str1[i] != str2[i]) {
                    System.out.println("内容不同");
                    return;
                }
            }
            System.out.println("内容相同");
        }
    }
}
