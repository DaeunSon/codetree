import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] points = new int[m][2];
        int[][] arr = new int[n+1][n+1];
        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};
        
        for (int i = 0; i < m; i++) {
            int cnt = 0;

            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();

            arr[points[i][0]][points[i][1]]++;

            for(int j=0;j<4;j++){
                int nx = points[i][0] + dx[j];
                int ny = points[i][1] + dy[j];
                if (inRange(nx,ny,n) && arr[nx][ny]==1) cnt++;
            }

            if (cnt==3) System.out.println(1);
            else System.out.println(0);
        }

        // Please write your code here.
        
    }

    public static boolean inRange(int x, int y, int n){
        return (x>=1 && x<=n && y>=1 && y<=n);
    }
}