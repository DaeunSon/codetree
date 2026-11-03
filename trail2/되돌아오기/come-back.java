import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] dir = new char[n];
        int[] dist = new int[n];
        int[] dir_x = new int[]{1,0,-1,0};
        int[] dir_y = new int[]{0,-1,0,1};

        int x = 0;
        int y = 0;
        int time = 0;

        for(int i = 0; i < n; i++){
            dir[i] = sc.next().charAt(0);
            dist[i] = sc.nextInt();

            int nx, ny;
            while (dist[i]-- > 0) {
            if (dir[i]=='E') {
                nx = x + dir_x[0];
                ny = y + dir_y[0];
            }

            else if (dir[i]=='S') {
                nx = x + dir_x[1];
                ny = y + dir_y[1];
            }

            else if (dir[i]=='W') {
                nx = x + dir_x[2];
                ny = y + dir_y[2];
            }

            else {
                nx = x + dir_x[3];
                ny = y + dir_y[3];
            }

            time++;
            if (nx==0 && ny==0) {
                System.out.print(time);
                return;
            }

            x = nx;
            y = ny;
            }
        }
        // Please write your code here.
        
        System.out.print(-1);
    }
}