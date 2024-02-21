
public class Gugudan {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf(" %3d * %d = %3d ", (j + 2), (i + 1), ((j + 2) * (i + 1)));
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 9; i++) {
            for (int j = 4; j < 8; j++) {
                System.out.printf(" %3d * %d = %3d ", (j + 2), (i + 1), ((j + 2) * (i + 1)));
            }
            System.out.println();
        }
    }
}
