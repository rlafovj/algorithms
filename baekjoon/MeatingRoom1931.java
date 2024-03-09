package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class MeatingRoom1931 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] startAndEnd = new int[n][2];
    for(int i = 0; i < n; i++){
      startAndEnd[i][0] = sc.nextInt();
      startAndEnd[i][1] = sc.nextInt();
    }
    Arrays.sort(startAndEnd, (o1, o2)->{
      if(o1[1] == o2[1])
        return o1[0]-o2[0];
    else return o1[1]-o2[1];});

    int previousEndtime = 0, count = 0;

    for(int i = 0; i < n; i++){
      if(startAndEnd[i][0] >= previousEndtime){
        previousEndtime = startAndEnd[i][1];
        count++;
      }
    }
    System.out.print(count);
  }
}
