package company.Arraayofcricle;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        double n = 3.14159;
        double R;
        double area ;
        Scanner Scan = new Scanner(System.in);
        R = Scan.nextDouble();
        area = n * R * R;
        System.out.printf("A= %.4f%n",area);
    }

}
