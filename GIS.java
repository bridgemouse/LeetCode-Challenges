package Challenges;
import java.util.*;
import java.io.*;
import java.lang.Math;
public class GIS {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder(); 
        int len = sc.nextInt(), count = 0, max = 0;
        String in = "";
        for(int j = 0; j < len; j++){
            in = sc.next();
            if(j == 0){out.append(in); max = Integer.parseInt(in); count++;}
            else if(Integer.parseInt(in) > max){out.append(" "+in);max = Integer.parseInt(in);count++;}
        }
        System.out.println(count+"\n"+out);
    }
}
