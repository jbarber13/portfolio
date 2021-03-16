/***********************
 *
 *   WordDrv - driver for the word search
 *
 *   Author:   Jake Barber
 *   Date:     2015-12/9
 *
 ***********************/ 
import java.io.*;

public class WordDrv {

   public static void main(String[] args) throws IOException {
   
      char[][] puzzle = WordSquare.create(1);
   
      String[] words = WordSquare.wordList(1);
      
      WordSrv test = new WordSrv();
      
      char[][] testArray = {
         {'.', '.', '.', 'm', '.', '.', '.', '.', '.', '.', '.', '.'},
         {'.', '.', '.', 'a', '.', '.', '.', 'f', '.', '.', 'a', '.'},
         {'.', '.', '.', 'p', '.', '.', '.', 'l', 'm', '.', 'd', '.'},
         {'.', '.', '.', 's', '.', '.', '.', 'o', 'a', '.', 'a', '.'},
         {'.', '.', 's', '.', '.', '.', '.', 'p', 'g', '.', 'v', '.'},
         {'h', 'c', 'u', '.', '.', '.', '.', 's', 'i', '.', 'e', 'w'},
         {'i', 'h', 'p', '.', '.', '.', '.', '.', 's', '.', 'n', 'o'},
         {'c', 'i', 'e', '.', '.', '.', '.', '.', 't', '.', '.', 'l'},
         {'c', 'c', 'r', '.', '.', '.', '.', '.', 'r', '.', '.', 'l'},
         {'u', 'k', '.', '.', '.', '.', '.', '.', 'a', '.', '.', 'e'},
         {'p', 'e', '.', '.', '.', '.', '.', '.', 't', '.', '.', 'y'},
         {'.', 'n', '.', '.', '.', '.', '.', '.', 'e', '.', '.', '.'}}; 
         
         //test.print(testArray);  
      char[][] test2 = test.blankArray(1);
         //test.print(test2);
      char[][] puzzleTest = test.getPuzzle(1);
         //test.print(puzzleTest);
      String[] wordListTest = test.getWordList(1);
         // test.print(wordListTest);
      System.out.println(  test.checkRow(testArray, "ccr"));
      System.out.println(  test.checkRow(testArray, "ccsdsdafar"));
      System.out.println(  test.checkRow(testArray, "ihp"));
   
   
   
   
   } //main 
}