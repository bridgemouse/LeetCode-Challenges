package Challenges;
import java.util.*;
import java.io.*;

class MarioJump {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    while(sc.hasNext()){
      for(int i = 1; i <= c; i++){
        int high = 0;
        int low = 0;
        int walls = sc.nextInt();
        System.out.println(walls);
        int height = sc.nextInt();
        System.out.print(height+" ");
        int pHeight = height;
        for(int j = 0; j < walls-1; j++){
          if(walls == 1){break;}
          if(pHeight < height){
            high++;
            pHeight = height;
            height = sc.nextInt();
            System.out.print(height+" ");
          }
          else if(pHeight > height){
            low++;
            pHeight = height;
            height = sc.nextInt();
            System.out.print(height+" ");
          }
          else if(pHeight == height){
            pHeight = height;
            height = sc.nextInt();
            System.out.print(height+" ");
          }
        }
        System.out.println("Case "+(i)+": "+(high)+" "+low);
      }
  }
    }
}