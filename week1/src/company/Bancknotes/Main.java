package company.Bancknotes;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int note, aux;
        Scanner  input= new Scanner(System.in);
        note= input.nextInt();
        System.out.println(note);
        System.out.printf("%d nota(s) de R$ 100,00\n", note/100);
        aux= note%100;
        System.out.printf("%d nota(s) de R$ 50,00\n",aux/50);
        aux=(aux%50);
        System.out.printf("%d nota(s) de R$ 20,00\n",aux/20);
        aux=aux%20;
        System.out.printf("%d nota(s) de R$ 10,00\n",aux/10);
        aux=aux%10;
        System.out.printf("%d nota(s) de R$ 5,00\n",aux/5);
        aux=aux%5;
        System.out.printf("%d nota(s) de R$ 2,00\n",aux/2);
        aux=aux%2;
        System.out.printf("%d nota(s) de R$ 1,00\n",aux/1);


    }
}
