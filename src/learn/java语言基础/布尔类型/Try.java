package learn.java语言基础.布尔类型;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身高(cm):");
        int length = scanner.nextInt();
        boolean result = (length > 120);
        if (result){
            System.out.println("你需要买票！");
        }
        else {
            System.out.println("你不需要买票！");
        }
        scanner.close();
    }
}
