package learn.面对对象编程.核心.abstract类与方法;

public class Example_main {
    public static void main(String[] args) {
        Boy boy = new Boy();
        GirlFriend girlFriend = new ChinaGirlFriend();
        boy.setGirlFriend(girlFriend);
        boy.showGirlFriend();
        GirlFriend girlFriend1 = new AmericanGirlFriend();
        boy.setGirlFriend(girlFriend1);
        boy.showGirlFriend();
    }
}
