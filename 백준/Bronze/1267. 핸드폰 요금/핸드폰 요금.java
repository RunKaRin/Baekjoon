import java.util.Scanner;

public class Main { // 백준 1267번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        int Y = 0;
        int M = 0;

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            Y += 10 + 10 * (array[i]/30);    // 기본 10원 + 30초마다 10원
            M += 15 + 15 * (array[i]/60);    // 기본 15원 + 60초마다 15원
        }

//        // ↓↓ 콘솔 확인용
//        System.out.println("Y = " + Y );
//        System.out.println("M = " + M );
//        System.out.println("ㅡㅡㅡㅡㅡ");
//        // ↑↑ 콘솔 확인용

        if (Y > M) {
            System.out.println("M " + M);
        }
        if (Y < M) {
            System.out.println("Y " + Y);
        }
        if (Y == M) {
            System.out.println("Y M " + M);
        }

        sc.close();
    }
}