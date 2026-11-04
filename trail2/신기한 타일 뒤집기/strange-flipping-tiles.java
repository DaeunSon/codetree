import java.util.Scanner;
public class Main {
    public static final int OFFSET = 100000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tile = new int[200001];
        int start=OFFSET;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            if (d=='R'){
                //black
                for(int j=0;j<x;j++){
                    tile[start]=1;
                    start++;
                }
                start--;
            }

            else {
                //white
                for(int j=0;j<x;j++){
                    tile[start]=2;
                    start--;
                }
                start++;
            }
        }
        // Please write your code here.
        int b=0;
        int w=0;

        for(int i=0;i<200001;i++){
            if (tile[i]==1) b++;
            else if (tile[i]==2) w++;
        }

        System.out.print(w+" "+b);
        
    }
}