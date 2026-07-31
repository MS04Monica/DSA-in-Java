package Arrays;
import java.util.*;
public class LC1TwoSum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the size of array and target:");
        int n = sc.nextInt();
        int target =sc.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(TwoSum(nums,target)));
        sc.close();
    }
    static int[] TwoSum(int[] nums,int target){
        int[] ans = new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                ans[0]=i;
                ans[1]=j;
                return ans;
                }
            }
        }
        return ans;
    }
}
