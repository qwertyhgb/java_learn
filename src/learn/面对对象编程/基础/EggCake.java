package learn.面对对象编程.基础;

public class EggCake {
    int eggcount;
    public EggCake(int eggcount) {
        this.eggcount = eggcount;
        // System.out.println("加" + this.eggcount + "个蛋！！");
    }
    public EggCake() {
        this(10);
        System.out.println("加十个蛋");
    }
    public void say() {
        System.out.println("加了" + eggcount + "个蛋！！");
    }
    public static void main(String[] args) {
        EggCake e1 = new EggCake(1);
        EggCake e2 = new EggCake();
        e2.say();
        e1.say();
    }
}
