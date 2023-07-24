package countwords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class countword {

    public static void main(String[] args) {

        String linocoln= "src/countwords/lincoln.txt";
        int words = 0;


        try (BufferedReader f= new BufferedReader(new FileReader(linocoln))) {
             String L;

            while ((L=f.readLine())!=null) {
                String [] word= L.split("[ ,-,_, /]");
                words+= word.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(words + " words");

    }
}