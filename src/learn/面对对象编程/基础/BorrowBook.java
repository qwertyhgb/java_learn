package learn.面对对象编程.基础;
/**
 * 构造方法
 */
public class BorrowBook {
    public BorrowBook() {
        System.out.println("将借一本书！！");
    }
    public static void main(String[] args) {
        BorrowBook book = new BorrowBook();
        book.borrow("《shu》");
    }
    public void borrow(String name) {
        System.out.println("借的书是" + name);
    }
}
