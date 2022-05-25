package learn.面对对象编程.核心.接口.接口回调;

public interface ShowMessage {
    void 显示商标(String s);
    default void f() {
        System.out.println("default方法！");
    }
}

class Tv implements ShowMessage {

    @Override
    public void 显示商标(String s) {
        System.out.println(s);
    }

    @Override
    public void f() {
        System.out.println("重写了default方法");
    }
}

class PC implements ShowMessage {

    @Override
    public void 显示商标(String s) {
        System.out.println(s);
    }
}

