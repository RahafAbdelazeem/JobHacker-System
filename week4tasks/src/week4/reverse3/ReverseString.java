package week4.reverse3;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        String str;
        Scanner sc =new Scanner(System.in);
        str= sc.next();
        StringBuffer stringf = new StringBuffer(str);
        StringBuffer reversingString= stringf.reverse();
        System.out.print(reversingString);
    }
}
