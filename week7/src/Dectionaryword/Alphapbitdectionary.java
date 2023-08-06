package Dectionaryword;

import java.util.*;

public class Alphapbitdectionary {
    private Map<Character, List<String>> wordsapp;

    public Alphapbitdectionary() {
         wordsapp= new TreeMap<>();
         for ( char c= 'a';c<='z';c++)
              wordsapp.put(c,new ArrayList<>());
    }
    public void wordsAdding(String Word){
         if (Word.length()>0){
             char Firstcharacter= Character.toLowerCase(Word.charAt(0));
             List<String>listingWord= wordsapp.get(Firstcharacter);
             listingWord.add(Word);
             Collections.sort(listingWord);
         }
    }
     public void displaylettersandwords(){
        for (char character='a';character<='z';character++){
            List<String>words= wordsapp.get(character);
            if(!words.isEmpty())
                 System.out.println(character+":"+ String.join(",",words));
        }
     }
      public void printrelatedword(char wordlitter){
        wordlitter=Character.toLowerCase(wordlitter);
        List<String> Wordcollection= wordsapp.get(wordlitter);
        if (!Wordcollection.isEmpty())
            System.out.println(wordlitter+":"+String.join(",",Wordcollection));
        else
            System.out.println(wordlitter);
      }
}

