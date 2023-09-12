import java.util.Scanner;

public class Main { 백준 1157번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] alphabet = new char[26]; // 알파벳 배열
        int[] count = new int[26];      // 알파벳 횟수 배열
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char)(65+i);
        }
        String word = sc.next().toUpperCase(); // 전체 대문자로 받기
        char [] array = word.toCharArray();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 26; j++) {
                if(array[i] == alphabet[j]) {
                    count[j]++;
                }
            }
        }
        // ↓ 콘솔 확인용
//        for (int i = 0; i < 26; i++) {
//            System.out.print(alphabet[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < 26; i++) {
//            System.out.print(count[i] + " ");
//        }
//        System.out.println();
//        System.out.println(alphabet[maxIndex] + " : " + max + "회");
//        System.out.println();
        // ↑콘솔 확인용
        
        int maxIndex = count[0];    // 최대값 인덱스
        int max = -1;               // 최대값 선언
        int duplication = 0;        // 중복 유무 확인용

        for (int i = 0; i < 26; i++) {
            if (max < count[i]) {
                maxIndex = i;
                max = count[i];
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[maxIndex] == count[i] && maxIndex!=i) {
                duplication++; break;
            }
        }
        System.out.println(duplication == 0 ? alphabet[maxIndex] : "?");
        sc.close();
    }
}
