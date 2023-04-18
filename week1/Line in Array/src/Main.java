import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException  {
        float sum=0,average=0;
        String nameOfFunction;
        int numOfRow;
        float M[][]= new float[12][12];
        Scanner input = new Sanner(System.in);
        numOfRow= input.nextInt();
        nameOfFunction= input.next();
        for (int i=0;i<=12;i++)
        {
            for(int j=0;j<=12;j++)
            {
                M[i][j]=input.nextFloat();
            }
        }
        for (int j=0;j<=12;j++){
            sum+= M[numOfRow][j];
        }
        average=sum/12;
        if ( nameOfFunction == "S"){
            System.out.printf("%.1f\n",sum);
            if( nameOfFunction == "M") {
                System.out.printf("%.1f\n",average);
            }



        }
    }
  }
