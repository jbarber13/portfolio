/** 
* Money.java -- represents a unit of money, with a type and value
* of bills and coins up to a twenty dollar bill
* @author  Jake Barber
* @version October 1, 2017
*/
import java.util.Scanner;
public class Money{
   private char type;
   private double value;
   
   public Money(char _type){
      type = Character.toUpperCase(_type);
      value = this.setValue(type);
     
   }
/**
 * setValue() -- sets the inital value based on type
 * @param  t -- unit type
 */
   private double setValue(char t){
      double v = 0.0;
      switch (type){
         case 'Q': v = .25;
            break;
         case 'D': v = .1;
            break;
         case 'N': v = .05;
            break;
         case 'P': v = .01;
            break;
      }
      return v;
   }
 /**
 * getValue() -- gets the value of a unit of money
 * @return -- value of unit of money
 */
   public double getValue(){
      return value;
   }
   
   
}