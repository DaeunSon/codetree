import java.util.Scanner;

public class Main {
    private static final int OFFSET = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt()+OFFSET;
        int rect1_y1 = sc.nextInt()+OFFSET;
        int rect1_x2 = sc.nextInt()+OFFSET;
        int rect1_y2 = sc.nextInt()+OFFSET;
        int rect2_x1 = sc.nextInt()+OFFSET;
        int rect2_y1 = sc.nextInt()+OFFSET;
        int rect2_x2 = sc.nextInt()+OFFSET;
        int rect2_y2 = sc.nextInt()+OFFSET;
        // Please write your code here.

        int[][] arr = new int[2001][2001];

        for(int x = rect1_x1; x<rect1_x2; x++){
            for(int y = rect1_y1; y<rect1_y2; y++){
                arr[x][y]=1;
            }
        }

        for(int x = rect2_x1; x<rect2_x2; x++){
            for(int y = rect2_y1; y<rect2_y2; y++){
                arr[x][y]=0;
            }
        }

        int answer=0;
        int min_x=2000;
        int max_x=0;
        int min_y=2000;
        int max_y=0;

        for(int x=0;x<2001;x++){
            for(int y=0;y<2001;y++){
                if (arr[x][y]==1) {
                    if (x<min_x) min_x=x;
                    if (x>max_x) max_x=x;
                    if (y<min_y) min_y=y;
                    if (y>max_y) max_y=y;
                }
            }
        }

        if (max_x==0 && max_y==0) System.out.print(0);

        else System.out.print((max_x-min_x+1) * (max_y-min_y+1));
        
    }
}