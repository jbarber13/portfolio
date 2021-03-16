import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.*;

/*
 *  Shape.java
 *  represents a shape of random color, size, shape and starting position
 *  @author Jake Barber
 *  @version 11/7/16
 */
public class Shape extends JButton{
   private int x, y;
   private Random rand = new Random();
   private Color[] colors = {Color.GREEN, Color.GREEN.darker(), Color.YELLOW, Color.YELLOW.darker(),
                             Color.ORANGE, Color.ORANGE.darker(),Color.RED, Color.RED.darker()};

/*
 * constructor for the shape class
 */
   public Shape(){
      x = rand.nextInt(View.SIZE);
      y = rand.nextInt(View.SIZE);
      setLocation(x,y);
      setSize(rand.nextInt(500)+50, rand.nextInt(500)+50);
      setForeground(Color.RED);
      setBackground(colors[rand.nextInt(colors.length)]);
   }
/*
 * moves the shapes
 */
   public void move(){
   	
      x = rand.nextInt(View.SIZE - this.getWidth());
      y = rand.nextInt(View.SIZE - this.getHeight());
      setLocation(x, y);
   }   
/*
 * Method to bounce the shapes off of the border and eachother
 */
   public void bounce(int dx, int dy){
      x = x + dx;
      y = y + dy;
      super.setLocation(x, y);
   }
	

}