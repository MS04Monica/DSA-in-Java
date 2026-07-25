import java.util.*;
public class SumOfNumUntilZero {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int num = sc.nextInt();
    int sum = 0;
    while(num !=0){
            sum += num;
        num = sc.nextInt();
    }
    System.out.println("The sum of number is :"+sum);


    sc.close();

}
}
