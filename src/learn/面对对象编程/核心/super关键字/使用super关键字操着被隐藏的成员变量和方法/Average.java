package learn.面对对象编程.核心.super关键字.使用super关键字操着被隐藏的成员变量和方法;

public class Average extends Sum {
    double n;  //子类继承的int型变量n被隐藏
    public double f() {
        double c;
        super.n = (int)n;
        c = super.f();
        return c - n;
    }
    public double g() {
        double c;
        c = super.f();
        return c - n;
    }
}
