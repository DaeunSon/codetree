import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        int answer=0;

        for(int i=0;i<A.length();i++){
            for(int j=i;j<A.length();j++){
                if (A.charAt(i)=='(' && A.charAt(j)==')') answer++;
            }
        }

        System.out.print(answer);
    }
}