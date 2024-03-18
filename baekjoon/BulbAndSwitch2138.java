package baekjoon;

import java.util.Scanner;

public class BulbAndSwitch2138 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int n = sc.nextInt();
    String now = sc.next();
    String target = sc.next();
    String copyTarget = target;
    char[] arrNow = now.toCharArray();
    char[] arrTarget = target.toCharArray();
    int cnt = 0;
    for(int i = 1; i < n; i++){
      if(arrTarget[i-1] != arrNow[i-1]){
        cnt++;
        if(arrNow[i] == '0'){
          arrNow[i] = '1';
        }else arrNow[i] = '0';
        if(arrNow[i+1] == '0'){
          arrNow[i+1] = '1';
        }else arrNow[i+1] = '0';
      }
    }
    System.out.println(cnt);
  }
}
