/**
* Relay.java
*
*@author Jake Barber
*@version 9-SEP-2015
*/
public class Relay{
   public static void main(String[] args){
   
      final String RUNNER1 = "Sue";
      final String RUNNER2 = "Carla";
      final String RUNNER3 = "Janet";
      final String RUNNER4 = "Brenda";
      final int TIME1 = 72;
      final int TIME2 = 68;
      final int TIME3 = 70;
      final int TIME4 = 67;
      final int SECONDS_PER_MINUTE = 60;
      int minutes = 0;
      int seconds = 0;
      
      
      
      System.out.println(RUNNER1+" ran the first leg in "+TIME1+" seconds.");
      System.out.println(RUNNER2+" ran the second leg in "+TIME2+" seconds.");
      System.out.println(RUNNER3+" ran the third leg in "+TIME3+" seconds.");
      System.out.println(RUNNER4+" ran the last leg in "+TIME4+" seconds.");
      
      int totalSeconds = TIME1+TIME2+TIME3+TIME4;
      minutes = totalSeconds/SECONDS_PER_MINUTE;
      seconds = totalSeconds-(minutes*SECONDS_PER_MINUTE);
      
      System.out.println("\nThe 4X400m relay was run in "+minutes+" minutes and "+seconds+" seconds.");
   
   
   
   
   }
}