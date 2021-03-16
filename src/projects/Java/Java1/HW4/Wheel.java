/**
*Wheel - Plays Wheel of Fortune
*@ author  Jake Barber
*@version OCT 1, 2015
*/
import java.util.*;
public class Wheel{
   public static void main(String args[]){
      String input = "";
      Scanner scan = new Scanner(System.in);
      int count = 0;
      String in = "";
      String print = "";
      boolean done = false;
   
      System.out.println("Enter a phrase:");
      input = scan.nextLine();
      input = input.toUpperCase();
   
      for(int i=0; i<input.length(); ++i){
         if(input.charAt(i)=='!'||input.charAt(i)=='.'||input.charAt(i)=='?'||input.charAt(i)==','
         ||input.charAt(i)=='$'||input.charAt(i)=='&'||input.charAt(i)==' '){
            print+= (input.charAt(i));
         }
         else
            print += (" _");
      } 
      System.out.println(print);
    // print = "";
               
   
      while (!done){
         print = "";
         ++count;
         done = true;      
         System.out.println("\nGuess a letter:");
         in = scan.nextLine();
         char upper = Character.toUpperCase(in.charAt(0));
                  
         for(int i=0; i<input.length();++i){            
            if(input.charAt(i)=='!'||input.charAt(i)=='.'||input.charAt(i)=='?'||input.charAt(i)==','
                  ||input.charAt(i)=='$'||input.charAt(i)=='&'||input.charAt(i)==' '){                  
               print+= (input.charAt(i));
            }
            else if(input.charAt(i)==guess){
               print += guess;
            }
            else
               print+=" _";
         }
       
         System.out.println(print);
         
      
         for(int i=0;i<print.length();++i){
            if(print.charAt(i)=='_'){
               done = false;
            }
         }//loop to end game
      }//loop to run game
   }
}