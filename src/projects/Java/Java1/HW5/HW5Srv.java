/**
*HW5Srv - contains service methods to play Wheel of Fortune
*@ author  Jake Barber
*@version OCT 21, 2015
*/
import java.util.*;
public class HW5Srv{
   public String createKey(String phrase){
      String print = "";
      phrase = phrase.toUpperCase();
      for(int i=0; i<phrase.length();++i){
         print += phrase.charAt(i);
         print += " ";
      }
      return print;
   }
   public char[] createPuzzle(String phrase){
      phrase = phrase.toUpperCase();
      char[] chars = new char[phrase.length()*2];
      for(int i=0; i<phrase.length(); i+=2){
         if(phrase.charAt(i)<='Z'&&phrase.charAt(i)>='A'){
            chars[i] = '_';
            chars[i+1] = ' ';
         }
         else{            
            chars[i] = (phrase.charAt(i));
            chars[i+1] = ' ';
         }         
      }
      return chars;
   }
   public boolean isSolved(String key, char[] puzzle){
      boolean solved = false;
      for(int i=0; i<puzzle.length; ++i){
         if(puzzle[i]==key.charAt(i)){
            solved = true;
         }
      }
      return solved;
   }
   public void checkGuess(char guess, String key, char[] puzzle){
      guess = Character.toUpperCase(guess);
      key = key.toUpperCase();
      for(int i=0; i<key.length(); ++i){
         if(key.charAt(i)==guess){
            puzzle[i]=guess;
         }
      }
   }
   public String puzzleString(char[] puzzle){
      String game = "";
      for(int i=0; i<puzzle.length; ++i){
         game += puzzle[i];
      }
      return game;
   }




   


   

}