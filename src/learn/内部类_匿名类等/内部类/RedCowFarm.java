package learn.内部类_匿名类等.内部类;

public class RedCowFarm {
    static String farmName;
    RedCow redCow;
    RedCowFarm() {
    }
    RedCowFarm(String s) {
        redCow = new RedCow(150, 112, 50000);
        farmName = s;
    }
    public void showCowMess() {
        redCow.speak();
    }
    static class RedCow {
        String cowName = "红牛";
        int height,weight,price;
        RedCow(int h,int w,int p) {
            height = h;
            weight = w;
            price = p;
        }
        void speak() {
            System.out.println("我是" + cowName + ",身高:" + height + "cm体重:" + weight + "kg,生活在" + farmName);
        }
    }
}
