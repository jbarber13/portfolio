package game;

import javax.swing.JPanel;
import java.awt.Graphics;
public class Renderer extends JPanel{
   
   protected void paintComponent(Graphics g){
      super.paintComponent(g);
      try{
         Game.game.repaint(g);
      }
      catch(NullPointerException e){
        System.out.println("cought null pointer exception\n"+e);
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
}
