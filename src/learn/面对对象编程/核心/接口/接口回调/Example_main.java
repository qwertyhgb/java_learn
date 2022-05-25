package learn.面对对象编程.核心.接口.接口回调;

public class Example_main {
    public static void main(String[] args) {
        ShowMessage showMessage;
        showMessage = new Tv();
        showMessage.显示商标("电视！");
        showMessage.f();
        showMessage = new PC();
        showMessage.显示商标("电脑！");
        showMessage.f();
    }
}
