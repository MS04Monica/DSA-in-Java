import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print("The series are :"+first+" "+second+" ");
        int sum = 0;
        for(int i =1;i<num;i++){
            sum = first + second;
            first = second;
            second = sum;
            System.out.print(sum+" ");
        }
        sc.close();
    }
}