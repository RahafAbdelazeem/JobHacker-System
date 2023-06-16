package week4.reversing;

import java.util.Scanner;

class reverser{

       public boolean revesering(String str){
             char ch[] = str.toCharArray();
             String rev = "";
             for (int i = ch.length - 1; i >= 0; i--) {
                 rev += ch[i];

             }
             System.out.print(rev);
             return false;
         }

     }



public class Main {

    public static void main(String[] args) {
         String normalstr;
        Scanner scan= new Scanner(System.in);
         normalstr= scan.next();
        boolean reversed= new reverser().revesering(normalstr);

	// write your code here
    }
}
