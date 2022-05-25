package learn.面对对象编程.基础;
/**
 * this的使用
 */
public class BorrowBook2 {
    String name;
    public static void main(String[] args) {
        BorrowBook2 book2 = new BorrowBook2("《一本书》");
        book2.borrow();
    }
    public BorrowBook2(String name) {
        this.name = name;
        System.out.println("将借一本书！！");
    }
    public void borrow() {
        System.out.println("借的书是:" + name);
    }
}
