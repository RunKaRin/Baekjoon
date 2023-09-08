import java.util.HashMap;
import java.util.Scanner;

public class Main { // 백준 25206번
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalScore = 0;    // 총 학점
        int totalCoursCredit = 0; // 총 등급, 점수

        HashMap<String, String> score = new HashMap<String, String>();
        score.put("A+", "4.5");
        score.put("A0", "4.0");
        score.put("B+", "3.5");
        score.put("B0", "3.0");
        score.put("C+", "2.5");
        score.put("C0", "2.0");
        score.put("D+", "1.5");
        score.put("D0", "1.0");
        score.put("F", "0.0");

        //System.out.println(score); // 결과 출력

        for (int i = 0; i < 20; i ++) {
            String subject = sc.next();     // 과목, 여기선 크게 의미는 없음
            //System.out.println(subject);
            String coursCredit = sc.next(); // n학점
            //System.out.println(coursCredit);
            String gradeInput = sc.next();  // 등급, 점수
            if (score.containsKey(gradeInput)) {
                String grade = score.get(gradeInput);
                //System.out.println(grade);

                if (!gradeInput.equals("P")) {
                    totalScore += Double.parseDouble(coursCredit) * Double.parseDouble(grade);
                    //System.out.println("totalScore:" + totalScore);
                    totalCoursCredit += Double.parseDouble(coursCredit);
                    //System.out.println("totalCoursCredit : " + totalCoursCredit);
                }
            }
        }
        //System.out.print("평점 : ");
        System.out.println(totalScore / totalCoursCredit); // 과목이니까 분모가 0일수가 없음.

        sc.close();
    }
}