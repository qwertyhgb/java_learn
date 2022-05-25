package learn.面对对象编程.核心.super关键字.使用super关键字操着被隐藏的成员变量和方法;

public class Example_super {
    public static void main(String[] args) {
        Average average = new Average();
        average.n = 100.56788;
        double result1 = average.f();
        double result2 = average.g();
        System.out.println(result1);
        System.out.println(result2);
    }
}
