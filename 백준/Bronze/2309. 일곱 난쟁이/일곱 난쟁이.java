import java.util.Arrays;
import java.util.Scanner;

public class Main { // 백준 2309번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[9];   // 입력 받을 정수 배열
        int sum = 0;                // 난쟁이 9명의 키의 합 초기값
        int x = 0;                  // 페이커 1
        int y = 0;                  // 페이커 2

        for (int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        Arrays.sort(array);     // 오름차순 정렬

        for (int i = 0; i < 9; i++) { // 9개 숫자중 2개를 빼서 100 만들기
            for (int j = i+1; j < 9; j++) {
                if (sum - array[i] - array[j] == 100) {
                    x = i;      // 페이커 1 확정
                    y = j;      // 페이커 2 확정
                    break;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i == x)
                continue;
            if (i == y)
                continue;
            System.out.println(array[i]);
        }

        sc.close();
    }
}