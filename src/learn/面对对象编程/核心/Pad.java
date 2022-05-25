package learn.面对对象编程.核心;

public class Pad extends Computer {
    String battery = "5000毫安电池";

    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println("computer的屏幕是：" + computer.screen);
        computer.startup();
        Pad pad = new Pad();
        System.out.println("Pad的屏幕是：" + pad.screen);
        System.out.println("Pad的电池是：" + pad.battery);
        pad.startup();
    }
}
