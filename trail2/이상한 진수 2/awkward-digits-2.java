import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == '0') ? '1' : '0';           // i번째 뒤집기
            int num = Integer.parseInt(new String(arr), 2); // 2진수 → 10진수
            ans = Math.max(ans, num);
            arr[i] = (arr[i] == '0') ? '1' : '0';           // 원래대로
        }

        System.out.println(ans);
    }
}