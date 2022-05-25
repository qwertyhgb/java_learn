import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int result;
        System.out.println("请输入n = ");
        n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("请输入:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        Solution solution = new Solution();
        result = solution.findMiddleIndex(nums);
        System.out.println("该数组的中心索引为:" + result);
    }
}

class Solution {
    public int findMiddleIndex(int[] nums) {
        int total = Arrays.stream(nums).sum(); // 求该数组的所有元素的和
        int sum = 0;
        /**
         * 当i=0时数组的第一个元素的右边的和为0
         */
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
