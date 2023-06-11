package week4.reerser2;

import java.util.Scanner;

public class revsers {
    public static void main(String[] args){

         String normalstring;
        Scanner in= new Scanner(System.in);
        normalstring=in.next();
        StringBuilder sb= new StringBuilder(normalstring);
         StringBuilder revstr= sb.reverse();
         System.out.print(revstr);


    }
}
