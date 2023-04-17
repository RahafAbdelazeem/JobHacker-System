package Validparantheses;

import java.util.Scanner;
import java.util.Stack;

class vaild {
    public static boolean isValid(String s) {
        Stack<Character> symbol = new Stack<>();
        for (char C : s.toCharArray()) {
                if (C == '(' || C == '{' || C == '[') {
                    symbol.push(C);
                }
                 else if (C ==')'&& !symbol.isEmpty()&& symbol.peek()=='('){
                    symbol.pop();
                    System.out.print("true");
                }


                 else if( C =='}'&& !symbol.isEmpty()&& symbol.peek() =='{'){
                     symbol.pop();
                    System.out.print("true");
                }
                 else if (C == ']'&&!symbol.isEmpty()&& symbol.peek() =='[') {
                     symbol.pop();
                    System.out.print("true");
                }
                 else{
                     return false;
                }
        }
        return symbol.isEmpty();



    }
}

public class Main {

    public static void main(String[] args) {
        String S;
        Scanner scan= new Scanner(System.in);
        S= scan.next();
        boolean vailidation =  vaild.isValid(S);


    }
}



