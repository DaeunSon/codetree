import java.util.Scanner;

public class Main {
    public static final int OFFSET = 100000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        char[] dir = new char[n];
        char[] tile = new char[200001];
        int[] cnt_b = new int[200001];
        int[] cnt_w = new int[200001];
        int start=OFFSET;
        int grey=0;
        
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            dir[i] = sc.next().charAt(0);
            for(int j=0;j<x[i];j++){
                if (dir[i]=='R'){
                    //right, black
                    cnt_b[start]++; 
                    if (cnt_b[start]>=2 && cnt_w[start]>=2) {
                        if (j!=x[i]-1) start++;
                        continue;
                    }
                    tile[start] = 'b';
                    if (j!=x[i]-1) start++;
                }
                else {
                    cnt_w[start]++;
                    if (cnt_w[start]>=2 && cnt_b[start]>=2) {
                        if (j!=x[i]-1) start--;
                        continue;
                    }
                    tile[start] = 'w';
                    if (j!=x[i]-1) start--;
                }
            }
        }

        // Please write your code here.

        int b=0;
        int w=0;
        int g=0;
        
        for(int i=0;i<200001;i++){
            if (cnt_b[i]>=2 && cnt_w[i]>=2) g++;
            else if(tile[i]=='b') b++;
            else if (tile[i]=='w') w++;
        }

        System.out.print(w+" "+b+" "+g);
        
    }
}