import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.util.ArrayList;
/*
 *  View.java
 *  Displays Shapes for Mosh pit
 *  @author Jake Barber
 *  @version 11/7/16
 */
public class View{
   public static final int SIZE = 1650;//developed on a 1440p display   
   private static final int STEPS = 500;
   private static final int DELAY = 20;
	
   private JFrame frame;
   private JPanel actionPanel;
   private JPanel gameArea;
	
   //array of shapes, color, size, shape and starting position are random
   private Shape[] shapes = new Shape[9];
   
   
	
   private JButton startButton;
   private JButton stopButton;
	
   private Timer tim;
		
   int dx = 5;
   int dy = 3;
   /*
   *  Constructor for View
   */
   public View(){
      frame = new JFrame();
      actionPanel = new JPanel();
      gameArea = new JPanel();
      startButton = new JButton("start");
      startButton.addActionListener(new startButtonHandler());
      stopButton = new JButton("stop");
      stopButton.addActionListener(new stopButtonHandler());
      
      frame.setLayout( null);
   	
      actionPanel.setSize(SIZE, 40);
      actionPanel.setLocation(0, 0);
      actionPanel.add(startButton);
      actionPanel.add(stopButton);
   	
      gameArea.setSize(SIZE, SIZE - actionPanel.getHeight());
      gameArea.setLocation(0, actionPanel.getHeight());
      gameArea.setLayout(null);
   	
      frame.add(actionPanel);
      frame.add(gameArea);
      frame.setSize(SIZE, SIZE);
      frame.setResizable(false);
      frame.setVisible(true); 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	
   	//add the randomly generated shapes
      for(int i=0; i<shapes.length; ++i){
         shapes[i] = new Shape();
         gameArea.add(shapes[i]);
      }
      
      
      
      tim = new Timer(10, new TimerListener());
   
   }
      /*
		 * Helper method to determine if the shape needs to bounce in the X dimension
		 *
		 * @return boolean representing whether or not the shape needs to bounce
		 */
   private boolean bounceX(){
      for(int i=0; i<shapes.length; ++i){
         if (shapes[i].getX() <= 0) {
            return true;
         }
         else if ((shapes[i].getX() + shapes[i].getWidth()) >= gameArea.getWidth()) {
            return true;
         }
      }
      return false;
   }
		
		/*
		 * Helper method to determine if the shape needs to bounce in the Y dimension
		 *
		 * @return boolean representing whether or not the shape needs to bounce
		 */
   private boolean bounceY(){
      for(int i=0; i<shapes.length; ++i){
         if (shapes[i].getY() <= 0) {
            return true;
         }
         else if ((shapes[i].getY() + shapes[i].getHeight() + 20) >= gameArea.getHeight()) {
            return true;
         }
      }
      return false;
   }
   /**
	 * private inner class startButtonHandler provides the action listener for the start button
	 */
   private class startButtonHandler implements ActionListener
   {	
   	/**
   	 * This method starts the timer 
   	 * 
   	 * @param e the action event handled by this method
   	 */
      public void actionPerformed(ActionEvent e)
      {
         tim.start();
      }
   }
	
	
	/**
	 * private inner class stopButtonHandler provides the action listener for the stop button
	 */
   private class stopButtonHandler implements ActionListener
   {
       /**
        * This method stops the timer 
        * 
        * @param e the action event handled by this method
        */
      public void actionPerformed(ActionEvent e)
      {
         tim.stop();
      }
   }
	
	
	
		/**
		 * private inner class TimerListener provides the action listener for the swing Timer
		 */
   private class TimerListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         for(int i=0; i<shapes.length; ++i)
            shapes[i].bounce(dx, dy);
            
         //gameArea.paintImmediately(gameArea.getVisibleRect());
      				
      		//sleep the thread to slow down the movement
         if (bounceX()) {
            dx = dx * -1;
         }
         if (bounceY()) {
            dy = dy * -1;
         }
      }
   }


}