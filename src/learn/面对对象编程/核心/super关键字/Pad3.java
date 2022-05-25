package learn.面对对象编程.核心.super关键字;

public class Pad3 extends Computer3 {
    String sayHello() {
        return super.sayHello() + "Pad";  // supper可以调用父类的方法与属性
    }
    public static void main(String[] args) {
        Computer3 computer3 = new Computer3();
        System.out.println(computer3.sayHello());
        Pad3 pad3 = new Pad3();
        System.out.println(pad3.sayHello());
    }
}
