import java.util.Scanner;

public class Multidimension {
    static int numberOfClass(Scanner sc){
        System.out.print("반 개수를 입력하세요 : ");
        return sc.nextInt();
    }
    static int numberOfStudents(Scanner sc, int i){
        System.out.printf("%d반 시험 응시 학생 수 : ", (i+1));
        return sc.nextInt();
    }
    static int[][] makeScoresArray(Scanner sc){
        int numberofclass = numberOfClass(sc);
        int[][] scores = new int[numberofclass][];

        for (int i = 0; i < numberofclass; i++) {
            int numberOfStudents = numberOfStudents(sc, i);
            scores[i] = new int[numberOfStudents];
            System.out.printf("%d반의 시험 응시 학생 수는 %d 명 입니다.\n", (i + 1), numberOfStudents);
        }
        return scores;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scoresArray = makeScoresArray(sc);

        for(int i = 0; i < scoresArray[i].length; i++){

        }
//        int[] class1 = new int[numberofstudent1];
//        int[] class2 = new int[numberofstudent2];
//        double sum1 = 0, sum2 = 0;
//        int high1 = 0, high2 = 0;
//
//        for (int i = 0; i < class1.length; i++) {
//            class1[i] = (int)(Math.random()*100);
//            sum1 += class1[i];
//            if(class1[i]>high1){
//                high1 = class1[i];
//            }
//        }
//        for (int i = 0; i < class2.length; i++) {
//            class2[i] = (int)(Math.random()*100);
//            sum2 += class2[i];
//            if(class2[i]>high2){
//                high2 = class2[i];
//            }
//        }
//        double avg1, avg2, totalavg;
//        avg1 = sum1 / class1.length;
//        avg2 = sum2 / class2.length;
//        totalavg = (sum1 + sum2) / (class1.length + class2.length);
//
//        System.out.println("1반의 총점은 " + sum1 + " 평균은 " + avg1 +" 최고점은 "+high1+" 입니다.");
//        System.out.println("2반의 총점은 " + sum2 + " 평균은 " + avg2 +" 최고점은 "+high2+" 입니다.");
//        System.out.println("총 평균은 "+totalavg+" 입니다.");
    }
}
