package company.Belowmaindiagonal;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int sum=0, aver=0;
        String O ;
        float M [][]= new float[12][12];
        Scanner scan= new Scanner(System.in);
        O= scan.next();
        for(int j=0; j<12;j++){
            for(int i=0;i<12;i++){
                M[i][j]=scan.nextFloat();
            }
        }
        for(int j=0;j<12;j++){
            for(int i=1;i<12;i++){
                sum+=M[i][j];
            }
        }
        aver=sum/72;
        if(O.equals("S")){
            System.out.printf("%.1f\n", sum);
        }
        else if(O.equals("M")){
            System.out.printf("%.1f\n",aver);
        }
    }
}
