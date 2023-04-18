import java.io.IOException;
import  java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
       int  number,even=0,odd=0,positive=0,negative=0;
       for (int x=1;x<=5;x++){
           Scanner scan= new Scanner(System.in);
           number =scan.nextInt();
           if(number %2==0){
               even++;
           }
           if(number %2!=0){
               odd++;
           }
           if(number >0){
               positive++;
           }
           if(number<0)
           {
               negative++;
           }

       }
        System.out.print(even+" valor(es) par(es)\n");
        System.out.print(odd+" valor(es) impar(es)\n");
        System.out.print(positive+" valor(es) positivo(s)\n");
        System.out.print(negative+" valor(es) negativo(s)\n");
    }
}