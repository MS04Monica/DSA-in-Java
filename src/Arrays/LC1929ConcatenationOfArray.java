/*
 * LeetCode 1929 - Concatenation of Array
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
package Arrays;
import java.util.*;
public class LC1929ConcatenationOfArray {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array: ");
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i = 0; i<n;i++){
        nums[i]=sc.nextInt();
    }
    System.out.print(Arrays.toString(nums));
    System.out.print(Arrays.toString(concatenation(nums)));
    sc.close();
}    
static int[] concatenation(int[] nums){
    int n = nums.length;
    int[] ans = new int[2*n];
    for(int i = 0 ; i<n;i++){
        ans[i]=nums[i];
        ans[i+n]=nums[i];
    }
    return ans;
}
}
