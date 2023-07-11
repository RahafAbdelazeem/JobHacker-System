package LinkedHashset;

import javax.management.Query;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int  testingnum;
        System .out.println(" enter the number of test cases ");
        Scanner scan = new Scanner(System.in);
        testingnum=scan.nextInt();
         for ( int i=0; i<testingnum;i++){
             int Q = scan.nextInt();
              scan.nextLine();
             LinkedHashSet <Integer> set= new LinkedHashSet<>();
             for (int j=0; j< Q ;j++){
                 String Query= scan.nextLine();
                  char oper= Query.charAt(0);
                  if ( oper=='a'){
                      int ele= Integer.parseInt(Query.substring(2));
                      set.add(ele);
                  }
                  else if(oper=='b'){
                      for (int ele : set) {
                          System.out.print(ele + " ");
                      }
                      System.out.println();
                  }
                  else if (oper=='c') {
                      int ele= Integer.parseInt(Query.substring(2));
                      set.remove(ele);
                  }

                  else if (oper=='d') {
                      int ele = Integer.parseInt(Query.substring(2));

                      if (set.contains(ele)) {

                          System.out.println(1);
                      }
                      else
                          System .out.println(-1);

                  }
                  else if(oper=='e'){
                      System.out.println(set.size());

                  }
                  else if(oper=='f') {
                      for (int ele : set) {
                          System.out.print(ele + " ");
                      }
                  }

             }

         }


    }
}
