package WordCounter;

import java.util.Scanner;
import java.util.StringTokenizer;

class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the word to count: ");
        String wordToCount = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(inputString, " ");
        int count = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (token.contains(wordToCount)) {
                count++;
            }
        }

        System.out.println("The word \"" + wordToCount + "\" occurs " + count + " times in the input string.");
    }
}