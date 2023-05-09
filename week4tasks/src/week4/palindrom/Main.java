package week4.palindrom;

import java.util.Scanner;

class palindrom {
    public  String palindromstring(String str) {
        boolean Palind = false;
        char charactr[] = str.toCharArray();
        String rev = "";
        for (int i = charactr.length - 1; i >= 0; i--) {
            rev += charactr[i];
            if (rev.equals (str)) {
                Palind = true;
            }

        }

        if (Palind) {
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
     String   p=new palindrom().palindromstring(STr);

	// write your code here
    }
}
