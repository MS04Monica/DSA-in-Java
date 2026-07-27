package Arrays;
import java.util.*;
public class LC1480RunningSumOf1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.print(Arrays.toString(runningsum(nums)));
        sc.close();
    }
    static int[] runningsum(int[] nums){
        int sum =0;
        int n = nums.length;
        int [] runningsum = new int[n];
        for(int i =0;i<n;i++){
            runningsum[i] = nums[i] + sum;
            sum = nums[i]+sum;
        }
        return runningsum;
    }
}
