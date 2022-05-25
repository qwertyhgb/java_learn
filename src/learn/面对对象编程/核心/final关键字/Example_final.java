package learn.面对对象编程.核心.final关键字;

public class Example_final {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("面积是:" + b.getArea(100));
        b.speak();
    }
}

class A {
//    final double PI; 非法，没有个常量指定值
    final double PI = 3.1415926;
    public double getArea(final double r) {
//        r = 2; 非法，r的值已经不能改变了
        return PI*r*r;
    }
    public final void speak() {
        System.out.println("Hello");
    }
}

class B extends A {
    /*
    public void speak() {
        System.out.println("Hello");  非法的，方法已不能在被重写
    }
     */
}
