import java.io.*;
import java.util.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   Utils -- Sets up the inital GUI to gather the filenames
*/
public class Utils {

   private Scanner scan = new Scanner(System.in);
   private LinkedList<String> linkedlist = new LinkedList<String>();
   private LinkedList<String> filesContents = new LinkedList<String>();
   
   private JFrame frame;
   final int FIELD_WIDTH = 20;
   final JTextField textField = new JTextField(FIELD_WIDTH);
   
   
   public boolean go = false;
   
   
      
   /**
   *  Constructor for Utils, initializes the GUI
   */   
   public Utils(){
      this.init();    
   }
   
   private void init(){
      JFrame frame = new JFrame();
   
      textField.setText("Enter filenames, separated by space");
   
      JButton startButton = new JButton("CALCULATE");
         
      startButton.addActionListener(
         new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               try{
                  start();
               }catch(Exception e){System.out.println(e);}
            }
         });
   
         
      frame.setLayout(new FlowLayout());
   
      frame.add(startButton);
      frame.add(textField);
   
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
   
   
   public void start() throws IOException{
      this.input();
      this.files2strings();   
      this.go = true;
   }
   public void input() {
      /*//text based interface code
      boolean done = false;      
      while(!done){
         System.out.println("Enter a filename and press enter, type done to stop");
         String next = scan.next();
         
         if(next.equals("done")){         
            done = true;
         }else{
            linkedlist.add(next);  
         }
      }
      */
      String files = textField.getText();
      
      String[] splited = files.split("\\s+");//clever trick from https://stackoverflow.com/questions/7899525/how-to-split-a-string-by-space
      for(int i=0; i<splited.length; ++i){
         linkedlist.add(splited[i]);
      }
   }
   private void files2strings()throws IOException{
      FileReader read;
      
      for(int i=0; i<linkedlist.size(); i++){
         read = new FileReader(linkedlist.get(i));
         filesContents.add(read.getRecord());
      }
   }
   public LinkedList<String> getFilesContents(){   
      return filesContents;
   }
}