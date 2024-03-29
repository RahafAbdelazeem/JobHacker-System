package sumandaverage;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class ScoresSumAverage {
     public static void ReadFromWebtoFile(URL url,File F) throws IOException {
         InputStream input= url.openStream();
         OutputStream output=  new FileOutputStream(F);
          byte [] ereader= new byte[4096];
          int ReadingByte;
          while((ReadingByte= input.read(ereader))!=-1){
              output.write(ereader,0,ReadingByte);
         }
          input.close();
          output.close();
     }
      public  static int GetSum(File f) throws FileNotFoundException{
         int sumation=0;
         Scanner scan= new Scanner(f);
         while( scan.hasNext()){
             sumation+=scan.nextInt();
         }
          scan.close();
         return sumation;
      }
      public static int GEtAverager(File f) throws FileNotFoundException{
         int aver;
         int counter=0;
          int sum=GetSum(f);
         Scanner sc= new Scanner(f);
         while(sc.hasNext()){
             sc.nextInt();
             counter ++;
         }
         sc.close();
          aver= sum/counter;
         return aver;
      }
    public static void main(String[] args)   {
         try {
             URL ur = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");
             File Scores = new File("Scores.txt");
             ReadFromWebtoFile(ur, Scores);
             int theSum = GetSum(Scores);
             int theaverage = GEtAverager(Scores);
             System.out.println("Sumation: "  +  theSum);
             System.out.println("AVARAGE: "  +  theaverage);

         } catch (IOException e) {
             System.out.print(" The error:"+ e.getMessage());
         }
    }
}

