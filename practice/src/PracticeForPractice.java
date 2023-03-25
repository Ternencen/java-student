import sun.management.Agent;

public class PracticeForPractice {
    public static void main(String[] args) {

    }
    public static void decimalToBinary(int n) {
        //如果商是0了，表示递归需要结束了
        if (n >= 2) {
            //只要商不是0，就继续递归
            decimalToBinary(n / 2);
        }
        System.out.print(n % 2);
    }
}


