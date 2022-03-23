

import java.util.*;
import java.io.*;
import java.lang.Math;

public class WizardofOdds{
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in); 
        Double n = sc.nextDouble();
        Double k = sc.nextDouble();
        if(Math.pow(2, k) >= n){System.out.println("Your wish is granted!");}
        else{System.out.println("You will become a flying monkey!");}
    }
}
    

