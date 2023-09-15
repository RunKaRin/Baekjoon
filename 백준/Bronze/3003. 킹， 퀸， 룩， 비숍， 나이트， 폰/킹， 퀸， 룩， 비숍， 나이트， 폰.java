import java.util.Scanner;

public class Main { // 백준 3003번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] input = new int[6];
        int[] output = new int[6];
        for (int i = 0; i < 6; i++) {
            input[i] = sc.nextInt();
            output[i] = chess[i] - input[i];
        }
        for (int i = 0; i < 6; i ++) {
            System.out.print(output[i] + " ");
        }
        sc.close();
    }
}
