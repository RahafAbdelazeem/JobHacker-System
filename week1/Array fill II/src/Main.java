import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        int T, j = 0;
        int N[] = new int[1000];
        Scanner input = new Scanner(System.in);
        T = input.nextInt();
        for (int i = 0; i < 1000; i++) {
            System.out.printf("N[%d]= %d\n", i, j++);
            if (j == T)
                j = 0;
        }

    }
}