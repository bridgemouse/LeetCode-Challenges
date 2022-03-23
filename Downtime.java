import java.util.*;
import java.io.*;
import java.lang.Math;

public class Downtime {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), first = 0; 
        double k = sc.nextDouble(); 
        double p = 1, tP= 1;
        int[] time = new int[n];
        time[0] = sc.nextInt();
        for(int i = 1; i < n; i++){
            time[i] = sc.nextInt();
            while(time[first] + 1000 <= time[i]){
                first++;
                tP--;
            }
            tP++;
            p = Math.max(p, tP);
        }
        //System.out.println(max);
        System.out.println((int)Math.ceil(p/k));
    }
}