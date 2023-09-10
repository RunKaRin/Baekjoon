import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = N;
        sc.nextLine();
        char[] alphabet = new char[26];		// 알파벳 배열
        
        for (int i = 0; i < N; i++) {
            int[] countArray = new int[26];	// 알파벳 누적 횟수
            for (int h = 0; h < 26; h++) {
                alphabet[h] = (char)(65+h);
            }
        	String word = sc.next().toUpperCase();
        	char[] array = word.toCharArray();
        	char[] solo = new char[word.length()];
        	char first = '0';
        	for (int j = 0; j < word.length(); j++) {
        		
        		if (first != word.charAt(j)) {
        			first = word.charAt(j);
        			solo[j] = first;
        		}
//        		System.out.print(solo[j]);
        	}
//        	System.out.println();
        	
        	for (int a = 0; a < array.length; a++) {
                for (int b = 0; b < 26; b++) {
                    if(solo[a] == alphabet[b]) {
                    	countArray[b]++;
                    }
                }
            }
//            // ↓ 콘솔 확인용
//            for (int c = 0; c < 26; c++) {
//                System.out.print(alphabet[c] + " ");
//            }
//            System.out.println();
//            for (int d = 0; d < 26; d++) {
//                System.out.print(countArray[d] + " ");
//            }
//            System.out.println();
//        	// ↑ 콘솔 확인용
            for (int e = 0; e < 26; e++) {
            	if (countArray[e] > 1) {
            		count --; break;
            	}
            }
        	
        }
//        System.out.print("그룹단어 : ");
        System.out.print(count);
        sc.close();
    }
}