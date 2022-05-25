package learn.面对对象编程.核心.abstract类与方法;

public class AmericanGirlFriend extends GirlFriend {
    @Override
    void speak() {
        System.out.println("Hello");
    }

    @Override
    void cooking() {
        System.out.println("beef");
    }

    @Override
    void like() {
        System.out.println("喜欢运动");
    }
}
