package learn.面对对象编程.核心.abstract类与方法;

public class ChinaGirlFriend extends GirlFriend {

    @Override
    void speak() {
        System.out.println("你好");
    }

    @Override
    void cooking() {
        System.out.println("水煮鱼");
    }

    @Override
    void like() {
        System.out.println("喜欢跳舞");
    }
}
