import java.io.*;
import java.util.Scanner;
public class L12aTest
{
   public static void main(String[] args) throws IOException 
   {
      //FileReader scores = new FileReader("quiz_scores.csv");
      Scanner scoreScan = new Scanner(new File("quiz_scores.csv"));
      scoreScan.useDelimiter(",");
      Scanner roomScan = new Scanner(new File("rooms.csv"));
      roomScan.useDelimiter(",");
      Scanner tScan = new Scanner(new File("treasures.csv"));
      tScan.useDelimiter(",");       
      int high = 0;
      int low = 0;
      double ave = 0.0;
      String name = "";
      while(scoreScan.hasNext()){
            System.out.print(scoreScan.next()+" ");  
      }     
   }
}