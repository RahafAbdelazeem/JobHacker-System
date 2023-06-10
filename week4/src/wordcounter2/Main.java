package wordcounter2;

import java.util.Scanner;

class  WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the word to count: ");
        String wordToCount = scanner.nextLine();

        int count = (inputString.length() - inputString.replace(wordToCount, "").length()) / wordToCount.length();

        System.out.println("The word \"" + wordToCount + "\" occurs " + count + " times in the input string.");
    }
}