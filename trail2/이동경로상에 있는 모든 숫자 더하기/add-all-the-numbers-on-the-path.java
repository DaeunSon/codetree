import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next(); //명령어문자열
        int[][] board = new int[n][n];

        int[] dx= new int[]{-1,0,1,0}; //행
        int[] dy= new int[]{0,1,0,-1}; //열
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int pos=0;
        int x=n/2;
        int y=n/2;
        int sum=board[n/2][n/2];

        for(int i=0;i<commands.length();i++){
            if (commands.charAt(i)=='L') {
                pos = (pos-1+4)%4; //3 
            }

            else if (commands.charAt(i)=='R') {
                pos = (pos+1)%4; //1
            }

            else {
                int nx = x + dx[pos]; //행 인덱스
                int ny = y + dy[pos]; //열 인덱스
               
                if (inRange(nx,ny,n)){
                    sum+=board[nx][ny];
                    x=nx;
                    y=ny;
                }
            }
        }

        System.out.print(sum);
    }

    public static boolean inRange(int x, int y, int n){
        return (x>=0 && x<n && y>=0 && y<n);
    }
}