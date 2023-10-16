import java.util.HashMap;
import java.util.Scanner;

public class Main { // 백준 2745번
    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<26; i++) {
            map.put((char)(i+65), i+10); // A=10, B=11 ... Z=35
        }

//        // ↓↓ 해시맵 콘솔 확인용
//        for (Character key : map.keySet()) {
//            System.out.println( String.format("키 : %s,  값 : %s", key, map.get(key)) );
//        }
//        // ↑↑ 해시맵 콘솔 확인용

        Scanner sc = new Scanner(System.in);
        String N = sc.next().toUpperCase(); // B진법 수 N
        int B = sc.nextInt();               // 2 ≤ B ≤ 36 (최대 36진법)
        int result = 0;                     // 결과 초기값

        char[] num = N.toCharArray();

//        // ↓↓ 입력값 N, B 콘솔 확인용
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i] + " ");
//        }
//        System.out.println("(" + B + "진수)");
//        // ↑↑ 입력값 N, B 콘솔 확인용

        for (int i = 0; i < num.length; i++) {
            if ( map.containsKey(num[i]) ) {
                result += Math.pow(B, num.length-1-i) * map.get(num[i]);
            } else {
                result += Math.pow(B, num.length-1-i) * ((int)(num[i])-48); // 아스키코드 48부터 숫자 0
            }
        }

//        // 출력
//        System.out.print("10진수 : ");
        System.out.println(result);

        sc.close();
    }
}