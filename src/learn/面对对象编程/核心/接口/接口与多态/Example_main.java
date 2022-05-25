package learn.面对对象编程.核心.接口.接口与多态;

public class Example_main {
    public static void main(String[] args) {
        AdvertisementBoard advertisementBoard = new AdvertisementBoard();
        advertisementBoard.setAdvertisement(new PhilipsCorp());
        advertisementBoard.show();
        advertisementBoard.setAdvertisement(new LenovoCorp());
        advertisementBoard.show();
        advertisementBoard.setAdvertisement(null);
        advertisementBoard.show();
    }
}
