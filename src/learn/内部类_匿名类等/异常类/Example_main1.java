package learn.内部类_匿名类等.异常类;

public class Example_main1 {
    public static void main(String[] args) {
        int n,m=0,t=666666;
        try {
            m = Integer.parseInt("8888");
            n = Integer.parseInt("ab85");
            t = 9999;
        }
        catch (NumberFormatException e) {
            System.out.println("发生异常:" + e.getMessage());
            n = 123;
        }
        System.out.println("n = " + n + "m = " + m + "t = " + t);
    }
}
