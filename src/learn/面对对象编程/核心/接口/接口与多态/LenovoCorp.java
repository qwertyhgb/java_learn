package learn.面对对象编程.核心.接口.接口与多态;

public class LenovoCorp implements Advertisement{
    @Override
    public void showAdvertisement() {
        System.out.println("@@@@@@@@@@@@@@@");
        System.out.println("让世界变得很小");
        System.out.println("@@@@@@@@@@@@@@@");
    }

    @Override
    public String getCorpName() {
        return "联想集团";
    }
}
