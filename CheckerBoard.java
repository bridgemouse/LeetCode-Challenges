import java.util.*;
import java.io.*;
import java.lang.Math;

public class CheckerBoard {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt();
        char[][] board = new char[size][size];
        for(int r = 0;r<size;r++){
            String in = sc.next();
            int b = 0, w = 0, bC = 0, wC = 0;
            for(int c = 0; c < size; c++){
                board[r][c] = in.charAt(c);
                if(in.charAt(c) == 'B'){b++;}
                else{w++;}
            }
            if(b != w){
                System.out.println("0");
                System.exit(0);
            }
            for(int i = 0; i < size; i++){
                if(board[r][i] == 'B'){
                    bC++;
                    wC = 0;
                    if(bC == 3){
                        System.out.println("0");
                        System.exit(0);
                    }
                }
                if(board[r][i] == 'W'){
                    wC++;
                    bC = 0;
                    if(wC == 3){
                        System.out.println("0");
                        System.exit(0);
                    }
                }
            }
        }
        for(int c = 0; c < size; c++){
            int bC = 0, wC = 0;
            for(int r = 0; r < size; r++){
                if(board[r][c] == 'B'){
                    bC++;
                    wC = 0;
                    if(bC == 3){
                        System.out.println("0");
                        System.exit(0);
                    }
                }
                if(board[r][c] == 'W'){
                    wC++;
                    bC = 0;
                    if(wC == 3){
                        System.out.println("0");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("1");
    }
}