import java.util.Scanner;

public class Main { // 백준 10093번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long max = Math.max(A, B);
        long min = Math.min(A, B);

        long C = max-min-1;

        if (max == min || max == min+1) {   // 입력 받은 수가 같거나 1차이면 사이의 숫자가 없음.
            System.out.println(0);
        } else {
            System.out.println(C);
            for (long i = min+1; i < max; i++) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}