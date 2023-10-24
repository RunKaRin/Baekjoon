import java.util.Scanner;

public class Main { // 백준 2442번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            for (int a = i; a < N-1; a++) {
                System.out.print(" ");
            }

            for (int b = 0; b < i+1; b++) {
                System.out.print("*");
            }

            for (int c = 0; c < i; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}