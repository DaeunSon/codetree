import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
    
        int[][] arr = new int[n][m];
        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};

        int num = 1;
        int x = 0, y = 0;
        int pos=0;

        while(num<=n*m) {
            arr[x][y]=num; 
            int nx = x + dx[pos];
            int ny = y + dy[pos];
            if (!inRange(nx,ny,n,m) || isPassed(nx,ny,arr)){
                pos = (pos+1)%4;
                nx = x + dx[pos];
                ny = y + dy[pos];
            }
            num++;
            x = nx;
            y = ny;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static boolean inRange(int x, int y, int n, int m) {
        return (x>=0 && x<n && y>=0 && y<m); 
    }

    public static boolean isPassed(int x, int y, int[][] arr) {
        return (arr[x][y]!=0);
    }
}