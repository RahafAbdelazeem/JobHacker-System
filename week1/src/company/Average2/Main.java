package company.Average2;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        double A,B,C;

        double average=0;
        Scanner sc = new Scanner(System.in);
        A= sc.nextDouble();
        B=sc.nextDouble();
        C=sc.nextDouble();

        average+= ((A*2)/10)+((B*3)/10)+((C*5)/10);
        System.out.printf("MEDIA = %.1f\n", average);

    }
}
