import java.io.IOException;
import  java.util.*;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
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