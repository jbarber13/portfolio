import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 * View class handels the visual aspect of the simulation
 *
 * @author Jake Barber
 * @version 10/3/16
 */

public class View extends JFrame
{
   private final int SIZE = 1600;//for 1440p display, change to ~800 for 1080p display
   private Grid g;
   private JButton[][] array;
   private JPanel gridPanel;
   private JPanel goPanel;
   private JButton goButton;
   private Color[] colors = {Color.GREEN, Color.GREEN.darker(), Color.YELLOW, Color.YELLOW.darker(),
                             Color.ORANGE, Color.ORANGE.darker(),Color.RED, Color.RED.darker()};
   private int runCount;
   

   public View(Grid _g){
      this.g = _g;
      this.setLayout(new BorderLayout());
      this.setSize(SIZE,SIZE);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
      setUpGrid();
      this.setVisible(true);
      this.setResizable(false);
   }
   
   public void update(Cell x, int c, int r){
      Random rand = new Random();
      
      array[c][r].setBackground(colors[x.setColor()]);
   
   
   //gridPanel.paintImmediately(gridPanel.getVisibleRect());
     
      
      //gridPanel.paintImmediately(gridPanel.getVisibleRect());
      //System.out.println("View Update");   
   //paint immediately
   }

   private void setUpGrid()
   {
      gridPanel = new JPanel();
      gridPanel.setLayout(new GridLayout(25,25));
      array = new JButton[Grid.GRIDSIZE][Grid.GRIDSIZE];
      for (int i = 0; i < array.length; i++){
         for(int j=0; j<array.length; j++){
            array[i][j] = new JButton();
            array[i][j].setEnabled(false);
            gridPanel.add(array[i][j]);
            //System.out.println("SUG");
         }
      }
      this.add(gridPanel, BorderLayout.CENTER);
      
      for (int i = 0; i < array.length; i++){ 
         for(int j=0; j<array[i].length; j++){
            array[i][j].setOpaque(true);
            array[i][j].setBorderPainted(false);               
            
           // array[i][j].setBackground(colors[x.setColor()]);
            //System.out.println(x.getCount()); 
            //array[i][j].setBackground(colors[rand.nextInt(3)]);
            //gridPanel.paintImmediately(gridPanel.getVisibleRect());
            
         
              
            
            //System.out.println("???");
         }
      }
      
      
      
      
      
      
      
   }

    

   
}          
