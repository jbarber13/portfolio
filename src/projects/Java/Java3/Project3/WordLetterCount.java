import java.io.*;
import java.util.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   WordLetterCount -- takes a string and determines the number of letters & words
                      then creates a window with the counts and the input string
*/

public class WordLetterCount implements Runnable{
   //private LinkedList<String> filesContents;//a list of strings, each representing the contents of a file
   private String input;
   private int charCount;
   private int wordCount;
   
   private JFrame frame;
   
   private final int FIELD_WIDTH = 20;
   private JTextArea textArea;
   private final JTextField charTF = new JTextField(FIELD_WIDTH);
   private final JTextField wordTF = new JTextField(FIELD_WIDTH);


   
   /**
   *  Constructor for WordLetterCount, displays results to GUI
   */
   public WordLetterCount(String _input){
      input = _input;
      charCount = this.parseChars(input);
      wordCount = this.parseWords(input);
      
      frame = new JFrame();
      
      charTF.setText(charCount + " Letters in the file");
      wordTF.setText(wordCount + " Words in the file");
      
      textArea = new JTextArea(20, 20);
      JScrollPane scrollPane = new JScrollPane(textArea); 
      textArea.setEditable(false);
      
      textArea.setText("Text from the file input:\n\n"+input);
   
      
      frame.setLayout(new FlowLayout());
      
      frame.add(textArea);   
      frame.add(charTF);
      frame.add(wordTF);
   
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
   
  
   
   public void run()
   {
      try 
      {
         System.out.println("NEW THREAD");         
      }
      catch (Exception exception)
      {
         System.out.println("oops, there was an error, wrong file name?");  
         System.out.println(exception);    
      }
   }
   
   /**
   *  Counts the letters in @param input
   *  @return count of upper/lower case letters
   */  
   public int parseChars(String input){
      int count = 0;
      for(int i = 0; i<input.length(); ++i){
         if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z' || input.charAt(i) >= 'a' && input.charAt(i) <= 'z'){
            count ++;
         }
      }    
      return count;
   }
   
   /**
   *  Counts the words in @param input
   *  @return count of words, using space as delimiter
   */ 
   public int parseWords(String input){
      int count = 0;
      if(input.length()>0)
         count = 1;
      for(int i = 0; i<input.length(); ++i){
         if(input.charAt(i) == ' ' || input.charAt(i) == '\n'){
            count ++;
         }
      }      
      return count; 
   }

}