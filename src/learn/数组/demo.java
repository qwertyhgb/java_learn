package learn.数组;
import java.util.Arrays;
import java.util.Scanner;
/** 
 * 一维数组的赋值与输出
*/
public class demo {
    public static void main(String[] args) {
        int []a = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<a.length; i++){
            a[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(a));
        scanner.close();
    }
}
