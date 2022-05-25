package learn.小练习;
import java.util.Scanner;
/**
 * 置换一个单位数的位置
 */
public class text_1 {
    public static void main(String[] args) {
        int number;
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一位三位数：");
        number = scanner.nextInt();
        a = number /100;
        b = number % 100 / 10;
        c = number % 10;
        System.out.println("置换后的三位数为:" + (c *100 + b * 10 + a));
        scanner.close();
    }
}