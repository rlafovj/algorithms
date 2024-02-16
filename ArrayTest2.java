import java.util.Scanner;

public class ArrayTest2 {
    /*
    최적화 문제 중 최댓값 구하기
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시험에 응시한 학생 수는 몇명입니까?");
        int[] scores = new int[sc.nextInt()];
        String[] names = new String[scores.length];

        int max = 0;
        int winner = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.println("학생의 이름을 입력하세요.");
            names[i] = sc.next();
            System.out.println("학생의 점수를 입력하세요.");
            scores[i] = sc.nextInt();

            if(scores[i]>max){
                max = scores[i];
                winner = i;
            }
        }
        System.out.println("1등은 "+max+"점을 받은 "+names[winner]+" 입니다.");
    }
}
