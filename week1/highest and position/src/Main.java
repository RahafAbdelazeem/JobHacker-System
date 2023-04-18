import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {

         int num, Highest=0, position=0;
        Scanner sc= new Scanner(System.in);
         for (int i=1;i<=100;i++){
             num= sc.nextInt();
             if(num>Highest){
                 Highest=num;
                 position=i;
             }
         }
         System.out.println(Highest);
         System.out.println(position);
    }
}