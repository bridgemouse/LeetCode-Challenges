package Challenges;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class Battle {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String attack = sc.nextLine();   
        ArrayList<Character> att = new ArrayList<Character>();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < attack.length(); i++){
          att.add(attack.charAt(i));
        }
        for(int j = 0; j < att.size(); j++){
          if(j < att.size() - 2){
            if((att.get(j) == 'R') && (att.get(j+1) == 'B') && (att.get(j+2) == 'L')){str.append('C');j+=2;}
            else if((att.get(j) == 'R') && (att.get(j+1) == 'L') && (att.get(j+2) == 'B')){str.append('C');j+=2;}
            else if((att.get(j) == 'L') && (att.get(j+1) == 'R') && (att.get(j+2) == 'B')){str.append('C');j+=2;}
            else if((att.get(j) == 'L') && (att.get(j+1) == 'B') && (att.get(j+2) == 'R')){str.append('C');j+=2;}
            else if((att.get(j) == 'B') && (att.get(j+1) == 'L') && (att.get(j+2) == 'R')){str.append('C');j+=2;}
            else if((att.get(j) == 'B') && (att.get(j+1) == 'R') && (att.get(j+2) == 'L')){str.append('C');j+=2;}
            else if(att.get(j) == 'R'){str.append('S');}
            else if(att.get(j) == 'B'){str.append('K');}
            else if(att.get(j) == 'L'){str.append('H');}
          }  
          else if(att.get(j) == 'R'){str.append('S');}
          else if(att.get(j) == 'B'){str.append('K');}
          else if(att.get(j) == 'L'){str.append('H');}
        }
        System.out.println(str);
    } 
}
