import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int sum=0;
        
        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            if (i==2 || i==4 || i==9) sum+=n;
        }
        System.out.print(sum);
    }
}