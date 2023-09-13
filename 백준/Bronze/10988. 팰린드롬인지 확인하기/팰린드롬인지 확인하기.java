import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char [] array = word.toCharArray();
        char [] reverse = new char[array.length];
        int a = 0;

        for (int i = 0; i < array.length; i++) {
            reverse[array.length-1-i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != reverse[i]) {
                a++; // 팰린드롬이 아니면 1씩 증가
            }
        }
        if (a == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}