package InputMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;


public class inputmismatch{

    public static void main(String[] args) {
        int num1 = 0, num2=0;
        Scanner  scan =new Scanner( System .in);
            try{
                System.out.print("enter two enteger");
                num1=scan.nextInt();
                num2= scan.nextInt();

            }

            catch (InputMismatchException ex){
                System.out.println ("enter  real integer");
                scan.nextLine();

            }
        int result= num1+ num2;
        System .out .println(result);

    }
}

