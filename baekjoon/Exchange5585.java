package baekjoon;

import java.util.Scanner;

public class Exchange5585 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int price = sc.nextInt();
    int money = 1000-price;
    int[] coin = {500,100,50,10,5,1};
    int count = 0;
    for (int j : coin) {
      count += money / j;
      money = money % j;
    }
    System.out.println(count);
  }
}
