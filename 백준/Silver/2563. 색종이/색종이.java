import java.util.Scanner;

public class Main { // 백준 2563번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] array = new int[100][100];
        int area = 0;           // 넓이 초기값
        int N = sc.nextInt();   // 색종이 수

        // 문자 입력 받기
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();   // X좌표
            int Y = sc.nextInt();   // Y좌표
            for (int j = X; j < X+10; j++) {
                for (int k = Y; k < Y+10; k++) {
                    array[j][k] = 1;
                }
            }
        }
        sc.close();

        // 출력
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (array[i][j] == 1) {
                    area++;
                }
            }
        }
        System.out.println(area);
    }
}