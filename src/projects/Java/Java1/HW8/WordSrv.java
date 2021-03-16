/***********************
 *
 *   WordSrv - contains methods to find words in a 2D array of char
 *
 *   Author:   Jake Barber
 *   Date:     2015-12/9
 *
 ***********************/ 
import java.util.*;
import java.io.*;
public class WordSrv {



   public char[][] findWords(char[][] puzzle, String[] words) {
      char[][] blank = this.blankArray(puzzle.length);
      int[] foundIndex = new int[words.length];
      int ind = 0;
     
      return new char[][] {{},{}};
   }
   public boolean checkRow(char[][] puzzle, String s) {
      boolean found = false;
      String row = "";
      for(int i = 0; i < puzzle.length; i++) {
         row = new String(puzzle[i]);
         if(row.contains(s)) 
            found = true;
      }
      return found;
   }
   private char[] reverseRow(char[][] puzzle, int row){
      char[] reverse = new char[puzzle.length];
      for(int i = 0; i < puzzle.length; --i){
         reverse[reverse.length-1-i] = puzzle[row][i];
      }       
      return reverse;
   }
        
   public void print(char[][] array){
      for(int i=0; i<array.length; ++i){
         for(int j=0; j<array[i].length; ++j){
            System.out.print(array[i][j]+ " ");
         }
         System.out.println();
      } 
   }
   public char[][] blankArray(int size){   
      char[][] blank = new char[size][size];
      for(int i=0; i<size; i++){
         for(int j=0; j<size; j++){
            blank[i][j] = '.';
         }
      }
      return blank;
   }
   public char[][] getPuzzle(int pNum){
      try{
         WordSquare test = new WordSquare();
         char[][] s = test.create(pNum);
         char[][] temp = new char[s.length][s.length];
         for(int i=0; i<s.length; ++i){
            for(int j=0; j<s[i].length; ++j){
               temp[i][j] = s[i][j];
            }
         }
         return temp;
      }
      catch(IOException e){
         System.out.println("IOException");
      }
      return new char[][] {{},{}};   
   }
   public void print(String[] s){
      for(int i=0; i<s.length; ++i){
         System.out.print(s[i]+" ");
      }
      System.out.println();
   }
   public String[] getWordList(int pNum){
      try{
         WordSquare test = new WordSquare();
         String[] words = test.wordList(pNum);
         return words;        
      }
      catch(IOException e){
         System.out.println("IOException");
      }
   
      return new String[] {};
   }
   
   
   
   
}