package learn.面对对象编程.核心.方法重写;


public class Pad2 extends Computer2 {
    void showPicture() {
        System.out.println("手指点击屏幕");
    }

    public static void main(String[] args) {
        Computer2 computer2 = new Computer2();
        System.out.print("电脑打开图片的方式：");
        computer2.showPicture();
        Pad2 pad2 = new Pad2();
        System.out.print("Pad打开图片的方式是：");
        pad2.showPicture();
    }
}
