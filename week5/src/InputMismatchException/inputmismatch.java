package InputMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;


public class inputmismatch{

    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        Scanner scan = new Scanner(System.in);
        boolean isInputValid = false;
        while (!isInputValid) {
            try {
                System.out.println("Enter first Integer");
                num1 = scan.nextInt();
                System.out.println(" Enter Second Integer");
                num2 = scan.nextInt();
                 isInputValid=true;
            }

             catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
                scan.nextLine();

            }
            int result = num1 + num2;
            System.out.println(result);

        }
    }
}

