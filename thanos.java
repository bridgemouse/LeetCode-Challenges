package Challenges;
import java.util.*;
import java.io.*;

class thanos {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    double t = sc.nextDouble();
    while(t>0){
      double p = sc.nextDouble();
      double r = sc.nextDouble();
      double f = sc.nextDouble();
      int years = 0;
      while(p<=f){
        p = p * r;
        years++;
      }
      System.out.println(years);
      t--;
    }
  }
}