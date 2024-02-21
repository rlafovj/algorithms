package matrixTest;

public class Matrix1 {
    public static void main(String[] args){
        int[][] mtx = new int[5][5];
        int k = 1;
        for(int i = 0; i < mtx.length; i++){
            for (int j = 0; j < mtx[0].length; j++) {
                mtx[j][i] = k++;
            }
        }
        for(int i = 0; i < mtx.length; i++){
            for(int j = 0; j < mtx[0].length; j++){
                System.out.printf("%d ", mtx[i][j]);
            }
            System.out.println();
        }

        k = 1;
        System.out.println();

        for(int i = (mtx.length-1); i >= 0; i--){
            for (int j = (mtx[0].length-1); j >= 0; j--) {
                mtx[i][j] = k++;
            }
        }
        for(int i = 0; i < mtx.length; i++){
            for(int j = 0; j < mtx[0].length; j++){
                System.out.printf("%d ", mtx[i][j]);
            }
            System.out.println();
        }
    }
}
