import java.util.Scanner;

public class Main { // 백준 10804번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int x = 0;
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = i+1;
        }

        for (int i = 0; i < 10; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a < b) {
                for (int j = a-1; j < b-1; j++) {   // 인덱스는 0번부터
                    x = array[j];
                    array[j] = array[b-1];
                    array[b-1] = x;
                    b--;    // 끝자리도 하나씩 내려야함.
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(array[i] + " ");
        }
        
        sc.close();
    }
}