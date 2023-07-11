package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casingnum;
        casingnum = input.nextInt();
        for (int t = 0; t < casingnum; t++) {
            int query = input.nextInt();
            input.nextLine();
            Set<Integer> set = new HashSet<>();
            for (int q = 0; q < query; q++) {
                String Quering = input.nextLine();
                char op = Quering.charAt(0);
                if (op == 'a') {
                    int theElement = Integer.parseInt(Quering.substring(2));
                    set.add(theElement);
                } else if (op == 'b') {
                    for (int elem : set) {
                        System.out.print(elem+" ");
                    }
                     System.out.println();

                } else if (op == 'c') {
                    int theElement = Integer.parseInt(Quering.substring(2));
                    set.remove(theElement);
                }
                 else if ( op == 'd'){
                    int theElement = Integer.parseInt(Quering.substring(2));
                    if(set.contains(theElement)){
                         System.out.println(1);

                    }else
                        System.out.println(-1);
                }
                 else if ( op == 'e'){
                     System.out.println(set.size());
                }

            }
        }
    }
}
