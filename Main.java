import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("ID : ");
        String id = scanner.next();

        System.out.printf("비 번 : ");
        String pw = scanner.next();

        System.out.printf("비번확인 : ");
        String pwc = scanner.next();

        System.out.printf("이름 : ");
        String name = scanner.next();

        System.out.printf("주민번호 : ");
        int cn = scanner.nextInt();

        System.out.printf("전화번호 : ");
        int tel = scanner.nextInt();

        System.out.printf("주 소 : ");
        String address = scanner.next();

        System.out.printf("직 업 : ");
        String job = scanner.next();

        System.out.printf("당신의 ID는 %s 입니다.\n", id);
        System.out.printf("당신의 비번은 %s 입니다.\n", pw);
        System.out.printf("당신의 비번확인은 %s 입니다.\n", pwc);
        System.out.printf("당신의 이름은 %s 입니다.\n", name);
        System.out.printf("당신의 주민번호는 %d 입니다.\n", cn);
        System.out.println("당신의 전화번호는 "+tel+" 입니다.");
        System.out.println("당신의 주소는 "+address+" 입니다.");
        System.out.println("당신의 직업은 "+job+" 입니다.");

    }
}