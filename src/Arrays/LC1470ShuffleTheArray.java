package Arrays;
import java.util.*;
public class LC1470ShuffleTheArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print("Enter the array: ");
    int[] nums = new int[2*n];
    for(int i =0;i<2*n;i++){
        nums[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(shuffle(nums , n)));
    sc.close();
  }  
  static int[] shuffle(int[] nums, int n){
    int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i*2]=nums[i];
            ans[i*2+1]=nums[n+i];
        }
        return ans;
  }
}
