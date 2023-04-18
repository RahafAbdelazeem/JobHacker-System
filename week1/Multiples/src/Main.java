import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
         int x;
         int y;
         int divsionrest1=0;
        int divsionrest2=0;
         Scanner scan = new Scanner(System.in);
         x= scan.nextInt();
         y=scan.nextInt();
         divsionrest1=y%x;
        divsionrest2=x%y;
         if(divsionrest1==0||divsionrest2==0 )
             System.out.println("Sao Multiplos");
         else
             System.out.println("Nao sao Multiplos");

    }
}