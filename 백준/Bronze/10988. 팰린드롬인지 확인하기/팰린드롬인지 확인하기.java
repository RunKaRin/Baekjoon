import java.util.Scanner;

public class Main2 { // 백준 10988번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();                // 입력문자 배열
        char [] array = word.toCharArray();     // 입력문자 역배열
        char [] reverse = new char[array.length];
        int a = 0;

        for (int i = 0; i < array.length; i++) {
            reverse[array.length-1-i] = array[i];   // 역배열 완성
        }
//        // ↓↓ 콘솔 확인용
//        for (int b = 0; b < array.length; b++) {
//            System.out.print(array[b]);
//        }
//        System.out.println();
//        for (int c = 0; c < reverse.length; c++) {
//            System.out.print(reverse[c]);
//        }
//        System.out.println();
//        // ↑↑ 콘솔 확인용
        for (int i = 0; i < array.length; i++) {
            if (array[i] != reverse[i]) {
                a++; break;
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
