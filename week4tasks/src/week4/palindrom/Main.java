package week4.palindrom;

import java.util.Scanner;

class palindrom {
    public palindrom palindromstring(String str) {
        boolean P = false;
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
            if (rev.equals (str)) {
                P = true;
            }

        }


        if (P) {
            System.out.print("yes");
        } else {

            System.out.print("No");
        }
        return null;
    }
}


public class Main {

    public static void main(String[] args) {
         String STr;
        Scanner input= new Scanner(System.in);
        STr= input.next();
        palindrom  p=new palindrom().palindromstring(STr);

	// write your code here
    }
}
