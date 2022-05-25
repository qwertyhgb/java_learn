package learn.数组;

import java.util.Scanner;

/**
 * 二维数组的赋值与输出
 */
public class demo2 {
    public static void main(String[] args) {
        int [][]a = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a.length; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\n");
        for (int[] ints : a) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(ints[j]);
            }
        }
        scanner.close();
    }
}
