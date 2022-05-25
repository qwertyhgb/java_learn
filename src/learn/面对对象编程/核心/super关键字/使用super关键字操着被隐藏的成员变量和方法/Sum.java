package learn.面对对象编程.核心.super关键字.使用super关键字操着被隐藏的成员变量和方法;

public class Sum {
    int n;
    public double f() {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
