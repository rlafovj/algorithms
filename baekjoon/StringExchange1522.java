package baekjoon;
//a와 b로만 이루어진 문자열이 주어질 때,  a를 모두 연속으로 만들기 위해서 필요한 교환의 회수를 최소로 하는 프로그램을 작성하시오.
//이 문자열은 원형이기 때문에, 처음과 끝은 서로 인접해 있는 것이다.
//예를 들어,  aabbaaabaaba 이 주어졌을 때, 2번의 교환이면 a를 모두 연속으로 만들 수 있다.
//첫째 줄에 문자열이 주어진다. 문자열의 길이는 최대 1,000이다.

import java.util.Scanner;

public class StringExchange1522 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = 0;
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == 'a'){
        n++;
      }
    }
    int fcnt = n;
    for(int i = 0; i < s.length(); i++){
      int end = i + n - 1;
      int cnt = 0;
      for(int j = i; j <= end; j++){
        int k = j;
        if(j >= s.length()){
          k = j-s.length();
        }
        if(s.charAt(k) == 'b'){
          cnt++;
        }
      }
      fcnt = Math.min(cnt, fcnt);
    }
    System.out.println(fcnt);
  }
}
