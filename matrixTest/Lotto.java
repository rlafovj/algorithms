package matrixTest;

import java.util.Arrays;

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
    }
}
