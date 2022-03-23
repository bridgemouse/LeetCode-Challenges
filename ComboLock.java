import java.util.*;
import java.io.*;
import java.lang.Math;

public class ComboLock{
  public static void main(String[] args)throws Exception {
      Scanner sc = new Scanner(System.in);
      while(sc.hasNextLine()){ 
          String line = sc.nextLine();
          if(line.equals("0 0 0 0") && sc.hasNextLine()){line = sc.nextLine();}
          else if(line.equals("0 0 0 0") && !(sc.hasNextLine())){break;}
          Scanner lineSc = new Scanner(line);
          ArrayList<Integer> combo = new ArrayList<Integer>();           
          while(lineSc.hasNext()){
              combo.add(lineSc.nextInt());   
          }     
            int st = combo.get(0);
            combo.remove(0);
            int current = st;
            int total = 120;
            for(int i = 0; i < 3; i++){
                int next = combo.get(i);
                if(i%2 == 0){
                  if(next > current){total += ((40 - next) + current);next=current;}
                  else{total += Math.abs(current - next);next=current;}
                  }
                else if(i%2 != 0){
                  if(next < current){total += ((40 - current) + next);next=current;}
                  else{total += Math.abs(current - next);next=current;}
                }
            }
            total = (total * 9);
            System.out.println(total);
        }     
    }
}