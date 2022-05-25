package learn.字符串;
/**
 * contains()方法是判断子字符串是否在字符串内
 */
public class StringContains {
    public static void main(String[] args) {
        String str = "今天的菜谱有：A,B,C,D,E,F,G";
        System.out.println(str);
        boolean request1 = str.contains("A");
        System.out.println("今天有A吗?" + request1);
        boolean request2 = str.contains("a");
        System.out.println("今天有B吗?" + request2);
    } 
}
