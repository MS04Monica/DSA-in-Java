package Arrays;
import java.util.*;
public class LC1431KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of nums and ExtraCandies: ");
        int n = sc.nextInt();
        int extraCandies =sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i< n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println((KidswithCandies(nums,extraCandies)));
        sc.close();
    }
    static List<Boolean>KidswithCandies (int[] nums,int extraCandies){
        List<Boolean> result = new ArrayList<>();
        int max = nums[0];
        for(int i =0 ;i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        for(int i =0;i<nums.length;i++){
            boolean ans = nums[i]+extraCandies>= max;
            result.add(ans);
        }
        return result;
    }
}
