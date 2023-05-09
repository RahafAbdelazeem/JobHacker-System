package week4.reversing;

import java.util.Scanner;

class reverser{
     public reverser revesering(String str){
          char ch[]= str.toCharArray();
          String rev= "";
          for(int i=ch.length-1; i>=0;i--){
              rev+= ch[i];

          }
           System.out.print(rev);


         return null;
     }

 }

public class Main {

    public static void main(String[] args) {
         String S;
        Scanner scan= new Scanner(System.in);
         S= scan.next();
        reverser reversed= new reverser().revesering(S);
	// write your code here
    }
}
