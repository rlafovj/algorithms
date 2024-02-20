package gradeOOP;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeModel gradeModel = new GradeModel();
        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.print("이름 : ");
        gradeModel.setName(sc.next());
        System.out.print("국어점수 : ");
        gradeModel.setKorean(sc.nextInt());
        System.out.print("영어점수 : ");
        gradeModel.setEnglish(sc.nextInt());
        System.out.print("수학점수 : ");
        gradeModel.setMath(sc.nextInt());
        System.out.print("평균 점수를 구하시오");
        gradeModel.createAverage();


        System.out.println(" ============= 성적표 ==============");
        System.out.println("이름 : "+gradeModel.getName());
        System.out.println("국어점수 : "+gradeModel.getKorean());
        System.out.println("영어점수 : "+gradeModel.getEnglish());
        System.out.println("수학점수 : "+gradeModel.getMath());
        System.out.println("평균 점수: "+gradeModel.getAverage());

    }
}