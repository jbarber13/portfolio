/**
* Cooky.java -- Calculates needed ingredients
*
*@author Jake Barber
*@version 16-SEP-2015
*/
import java.util.Scanner;
public class Cooky{
   public static void main(String args[]){
      final int OZ_LB = 16;
      final int DOZEN = 12;
      final int BUTTER_STICKS_CP = 2;
      final int BUTTER_STICKS_LB = 4;
      final int SUGAR_OZ_CP = 7;
      final int FLOUR_OZ_CP = 5;
      final int BATCH_FLOUR_CP = 3;
      final int BATCH_SUGAR_CP = 2;
      final int BATCH_BUTTER_CP = 1;
      final int BATCH_EGGS = 2;
      int batches = 0;
      int flourLbs = (BATCH_FLOUR_CP*FLOUR_OZ_CP);
      int flourOz = (BATCH_FLOUR_CP*FLOUR_OZ_CP);
      int sugarLbs = (BATCH_SUGAR_CP*SUGAR_OZ_CP);
      int sugarOz = (BATCH_SUGAR_CP*SUGAR_OZ_CP);
      int butterLbs = (BATCH_BUTTER_CP*BUTTER_STICKS_CP);
      int butterSticks = (BATCH_BUTTER_CP*BUTTER_STICKS_CP);
      int dozen =BATCH_EGGS;
      int eggs = BATCH_EGGS;
      Scanner scan = new Scanner(System.in);
      
      
      System.out.println("One batch of cookies calls for:\n     3 cups of flour");
      System.out.print("     2 cups of sugar\n     1 cup of butter\n     2 eggs\n\n");
      
      System.out.println("How many batches of cookies will you be making?");
      batches = scan.nextInt();
      System.out.println("\nYou will need:\n");
      
      flourLbs *=batches;
      flourLbs/=OZ_LB;
      flourOz*=batches;
      flourOz%=OZ_LB;
      sugarLbs*=batches;
      sugarLbs/=OZ_LB;
      sugarOz*=batches;
      sugarOz%=OZ_LB;         
      butterLbs*=batches;
      butterLbs/=BUTTER_STICKS_LB;
      butterSticks*=batches;
      butterSticks%=BUTTER_STICKS_LB;      
      dozen*=batches;
      dozen/=DOZEN;
      eggs*=batches;
      eggs%=DOZEN;
      
      
      System.out.println(flourLbs+" pounds and "+flourOz+" ounces of flour");
      System.out.println(sugarLbs+" pounds and "+sugarOz+" ounces of sugar");
      System.out.println(butterLbs+" pounds and "+butterSticks+" sticks of butter");
      System.out.println(dozen+" dozen  plus "+eggs+" eggs");
      
   }
}