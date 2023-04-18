package palindrom;

import java.util.Scanner;

class palindrom {
    public static void ispalindrom(String str) {

        String  rev = "";
        boolean P = false;
        for (int i = str.length()- 1; i >= 0; i--) {
            rev +=str.charAt(i);
        }
        if (str.equals(rev)) {
                P = true;
                System.out.print("Yes");
        }
         else{System.out.print("No");}

    }
}



public class Main {

    public static void main(String[] args) {
        String  S;
        Scanner scan= new Scanner(System.in);
        S= scan.next();
        palindrom palindromString= new palindrom();
         palindromString.ispalindrom(S);


    }
}
