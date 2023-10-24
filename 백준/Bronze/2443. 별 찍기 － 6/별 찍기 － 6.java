import java.util.Scanner;

public class Main { // 백준 2443번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            for (int b = 0; b < i; b++) {
                System.out.print(" ");
            }

            for (int a = i; a < N; a++) {
                System.out.print("*");
            }

            for (int c = i; c < N-1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}