package com.csternence.day04;

import java.util.Arrays;

/**
 * @author Ternence
 * @date 2023-03-24 21:32
 * @description
 * 数组综合练习——真正删除元素
 * 对于某个String类型数组，将其中的某个元素全部去掉，得到一个新数组，并统计去掉了几个元素。
 * 举例，对于String数组["abc", "123", "123", "123", "666", "777"]
 * 将其中的元素"123"全部去掉，就得到了新数组["abc","666", "777"]，一共去掉了3个元素。
 * 注：
 * 这里说的去掉，不是指用0/null等默认值替代原先的元素，而是指真正的删除掉。
 * 思考：同一个数组能不能实现这个功能？如果不能，应该怎么完成呢？
 * String如何判断内容相同？
 * 该题有一定难度，建议不行放最后做。
 */
public class RealDeleteArray {
    public static void main(String[] args) {
        String[] array = {"abc","123","123","123","666","777"};
        String deleteElement = "123";
        System.out.println(Arrays.toString(delete(array,deleteElement)));
    }
    // 循环扫描数组，并将非删除元素复制进新数组
    // 将与删除元素相同元素置为null，并统计个数，从而得到新数组长度
    public static String[] delete(String[] array,String deleteElement) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(deleteElement.equals(array[i])) {
                array[i] = null;
                count++;
            }
        }
        String[] result = new String[array.length - count];
        // 设置index控制最终数组i增长
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null) {
                index --;
                continue;
            }
            result[i + index] = array[i];
        }
        return result;
    }
}
