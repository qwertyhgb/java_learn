package learn.面对对象编程.核心.接口.定义接口;

public interface Printable {
    public static final int MAX = 100;
    public abstract void on();
    public abstract float sum(float x, float y);
    default int max(int a, int b) {
        return Math.max(a, b);
    }
    public static void f() {
        System.out.println("从javaSE8开始");
    }
}
