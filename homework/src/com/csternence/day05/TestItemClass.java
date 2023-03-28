package com.csternence.day05;

/**
 * @author Ternence
 * @date 2023-03-25 12:53
 * @description
 * 设计物品（Item）类
 * 它具有以下属性：
 * 1. 名字
 * 2. 价格
 * 3. 类别
 * 它具有以下行为：
 * 1. 售卖。该方法需要传入一个参数表示购买使用的金钱，如果金钱足够则打印"xx物品被卖出"的信息，并将找零作为返回值。
 * 否则打印"金钱不足，购买失败"，并将"-1"作为返回值表示购买失败。
 * 类定义完毕后，试着创建三个对象并使用"对象名点"完成属性赋值：
 * 1. "手机类的Samsung Galaxy S21 8000元"
 * 2. "家具类的海尔冰箱 3000元"
 * 3. "日用品类的海飞丝洗发水 30元"
 * 然后自行调用一下售卖方法，测试一下。
 * 注：
 * 建议用一个public class作为测试类，用于创建对象，调用方法，访问属性等。
 * 具体类（比如本题中的Item）的定义，建议在public class下面定义非public class，这样比较方便快捷。
 * 不要将类定义在其它类的内部（内部类），在定义class时，一定要看清楚大括号！
 * 以上三条，（如无特别要求）适用于后续面向对象学习中的所有习题。
 */
public class TestItemClass {
    public static void main(String[] args) {
        // 创建三个对象并赋值
        Item item01 = new Item();
        Item item02 = new Item();
        Item item03 = new Item();
        item01.category = "手机类";
        item02.category = "家具类";
        item03.category = "日用品类";
        item01.name = "Samsung Galaxy S21";
        item02.name = "海尔冰箱";
        item03.name = "海飞丝洗发水";
        item01.price = 8000;
        item02.price = 3000;
        item03.price = 30;
        // 调用售卖方法测试
        item01.sell(5000);
        System.out.println("找零：" + item02.sell(5000) + "元");
        System.out.println("找零：" + item03.sell(30) + "元");
    }
}

class Item {
    String name;
    double price;
    String category;

    public double sell(double money) {
        if(money >= price) {
            System.out.println(category + "" +name + "被卖出");
            return money - price;
        }else {
            System.out.println("金钱不足，购买失败");
            return -1;
        }
    }
}
