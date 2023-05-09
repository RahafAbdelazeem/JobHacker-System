package week4.reerser2;

import java.util.Scanner;

public class revsers {
    public static void main(String[] args){
         String S;
        Scanner in= new Scanner(System.in);
        S=in.next();
        StringBuilder sb= new StringBuilder(S);
         StringBuilder revstr= sb.reverse();
         System.out.print(revstr);


    }
}
