package Arrays;
import java.util.*;
public class LC1672RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 2D array :");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] accounts = new int[m][n]; 
        for(int i = 0 ; i<m ; i++){
            for(int j = 0; j<n ; j++){
                accounts[i][j]=sc.nextInt();
            }
        }
        System.out.print(Arrays.deepToString(accounts) + " ");
        System.out.println(maximumWealth(accounts));
        sc.close();
    }
    static int maximumWealth (int[][] accounts){
        int maxWealth = 0 ;
        for(int i = 0 ; i<accounts.length;i++){
            int Wealth = 0;
            for(int j =0 ; j<accounts[i].length;j++){
                Wealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth,Wealth);
        }
        return maxWealth;
    }
}
