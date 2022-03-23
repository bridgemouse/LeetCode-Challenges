package Challenges;
import java.util.*;
import java.io.*;

class filip {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String val1 = sc.next();
    String val2 = sc.next();
    char ch;
    String f1 ="";
    String f2 ="";
    for(int i = 0; i < val1.length(); i++){
      ch = val1.charAt(i);
      f1 = ch+f1;
    }
    for(int i = 0; i < val2.length(); i++){
      ch = val2.charAt(i);
      f2 = ch+f2;
    }
    if(Integer.parseInt(f1) > Integer.parseInt(f2)){System.out.println(Integer.parseInt(f1));}
    if(Integer.parseInt(f1) < Integer.parseInt(f2)){System.out.println(Integer.parseInt(f2));}
  }
}