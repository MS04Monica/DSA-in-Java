package Arrays;
import java.util.*;
public class LC1389CreateTargetArrayintheGivenOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of Nums: ");
        int[] nums = new int[n];
        for(int i = 0 ; i< n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter the elements of index: ");
        int[] index = new int[n];
        for(int i = 0 ; i< n;i++){
            index[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
        sc.close();
    }
   static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int size = 0 ;
        for(int i =0 ; i < nums.length;i++){
            for(int j = size ; j> index[i];j--){
                target[j]=target[j-1];
            }
            target[index[i]]=nums[i];
            size++;
        }
        return target;
    }
}