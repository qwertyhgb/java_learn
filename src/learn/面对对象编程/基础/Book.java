package learn.面对对象编程.基础;

public class Book {
    public static void main(String[] args) {
        Book book = new Book();
        int shelf = 30; //初始化书架上的书的数目
        int box = 40; //初始化箱子里书的的数目
        System.out.println("箱子里有" + book.add(shelf, box) + "本书！！");
        }
    private int add(int shelf, int box) {
        box = box + shelf;
        return box;
    }
}
