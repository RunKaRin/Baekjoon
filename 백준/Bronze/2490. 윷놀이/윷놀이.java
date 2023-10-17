import java.util.Scanner;

public class Main { // 백준 2490번
    public static void main(String[] args) {

        String[] Yut = {"E", "A", "B", "C", "D"}; // 모, 도, 개, 걸, 윷

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int count = 0;  // 매 반복시 초기화
            String play = sc.nextLine();
            char[] array = play.toCharArray();
            for (int j = 0; j < array.length; j++) {
                if (array[j] == 48) { // 배 = 0, 등 = 1
                    count++;
                }
            }
            System.out.println(Yut[count]);
        }
        sc.close();
    }
}