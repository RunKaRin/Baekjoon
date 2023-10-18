import java.util.Arrays;
import java.util.Scanner;

public class Main { // 백준 2587번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];       // 입력 받을 정수 배열
        int sum = 0;                    // 합 초기값

        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        
        Arrays.sort(array);             // 오름차순 정렬

        System.out.println(sum/5);      // 평균값
        System.out.println(array[2]);   // 중앙값

        sc.close();
    }
}