/**
*HW5Srv -  Plays Wheel of Fortune
*@ author  Jake Barber
*@version OCT 21, 2015
*/import java.util.Scanner;
public class GameDriver{
   public static void main(String args[]){
      HW5Srv game = new HW5Srv();
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a phrase");
      String key = scan.nextLine();
      char[] puzzle = game.createPuzzle(key);
      key = game.createKey(key);
      boolean solved = false;
      String guess = "";
      while(!solved){
         System.out.println("Enter a guess:");
         guess = scan.next();
         game.checkGuess(guess.charAt(0), key, puzzle);
         System.out.println(game.puzzleString(puzzle));
         solved = game.isSolved(key, puzzle);     
      }
   }
}