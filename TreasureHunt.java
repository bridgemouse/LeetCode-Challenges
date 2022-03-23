package Challenges;

import java.util.*;
import java.io.*;
import java.lang.Math;

class TreasureHunt {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();    
    char m[][] = new char[r][c];
    for(int i = 0; i < r; i++){
      String in = sc.next();
      System.out.println(in);
      for(int j = 0; j < c; j++){ 
        m[i][j] = in.charAt(j);
      }
    }
    int curR = 0, curC = 0, moves = 0;
    Boolean inBounds = true;
    Boolean playing = true;
    while(playing){
      moves++;
      if(moves<3000){
        if(curR < 0 || curC < 0 || curR > r -1 || curC > c -1){
          System.out.println("Out");
          inBounds = false;
          playing = false;
        }
        else if(m[curR][curC] == 'N'){
          curR--;
          playing = true; 
          inBounds = true;
        }
        else if(m[curR][curC] == 'S'){
          curR++;
          playing = true; 
          inBounds = true;
        }
        else if(m[curR][curC] == 'W'){
          curC--;
          playing = true; 
          inBounds = true;
        }
        else if(m[curR][curC] == 'E'){
          curC++;
          playing = true; 
          inBounds = true;
        }
        else if(m[curR][curC] == 'T'){
          System.out.println(moves);
          playing = false; 
          inBounds = true;
        }
      }
      else{
        System.out.println("Lost");
        playing = false;
      }  
    }
  }
}