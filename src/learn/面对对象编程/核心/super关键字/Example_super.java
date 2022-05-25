package learn.面对对象编程.核心.super关键字;

public class Example_super {
    public static void main(String[] args) {
        UniverStudent zhangsan = new UniverStudent(20111, "张三", false);
        int number = zhangsan.getNumber();
        String name = zhangsan.getName();
        boolean marriage = zhangsan.getIsMarriage();
        System.out.println(name + "的学号是:" + number);
        if (marriage) {
            System.out.println(name + "已近结婚了！");
        } else {
            System.out.println(name + "还没有结婚！");
        }
    }
}
