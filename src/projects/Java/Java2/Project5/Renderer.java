package Project5;

import javax.swing.JPanel;
import java.awt.Graphics;
/*
 * Renderer.java - paints the components on the Jpanel and continously calls the repaint method in View
 * @author Jake Barber
 * @version 11/28/16
 */
public class Renderer extends JPanel{
   //private static View v;
  // private View v;
  /* public Renderer(View _v){
      v=_v;  
   }*/
   
   
   /*
   *  paintComponent - paints the components on the Jpanel and continously calls the repaint method in View
   */
   protected void paintComponent(Graphics g){
      super.paintComponent(g);
   
      try{
         //System.out.println("Renderer pre try block");
      
         Project5.View.view.repaint(g);
         //v.repaint(g);
         //System.out.println("Renderer");
                  
      }
      catch(NullPointerException e){
         //System.out.println("cought null pointer exception\n");
         //e.printStackTrace();
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
}
