package learn.面对对象编程.核心.abstract类与方法;

public class Boy {
    GirlFriend girlFriend;
    void setGirlFriend(GirlFriend f) {
        girlFriend = f;
    }
    void showGirlFriend() {
        girlFriend.speak();
        girlFriend.cooking();
        girlFriend.like();
    }
}
