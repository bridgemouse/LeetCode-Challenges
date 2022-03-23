import java.util.*;
import java.io.*;
import java.lang.Math;

class CodeTester {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int cases = sc.nextInt();
    for(int i = 0; i < cases; i++){
      int god = sc.nextInt();
      int mech = sc.nextInt();
      List<Integer> God = new ArrayList<Integer>();
      List<Integer> Mech = new ArrayList<Integer>();
      for(int j = 0; j < god; j++){God.add(sc.nextInt());}
      for(int k = 0; k < mech; k++){Mech.add(sc.nextInt());}
      Collections.sort(God);
      Collections.sort(Mech);  
      Collections.reverse(God);
      Collections.reverse(Mech);
      //System.out.println(God.get(0));
      //System.out.println(Mech.get(0));
      if(God.get(0) > Mech.get(0)){System.out.println("Godzilla");}
      else if(God.get(0) < Mech.get(0)){System.out.println("MechaGodzilla");}
      else if((God.get(0) == Mech.get(0)) && (God.size() == Mech.size())){System.out.println("Godzilla");}
      else if(God.get(0) == Mech.get(0)){System.out.println("Undecided");}
    }
  }
}