import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
         int N[]=new int[20];
         int j=20;
         Scanner sc = new Scanner(System.in);
         for(int i=0;i<20; i++){
             N[i]= sc.nextInt();
         }
          for(int i=0;i<20;i++)
          {
              j--;
              System.out.printf("N[%d]=%d\n", i ,N[j]);
          }

    }
}