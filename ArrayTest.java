import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < 10; i++){
            if(arr[i]%2 == 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("arr의 길이"+arr.length);
    }
}
