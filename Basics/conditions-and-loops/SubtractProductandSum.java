/*
LeetCode 1281
Problem: Subtract the Product and Sum of Digits of an Integer

Approach:
1. Extract each digit using % 10.
2. Update sum and product.
3. Remove the last digit using / 10.
4. Return product - sum.

Time Complexity: O(d)
Space Complexity: O(1)
*/
import java.util.*;
public class SubtractProductandSum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number :");
    int num = sc.nextInt();
    int sum = 0 ;
    int product = 1;
    while(num>0){
        int rem = num%10;
        sum = sum + rem;
        product = product*rem;
        num = num/10;
    }
    int ans = product - sum;
    System.out.println("The sum and product of :"+sum+" "+product);
    System.out.println("The subtraction of product and sum is :"+ans);
    sc.close();
    }
}
