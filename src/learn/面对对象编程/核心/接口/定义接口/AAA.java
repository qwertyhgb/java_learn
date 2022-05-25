package learn.面对对象编程.核心.接口.定义接口;

public class AAA implements Printable{
    @Override
    public void on() {
        System.out.println("hhh");
    }

    @Override
    public float sum(float x, float y) {
        return x+y;
    }
}
