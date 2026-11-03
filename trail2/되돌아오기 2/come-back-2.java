import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        // Please write your code here.

         int[] dir_x = new int[]{0,1,0,-1};
         int[] dir_y = new int[]{1,0,-1,0};
         int pos = 0;
         int time = 0;
         int x=0, y=0;
         int nx=0;
         int ny=0;

         for(int i=0;i<commands.length();i++){
            if (commands.charAt(i)=='L') {
                pos = (pos+1) % 4;
            }
            else if (commands.charAt(i)=='R'){
                pos = (pos-1+4)%4;
            }
            else {
                nx=x+dir_x[pos];
                ny=y+dir_y[pos];
            }   
            time++;
            if (nx==0 && ny==0) {
                System.out.print(time);
                return;
            }
            x=nx;
            y=ny;
         }

         System.out.print(-1);
    }
}