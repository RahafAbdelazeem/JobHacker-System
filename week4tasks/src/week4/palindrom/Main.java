package week4.palindrom;

import java.util.Scanner;
class palindrom {

    public boolean palindromstring(String str) {
        boolean palind = false;
        char charactr[] = str.toCharArray();
        String rev = "";
        for (int i = charactr.length - 1; i >= 0; i--) {
            rev += charactr[i];
            if (rev.equals(str)) {


                palind = true;
            }
        }
            if (palind) {

                System.out.print("yes");
            } else {

                System.out.print("No");
            }



        return false;
    }
}



public class Main {

    public static void main(String[] args) {
         String inputstring;
        Scanner input= new Scanner(System.in);
       inputstring = input.next();
     boolean plaindedstring=new palindrom().palindromstring(inputstring);


	// write your code here
    }
}
