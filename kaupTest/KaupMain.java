package kaupTest;

public class KaupMain {
    //카우프 지수 구하는 프로그램
    public static void main(String[] args){
        double height = (150 + (Math.random() * 50));
        double weight = (30 + (Math.random() * 69));
        double bmi = weight / ((height/100)*(height/100));
        System.out.printf("%.1f\n", height);
        System.out.printf("%.1f\n", weight);
        System.out.printf("%.1f\n", bmi);
    }
}
