package baekjoon;

import java.util.Scanner;

public class GetHoney {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, max = 0;
        int[] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //bHB
        max += sum - arr[0] - arr[n-1];

        //bBH
        for(int i = 1, bee1 = 0, bee2 = sum - arr[0] - arr[i]; i < n - 1; bee1 += arr[i], bee2 -= arr[++i]){
            max = Math.max(max, bee1 + (bee2 * 2));
        }

        //hBB
        for(int i = n-2, bee1 = sum - arr[i] - arr[i+1], bee2 = 0; i > 0; bee2 += arr[i], bee1 -= arr[--i]){
            max = Math.max(max, bee2 + (bee1 * 2));
        }

        System.out.println(max);
    }
}
