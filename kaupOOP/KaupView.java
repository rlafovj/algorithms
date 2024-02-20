package kaupOOP;

import java.util.Scanner;

public class KaupView {
    //카우프 지수 구하는 프로그램
    public static void main(String[] args){
        Person person = new Person();
        Scanner sc = new Scanner(System.in);

        person.setName(sc.next());
        person.createWeight();
        person.createWeight();
        person.createBmi(person.getHeight(), person.getWeight());
        person.createBodyMass();

        System.out.printf("%s\n", person.getName());
        System.out.printf("%.1f\n", person.getHeight());
        System.out.printf("%.1f\n", person.getWeight());
        System.out.printf("%.1f\n", person.getBmi());
        System.out.printf("%s", person.getBodyMass());
    }
}
