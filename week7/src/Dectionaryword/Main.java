package Dectionaryword;

public class Main {
    public static void main(String[] args) {
        Alphapbitdectionary mapping= new Alphapbitdectionary();
        mapping.wordsAdding("Appel");
        mapping.wordsAdding("cat");
        mapping.wordsAdding("dog");
        mapping.wordsAdding("wood");
        mapping.wordsAdding("Banna");
        mapping.wordsAdding("Elephant");
        mapping.wordsAdding("Pinable");
        mapping.wordsAdding("Snak");
         mapping.displaylettersandwords();
         mapping.printrelatedword('A');
         mapping.printrelatedword('P');
         mapping.printrelatedword('W');
         mapping.printrelatedword('S');
         mapping.printrelatedword('R');


    }
}
