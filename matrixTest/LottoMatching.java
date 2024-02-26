package matrixTest;

import java.util.Scanner;

public class LottoMatching {
    class BuyLotto {
        private static int[] buyLotto(int[] arr) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1부터 45사이의 숫자 6개를 입력하세요.");
            for (int i = 0; i < 6; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < 0 && arr[i] > 46) {
                    System.out.println("범위를 초과했습니다. 1부터 45 사이의 값을 입력하세요.");
                    arr[i] = 0;
                    i--;
                }
            }return arr;
        }
    }

    class BubbleSort {
        private static int[] bubbleSort(int[] arr) {
            int temp;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 5; j++) {
                    if (arr[j + 1] < arr[j]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return arr;
        }
    }

    class LottoDraw {
        private static int checkDuplicates(int[] arr1, int[] arr2) {
            int grade = 0;
            for (int i = 0; i < 6; i++) {
                boolean check = false;
                for (int j = 0; j < 6; j++) {
                    if (arr1[i] == arr2[j]) {
                        check = true;
                    }
                }
                if (check == true) {
                    grade++;
                }
            }
            return grade;
        }
    }

    class PrintLotto{
        private static void printLotto(int[] arr){
            for (int i = 0; i < 6; i++) {
                System.out.printf("%d ", arr[i]);
            }
        }
    }

    class PickLotto{
        private static int[] pickLotto(int[] arr){
        for (int i = 0; i < 6; i++) {
            arr[i] = (1 + (int) (Math.random() * 45));
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                }
            }
        }
        return arr;
    }
    }

    public static void main(String[] args) {
        int[] lotto = new int[6];
        int[] buyLotto = new int[6];

        BubbleSort.bubbleSort(BuyLotto.buyLotto(buyLotto));
        BubbleSort.bubbleSort(PickLotto.pickLotto(lotto));


        System.out.println("당신이 구매한 로또");
        PrintLotto.printLotto(buyLotto);
        System.out.println();
        System.out.println("추첨된 로또");
        PrintLotto.printLotto(lotto);
        System.out.println();

        int grade = LottoDraw.checkDuplicates(lotto, buyLotto);

        switch (grade) {
            case 6 -> System.out.println("축하합니다 1등입니다. 맞춘 갯수 : " + grade);
            case 5 -> System.out.println("축하합니다 2등입니다. 맞춘 갯수 : " + grade);
            case 4 -> System.out.println("축하합니다 3등입니다. 맞춘 갯수 : " + grade);
            case 3 -> System.out.println("축하합니다 4등입니다. 맞춘 갯수 : " + grade);
            default -> System.out.println("꽝입니다. 맞춘 갯수 : " + grade);
        }
    }
}

//    private static int[] pickLotto(int[] arr){
//        for (int i = 0; i < 6; i++) {
//            arr[i] = (1 + (int) (Math.random() * 8));
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    i--;
//                }
//            }
//        }
//        return arr;
//    }

//    private static int[] bubbleSort(int[] arr){
//        int temp;
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (arr[j + 1] < arr[j]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        return arr;
//    }
//
//    private static void printLotto(int[] arr){
//        for (int i = 0; i < 6; i++) {
//            System.out.printf("%d ", arr[i]);
//        }
//    }
//
//    private static int checkDuplicates(int[] arr1, int[] arr2) {
//        int grade = 0;
//        for(int i=0; i<6; i++){
//            boolean check = false;
//            for(int j=0; j<6; j++){
//                if(arr1[i] == arr2[j]){
//                    check = true;
//                }
//            }
//            if(check==true){
//                grade++;
//            }
//        }
//        return grade;
//    }
//}
