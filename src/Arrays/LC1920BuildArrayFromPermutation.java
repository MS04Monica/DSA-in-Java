package Arrays;
import java.util.*;
public class LC1920BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  size of Array:");
        int n = sc.nextInt();
        int [] nums = new int[n] ;
        for(int i = 0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.print(Arrays.toString(buildArray(nums)));
        sc.close();
    }
    static int[] buildArray(int[] nums){
        int n = nums.length;
        int [] ans = new int[n];
        for(int i =0;i<n;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
