package mathtest;

public class RandomTest {

    static int random(){
        return (int)(Math.random()*100);
    }
    public static void main(String[] args){
        int randomnumber = random();
        System.out.printf("랜덤 값 : %d", randomnumber);
    }
}
