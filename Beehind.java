package Challenges;
import java.util.*;
import java.io.*;

class CodeTester {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
        int sweet = sc.nextInt();
        int sour = sc.nextInt();
        if(sweet == 0 && sour == 0){break;}
        else if(sweet + sour == 13){System.out.println("Never speak again.");}
        else if(sweet > sour){System.out.println("To the convention.");}
        else if(sweet < sour){System.out.println("Left beehind.");}
        else if(sweet == sour){System.out.println("Undecided.");}
    }
    }
}