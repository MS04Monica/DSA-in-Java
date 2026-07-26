import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int fin = num;
        int sum =0;
        while(num>0){
            int rem = num%10;
            int ans = rem*rem*rem;
            sum+=ans;
            num = num/10;
        }
        if(sum==fin){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
        sc.close();
    }
}
