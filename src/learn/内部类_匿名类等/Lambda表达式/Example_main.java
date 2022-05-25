package learn.内部类_匿名类等.Lambda表达式;

interface Cubic {
    double getCubic(double x);
}

class A {
    void f(Cubic cubic) {
        double result = cubic.getCubic(3);
        System.out.println("result = " + result);
    }
}

public class Example_main {
    public static void main(String[] args) {
        Cubic cubic = x -> x*x*x;
        System.out.println(cubic.getCubic(5));
        cubic = (double x) -> x*x*x;
        System.out.println(cubic.getCubic(2));
        A a = new A();
        a.f((double x) -> x*x*x);
    }
}
