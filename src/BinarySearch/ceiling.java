package BinarySearch;
public class ceiling {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8,9,10,11,15,16,23,24};
       int target = 13;
       int ans = ceilingNum(arr,target);
       System.out.println(ans);
    }
    static int ceilingNum(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]==target){
                return arr[mid]; 
            }
            if(arr[mid]>target){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return arr[low];
    }
}
