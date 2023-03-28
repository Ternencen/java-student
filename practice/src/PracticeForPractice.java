
public class PracticeForPractice {
    public static void main(String[] args) {
        staticMethod();
    }


    static PracticeForPractice ts = new PracticeForPractice();


    static {
        System.out.println("静态代码块");
    }


    {
        System.out.println("构造代码块");
    }


    public PracticeForPractice() {
        System.out.println("无参构造器");
        System.out.println("a=" + a + ",b=" + b);
    }


    public static void staticMethod() {
        System.out.println("静态成员方法");
    }


    int a = 666;
    static int b = 777;
}

