import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int sum=0;
        double sum_three=0;
        int cnt=0;

        
        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            if (i%2!=0) sum+=n;
            if ((i+1)%3==0) {
                sum_three += n;
                cnt++;
            }
        }
        System.out.print(sum+" ");
        System.out.printf("%.1f", (double)(sum_three/cnt));
    }
}