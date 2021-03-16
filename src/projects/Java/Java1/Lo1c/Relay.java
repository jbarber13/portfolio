/**
* Relay2.java -- interactive
*
*@author Jake Barber
*@version 9-SEP-2015
*/
import java.util.Scanner;
public class Relay{
   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the name of the first runner:");
      String runner1 = scan.nextLine();
      
      System.out.println("Enter the name of the second runner:");
      String runner2 = scan.nextLine();
      
      System.out.println("Enter the name of the third runner:");
      String runner3 = scan.nextLine();
      
      System.out.println("Enter the name of the last runner:");
      String runner4 = scan.nextLine();
      
      
      System.out.println("Enter "+runner1+"'s time:");
      int time1 = scan.nextInt();
      
      System.out.println("Enter "+runner2+"'s time:");
      int time2 = scan.nextInt();
      
      System.out.println("Enter "+runner3+"'s time:");
      int time3 = scan.nextInt();
      
      System.out.println("Enter "+runner4+"'s time:");
      int time4 = scan.nextInt();
      
      
      final int SECONDS_PER_MINUTE = 60;
      int minutes = 0;
      int seconds = 0;
      
      
      
      System.out.println(runner1+" ran the first leg in "+time1+" seconds.");
      System.out.println(runner2+" ran the second leg in "+time2+" seconds.");
      System.out.println(runner3+" ran the third leg in "+time3+" seconds.");
      System.out.println(runner4+" ran the last leg in "+time4+" seconds.");
      
      int totalSeconds = time1+time2+time3+time4;
      minutes = totalSeconds/SECONDS_PER_MINUTE;
      seconds = totalSeconds-(minutes*SECONDS_PER_MINUTE);
      
      System.out.println("\nThe 4X400m relay was run in "+minutes+" minutes and "+seconds+" seconds.");
   
   
   
   
   }
}