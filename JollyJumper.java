import java.util.*;
import java.io.*;
import java.lang.Math;

class CodeTester {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNextLine()){
      String line = sc.nextLine();
      Scanner lineSc = new Scanner(line);
      while(lineSc.hasNext()){
        int val = 0;
        int sum = 0;
        int size = lineSc.nextInt();
        int input[] = new int[size];
        int check[] = new int[size];
        for(int i = 0; i < size; i++){
          input[i] = lineSc.nextInt();
        }
        for(int j = 0; j < size-1; j++){
          val = Math.abs(input[j]-input[j+1]);
          if(val < size){check[val] = 1;}
        }
        for(int k = 0; k < size; k++){
          sum = sum + check[k];
        }
        if(sum == (size-1)){System.out.println("Jolly");}
        else {System.out.println("Not jolly");}
      }
    }
  }
}