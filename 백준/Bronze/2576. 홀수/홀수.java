import java.util.Scanner;

public class Main { // 백준 2576번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[7];       // 입력 받을 정수 배열
        int[] oddNumber = new int[7];   // 홀수 배열
        int sum = 0;                    // 합 초기값
        int nim = 100;                  // 최솟값 초기값

        for (int i = 0; i < 7; i++) {
            array[i] = sc.nextInt();
            if (array[i] % 2 != 0) {
                sum += array[i];
                oddNumber[i] = array[i];
                if (nim > array[i]) {
                    nim = array[i];
                }
            }
        }

        if (nim != 100) {
            System.out.println(sum);
            System.out.println(nim);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}