import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1~9 사이의 정수값 입력");

        int num = sc.nextInt();

        for(int i = 0; i < 9; i++){
            System.out.println(num+" * "+(i+1)+" = "+(num*(i+1)));
        }
    }
}
