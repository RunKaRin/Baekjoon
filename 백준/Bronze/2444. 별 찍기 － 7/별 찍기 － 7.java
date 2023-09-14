import java.util.Scanner;

public class Main { // 백준 2444번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            for (int kk = 0; kk < i; kk++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int  k = i; k < N-1; k++) {
                System.out.print("*");
            }
            for (int kk = i; kk < N-2; kk++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
