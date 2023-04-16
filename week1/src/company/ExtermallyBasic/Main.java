package company.ExtermallyBasic;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int A,B;
        int sum = 0;
        Scanner scan =new Scanner(System.in);
        A=scan.nextInt();
        B=scan.nextInt();
        sum+=A+B;
        System.out.println("X = "+ sum);
    }
}
