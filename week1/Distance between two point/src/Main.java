import java.io.IOException;
import java. util.*;

public class Main {
    public static void main(String[] args) {
        double x1,y1,x2,y2;
        double Distance;
        Scanner sc = new Scanner(System.in);
        x1= sc.nextDouble();
        y1=sc.nextDouble();
        x2=sc.nextDouble();
        y2= sc.nextDouble();
        Distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.printf("%.4f\n",  Distance);



    }
}