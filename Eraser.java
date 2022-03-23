import java.util.*;
import java.io.*;

class CodeTester {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int sec = sc.nextInt();
    String first = sc.next();
    String second = sc.next();;
    String del = "";
    char ch;
    for(int i = 1; i <= sec; i++){
      for(int j = 0; j < first.length(); j++){
        ch = first.charAt(j);
        if(ch == '0'){del = del + "1";}
        else if(ch == '1'){del = del + "0";}
      }
      if(sec == 1){break;}
      else if(i != sec){
        first = del;
        del = "";
      }
    }
    if(del.equals(second)){System.out.println("Deletion succeeded");}
    else if(!(del.equals(second))){System.out.println("Deletion failed");}
  }
}