package baekjoon;

import java.util.Scanner;

public class GetHoney {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] place = new int[n];
        for(int i =0; i < n; i++){
            place[i] = sc.nextInt();
        }

        int max1 = 0, a1 = 0;
        for (int i = 1; i < n; i++){
            a1 += place[i];
        }
        for(int m = 1; m < n; m++){
            int b1 = 0, b1Max = a1, b1Maxi = 0;
            for (int i = n-(n-m)+1; i < n; i++){
                b1 += place[i];
                if(b1 > b1Max){
                    b1Max = b1;
                    b1Maxi = i;
                    a1 = a1-place[b1Maxi];
                }
            }
            if (max1 < a1 + b1){
                max1 = a1 + b1;
            }
        }
        System.out.println(max1);

        int max2 = 0;
        for(int m = 1; m < n-1; m++){
            int a = 0, b = 0, aMax = 0, bMax = 0;
            for(int i = 1; i <= m; i++){
                a += place[i];
            }
            for(int i = m; i < n-1; i++){
                b += place[i];
            }
            if(max2 < a + b){
                max2 = a + b;
            }
        }
        System.out.println(max2);



    }
}
