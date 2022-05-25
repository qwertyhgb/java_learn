package learn.面对对象编程.基础;
/**
 * static关键字来定义关键字
 * */
public class Pool {
    public static int water = 0;
    public void outlet() {
        if (water >= 2) {
            water = water - 2;
        }else {
            water = 0;
        }
    }
    public void inlet() {
        water = water + 3;
    }
    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.inlet();
        System.out.println("水池现在有多少水:" + Pool.water);
        pool.outlet();
        System.out.println("水池现在有多少水:" + Pool.water);
    }
}
