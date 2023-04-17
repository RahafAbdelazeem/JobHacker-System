package comreverse;

import java.util.Scanner;

class buffererversed{
     public static StringBuffer stringreverser(String str){
         StringBuffer sf= new StringBuffer(str);
          sf.reverse();
         return sf;

     }

 }

public class Main {

    public static void main(String[] args) {
	 String normalString;
	  Scanner sc=new Scanner(System.in);
	   normalString=sc.next();
	   StringBuffer revstring= buffererversed.stringreverser(normalString);
	   System.out .print(revstring);

    }
}
