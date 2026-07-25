import java.util.*;
public class PrintFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        for(int i= 1;i*i<=num;i++){
            if(num%i==0 ){
                System.out.print(i+ " ");
                if(i != num/i){
                System.out.println(num/i);
            }
            }
            
        }
        sc.close();
    }
    
}
