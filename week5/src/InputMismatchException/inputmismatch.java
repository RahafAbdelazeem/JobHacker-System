package InputMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;


public class inputmismatch{

    public static void main(String[] args) {
        int num1 = 0, num2=0;
        Scanner  scan =new Scanner( System .in);

        while (true)
        {
            try{
                System.out.print("enter 2 enteger");
                num1=scan.nextInt();
                 num2= scan.nextInt();
                  break;

            }

            catch (InputMismatchException ex){
                System.out.println ("Enter valid integer %n %n");
                scan.nextLine();

            }




        }
        int result= num1+ num2;
        System .out .println(result);

    }
}
