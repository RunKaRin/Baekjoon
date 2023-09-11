import java.util.Scanner;

public class Main { // 백준 2941번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = word.replaceAll("c=", " ");
        word = word.replaceAll("c-", " ");
        word = word.replaceAll("dz=", " ");
        word = word.replaceAll("d-", " ");
        word = word.replaceAll("lj", " ");
        word = word.replaceAll("nj", " ");
        word = word.replaceAll("s=", " ");
        word = word.replaceAll("z=", " ");
        System.out.println(word.length());
        sc.close();
        // 이렇게 하면 답은 맞는데... 문제의 의도가 아닌거 같음
    }
}
