import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        int num;
        Scanner input = new Scanner(System.in);
        num =input.nextInt();
        for(int i=1;i<=num; i++){
            for (int j=1;j<=1;j++){
                if(j==1)
                    System.out.printf("%d %d %d\n",i,i*i,i*i*i);
                else
                    System.out.printf("%d %d %d", i,i*i,i*i*i);
            }
        }




    }

    }
