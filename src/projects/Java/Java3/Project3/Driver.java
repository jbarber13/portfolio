import java.io.*;
import java.util.*;
import javax.swing.*;


/**
   Driver -- Runs the program
*/
public class Driver{
   public static void main(String args[]){
      LinkedList<String> filesContents = new LinkedList<String>();
      Utils u;
      
      try{
         u = new Utils();
         while(!u.go){
            Thread.sleep(500);
         }  
         if(u.go)
            filesContents = u.getFilesContents();   
      
      }catch(Exception e){
         System.out.println("oops, there was an error, wrong file name?");    
         System.out.println(e);     
      }    
      
      for(int i = 0; i<filesContents.size(); i++){
         Runnable r1 = new WordLetterCount(filesContents.get(i));
      
         Thread t1 = new Thread(r1);      
      
         t1.start(); 
      }   
   }
}