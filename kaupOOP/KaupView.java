package kaupOOP;

import memberOOP.MemberModel;

import java.util.Scanner;

public class KaupView {
    //카우프 지수 구하는 프로그램
    static String test;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        KaupService service = new KaupServiceImpl(){};
        MemberModel mm = new MemberModel(service.createHeight(),service.createWeight());
        double bmi = service.createBmi();
        String bodyMass = service.createBodyMass();


        service.createHeight();
        service.createWeight();
        service.createBmi();
        service.createBodyMass();


//        System.out.printf("%s\n", person.getName());
        System.out.printf("%.1f\n", service.createHeight());
        System.out.printf("%.1f\n", service.createWeight());
        System.out.printf("%.1f\n", service.createBmi());
        System.out.printf("%s", service.createBodyMass());
    }
}
