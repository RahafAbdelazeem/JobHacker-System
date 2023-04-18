package rversed;

import java.util.Scanner;

class reverse{
      public  static StringBuilder reversdbilder(String S){
         StringBuilder str= new StringBuilder(S);
          str.reverse();
           return str;

      }
 }

public class Main {

    public static void main(String[] args) {
	  String mystring;
	  Scanner input=new Scanner(System.in);
	   mystring= input .next();
	      reverse rev= new reverse();
	      StringBuilder reversed= rev.reversdbilder(mystring);
	       System.out.print(reversed);

    }
}
