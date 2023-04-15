package company.columninArray;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int sum=0, average=0;
        String nameofFunction;
        int columnNumber;
        Scanner input = new Scanner(System.in);
        float M[][]= new float[12][12];
        columnNumber= input.nextInt();
        nameofFunction= input.next();
        for (int j=0;j<12;j++)
        {
            for(int i=0;i<12;i++)
            {
                M[i][j]=input.nextFloat();
            }
        }
        for (int j=0;j<12;j++){
            sum+= M[columnNumber][j];
        }
        average=sum/12;
        if ( nameofFunction.equals ("S")) {
            System.out.printf("%.1f\n", sum);
        }
        else  if( nameofFunction.equals ("M")) {
            System.out.printf("%.1f\n",average);
        }
    }
}
