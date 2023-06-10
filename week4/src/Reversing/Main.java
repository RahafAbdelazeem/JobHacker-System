package Reversing;


import java.util.Scanner;

class revresion{
    public String reverseString( String Str){
         char[]S= Str.toCharArray();
         String reversed="";
        for (int i= S.length-1;i>=0;i--) {
            reversed  += S[i];
        }
       return reversed;
    }
}

public class Main {

    public static void main(String[] args) {
         String  str;
         Scanner scan = new Scanner(System.in);
         str= scan.next();
            revresion reverse= new revresion();
               String finalreversed=reverse.reverseString(str);
                System.out.print(finalreversed);



    }
}
