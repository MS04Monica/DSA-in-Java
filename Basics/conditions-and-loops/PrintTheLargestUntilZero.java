import java.util.*;
public class PrintTheLargestUntilZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int max = num;
        while(num!=0){
            if(num>max){
                max = num;
            }
            num = sc.nextInt();
        }
        System.out.print("The largest number is "+max);
        sc.close();
    }
}
