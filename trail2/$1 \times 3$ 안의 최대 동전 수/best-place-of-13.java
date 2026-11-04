import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        int best=0;
        int start=0;
        int sum;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-2;j++){
                sum=0;
                for(int k=0;k<3;k++){
                    sum+=grid[i][j+k];
                    if (sum>best) best=sum;
                }
            }
        }

        System.out.print(best);
    }
}