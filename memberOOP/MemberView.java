package memberOOP;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MemberView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberModel mm = new MemberModel();

        System.out.print("ID : ");
        mm.setUsername(sc.next());

        System.out.print("비밀번호 : ");
        mm.setPassword(sc.next());

        System.out.print("비밀번호확인 : ");
        mm.setPasswordCheck(sc.next());

        System.out.print("이름 : ");
        mm.setName(sc.next());

        System.out.print("주민번호 : ");
        mm.setResidentRegistrationNumber(sc.nextInt());

        System.out.print("전화번호 : ");
        mm.setPhoneNumber(sc.nextInt());

        System.out.print("주 소 : ");
        mm.setAddress(sc.next());

        System.out.print("직 업 : ");
        mm.setJob(sc.next());

        System.out.printf("당신의 ID는 %s 입니다.\n", mm.getUsername());
        System.out.printf("당신의 비밀번호는 %s 입니다.\n", mm.getPassword());
        System.out.printf("당신의 비밀번호확인 %s 입니다.\n", mm.getPasswordCheck());
        System.out.printf("당신의 이름은 %s 입니다.\n", mm.getName());
        System.out.printf("당신의 주민번호는 %d 입니다.\n", mm.getResidentRegistrationNumber());
        System.out.printf("당신의 전화번호는 %d 입니다.\n", mm.getPhoneNumber());
        System.out.printf("당신의 주소는 %s 입니다.\n", mm.getAddress());
        System.out.printf("당신의 직업은 %s 입니다.\n", mm.getJob());

    }
}