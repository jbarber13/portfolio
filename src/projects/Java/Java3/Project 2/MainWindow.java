

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   A window with options regarding the shapes in the subwindow
*/
public class MainWindow{
   SubWindow sub;
   private boolean blue = false;
   private boolean red = false;
   private boolean yellow = false;
   
   
   
   /**
      Constructs a main window with buttons and checkboxes    
   */   
   public MainWindow(){
      JFrame frame = new JFrame("Main Window");
   
   
      JButton showButton = new JButton("SHOW");
   
      showButton.addActionListener(
         new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               sub = new SubWindow();
            }
         });
   
      JButton exitButton = new JButton("EXIT");
   
      exitButton.addActionListener(
         new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               sub.close();
            }
         });
         
      JButton addButton = new JButton("ADD");
   
      addButton.addActionListener(
         new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               add2Shape();
            }
         });
         
            
      JButton removeButton = new JButton("REMOVE");
   
      removeButton.addActionListener(
         new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               //textField.setText("Goodbye, World!");
            }
         });
         
      JCheckBox blueButton = new JCheckBox("Blue");
      blueButton.addActionListener(
         new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               blue = !blue;
            }
         });
      JCheckBox redButton = new JCheckBox("Red");
      redButton.addActionListener(
         new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               red = !red;
            }
         });
   
      JCheckBox yellowButton = new JCheckBox("Yellow");
      yellowButton.addActionListener(
         new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               yellow = !yellow;
            }
         });
   
         
   
   
      frame.setLayout(new FlowLayout());
   
      frame.add(showButton);
      frame.add(exitButton);
      frame.add(addButton);
      frame.add(removeButton);
      
      frame.add(blueButton);
      frame.add(redButton);
      frame.add(yellowButton);
   
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   
      
     // SubWindow s = new SubWindow();
   }
   
   private void add2Shape(){
      if(blue)
         sub.addShape(0);
      else if(red)
         sub.addShape(2);
      else if(yellow)
         sub.addShape(1);
   }
   
   public void debug(){
      ShapeIcons test = sub.getIconList();
   }
}