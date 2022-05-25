package learn.java语言基础.布尔类型;

import java.util.Scanner;

public class LoginService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入六位数的密码:");
        int password = sc.nextInt();
        boolean result = (password == 123456); // 运用逻辑运算判断用户输入的数组是否正确。
        System.out.println("用户输入的密码是否正确:" + result);
        sc.close();
    }
}
