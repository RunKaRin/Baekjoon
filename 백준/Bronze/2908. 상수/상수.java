import java.util.Scanner;

public class Main { // 백준 2908번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();


        char[] array1 = num1.toCharArray();
        for (int i = 0; i<1; i++) {
            char x = array1[0];
            array1[0] = array1[2];
            array1[2] = x;
        }
        char[] array2 = num2.toCharArray();
        for (int i = 0; i<1; i++) {
            char x = array2[0];
            array2[0] = array2[2];
            array2[2] = x;
        }
        if ((int)array1[0] > (int)array2[0]) {
            System.out.print(array1);
        } else if ((int)array1[0] < (int)array2[0]) {
            System.out.print(array2);
        } else if ((int)array1[0] == (int)array2[0]) {

            if ((int) array1[1] > (int) array2[1]) {
                System.out.print(array1);
            } else if ((int) array1[1] < (int) array2[1]) {
                System.out.print(array2);
            } else if ((int)array1[1] == (int)array2[1]) {

                if ((int) array1[2] > (int) array2[2]) {
                    System.out.print(array1);
                } else  if ((int) array1[2] < (int) array2[2]) {
                    System.out.print(array2);
                } else {
                    System.out.println(array1);
                }
            }
        }
    }
}
