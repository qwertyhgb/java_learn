package learn.面对对象编程.核心.接口.接口与多态;

public class AdvertisementBoard {
    // 定义一个接口变量
    Advertisement advertisement;
    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }
    public void show() {
        if (advertisement != null) {
            System.out.println("广告牌显示" + advertisement.getCorpName() + "公司的广告牌：");
            advertisement.showAdvertisement();
        } else {
            System.out.println("广告牌无广告");
        }
    }
}
