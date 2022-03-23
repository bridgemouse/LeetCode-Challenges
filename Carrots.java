package Challenges;
import java.util.*;
import java.io.*;

class Carrots {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = sc.nextInt();
    int i = -1;
    while(sc.hasNextLine()){
        sc.nextLine();
        i++;
    }
    if (i == n){
        System.out.println(p);
    }
    else{
        System.out.println("Wrong "+n+" "+i);
    }
}
}