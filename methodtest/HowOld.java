package methodtest;

import java.util.Scanner;

public class HowOld {
    static int age(Scanner sc){
        System.out.print("나이를 입력하세요 : ");
        return sc.nextInt();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = age(sc);
        System.out.println("나이 :"+age);
    }
}
