package learn.面对对象编程.核心.接口.定义接口;

public class Example_main {
    public static void main(String[] args) {
        AAA a = new AAA();
        System.out.println(AAA.MAX);
        System.out.println("调用重写的on方法:");
        a.on();
        System.out.println("调用重写的sum方法:" + a.sum(12, 33));
        System.out.println("调用接口提供的default方法:" + a.max(12, 44));
        Printable.f();  // 虽然接口被继承了但是static方法不属于类，只能用接口名来调用
    }
}
