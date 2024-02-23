package matrixTest;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        for(int i = 0; i < 6; i++) {
            lotto[i] = (1 + (int) (Math.random() * 44));
            for(int j = 0; j < i; j++){
                if(lotto[i]==lotto[j]){
                    i--;
                }
            }
        }
        int temp;
        for(int i = 0; i < 6; i++){
            for(int j =0; j < 5; j++){
                if(lotto[j+1] < lotto[j]){
                    temp = lotto[j];
                    lotto[j] = lotto[j+1];
                    lotto[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ", lotto[i]);
        }


        System.out.println();







        Random random = new Random();
        int start =1, end =45;
        int randomNumber = createRandomNumber(end);
        int[] arr = new int[6];
        arr = createArrayWithout(arr);

        arr = sortAscenoing(arr);

        printLotto(arr);




    }

    private static int[] createArrayWithout(int[] arr) {
        for(int i = 0; i<6;i++){
            int randomNumber = createRandomNumber(45);
            boolean check = false;
            for(int j=0; j<6;j++){
                if(arr[j] == randomNumber) {
                    check = true;
                }
            }if(check==false) {
                arr[i] = randomNumber;
            }
        }
        return arr;
    }

    private static int createRandomNumber(int end) {
        Random random = new Random();
        return random.nextInt(45);
    }

    private static int[] sortAscenoing(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    private static void printLotto(int[] arr) {
        for (int i = 0 ; i < 6 ; i++){
            System.out.printf("%d \t",arr[i]);
        }
    }
}
