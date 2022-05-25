package learn.面对对象编程.基础;
/**
 * 用static修饰方法
 * */
public class Pool2 {
    public static int water = 0;
    public static void outlet() {
        if (water >= 2) {
            water = water - 2;
        } else {
            water = 0;
        }
    }
    public static void inlet(int water) {
        Pool2.water = Pool2.water + water;
    }

    public static void main(String[] args) {
        System.out.println("现在水池的水量:" + Pool2.water);
        Pool2.inlet(13);
        System.out.println("现在水池的水量:" + Pool2.water);
        Pool2.outlet();
        System.out.println("现在水池的水量:" + Pool2.water);
    }
}
