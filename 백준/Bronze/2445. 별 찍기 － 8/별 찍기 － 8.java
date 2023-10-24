import java.util.Scanner;

public class Main { // 백준 2445번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            for (int a = 0; a < i+1; a++) {
                System.out.print("*");
            }

            for (int b = i; b < N-1; b++) {
                System.out.print(" ");
            }

            for (int c = i; c < N-1; c++) {
                System.out.print(" ");
            }

            for (int d = 0; d < i+1; d++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 0; j < N-1; j++) {

            for (int a = j; a < N-1; a++) {
                System.out.print("*");
            }

            for (int b = 0; b < j+1; b++) {
                System.out.print(" ");
            }

            for (int c = 0; c < j+1; c++) {
                System.out.print(" ");
            }

            for (int d = j; d < N-1; d++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}