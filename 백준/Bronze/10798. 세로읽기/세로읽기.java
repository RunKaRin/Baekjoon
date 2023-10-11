import java.util.Scanner;

public class Main { // 백준 10798번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] array = new char[5][15];   // 기본 조건 5x15배열
        int rows = array.length;            // 5(행)
        int maxWordLength = 0;              // 단어 최대 길이 초기값

        // 문자 입력 받기
        for (int i = 0; i < array.length; i++) {
            String word = sc.next();
            if (word.length() > 15) {
                word = word.substring(0, 15); // 입력 문자 15자로 제한
            }
            array[i] = word.toCharArray();
        }
        sc.close();

//        // ↓↓ 입력 문자 콘솔 확인용 ↓↓
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//        // ↑ ↑입력 문자 콘솔 확인용 ↑↑

        // 단어의 최대 길이 구하기 (차후 반복문 횟수 줄이기 위해)
        for (int i = 0; i < rows; i++) {
            int currentRowSize = array[i].length;
            if (currentRowSize > maxWordLength) {
                maxWordLength = currentRowSize;
            }
        }

        // 출력
        for (int j = 0; j < maxWordLength; j++) {
            for (int i = 0; i < rows; i++) {
                if (j < array[i].length) {
                    System.out.print(array[i][j]);
                }
            }
        }
    }
}