package learn.面对对象编程.基础;

public class StaticTest {
    public static String name;
    // 静态代码块，代码块是用来初始化类的，而静态代码块在声明时就开始运行了
    static {
        System.out.println(name + "是静态代码块");
    }
    {
        System.out.println(name + "是非静态代码块");
    }
    public StaticTest(String s2) {
        System.out.println(name + "是构造方法");
    }
    public void main() {
        System.out.println(name + "是成员方法");
    }

    public static void main(String[] args) {
    }
}
