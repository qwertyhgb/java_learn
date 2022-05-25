package learn.面对对象编程.核心.super关键字;

public class UniverStudent extends Student {
    boolean isMarriage;  // 子类新增的属性
    UniverStudent(int number, String name, boolean b) {
        super(number, name);
    }
    public boolean getIsMarriage() {
        return isMarriage;
    }
}
