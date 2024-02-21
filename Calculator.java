import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("계산기");

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 값을 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.println("첫번째 값은 " + num1 + " 입니다.");

        System.out.print("두번째 값을 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.println("두번째 값은 " + num2 + " 입니다.");

        System.out.print("연산기호를 입력하세요 : ");
        String opCode = sc.next();

        int result = 0;
//        int num1;
//        num1 = Integer.parseInt(firstValue);
//        int num2;
//        num2 = Integer.parseInt(secondValue);
//        if(opCode.equals("+")) {
//            result = num1 + num2;
//        }
//        else if(opCode.equals("-")){
//             result = num1 - num2;
//        }
//        else if (opCode.equals("*")) {
//            result = num1 * num2;
//        }
//        else if (opCode.equals("/")) {
//            result = num1 / num2;
//        }
//        else System.out.println("잘못된 연산기호입니다.");

        switch (opCode) {
            case "+": result = num1 + num2;
                break;
            case "-": result = num1 - num2;
                break;
            case "*": result = num1 * num2;
                break;
            case "/": result = num1 / num2;
                break;
            default: System.out.println("잘못된 연산기호입니다.");
        }

        System.out.println("결과값은 "+result+" 입니다.");
    }
}
