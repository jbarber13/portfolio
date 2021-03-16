import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

/**
   A sub window with moving shapes and buttons to hide and exit.
*/
public class SubWindow{

   final int DELAY = 1;
   private static final int WINDOW_SIZE = 800;

   private static final int ICON_WIDTH = WINDOW_SIZE;
   private static final int ICON_HEIGHT = WINDOW_SIZE;
   private static final int WIDTH = 25;
   
   private ShapeIcons iconList = new ShapeIcons();
   JFrame frame;
   
   private Random rand;
   
   
   
   
    /**
      Constructs a sub window with the moving objects      
    */    
   public SubWindow(){
      rand = new Random();
      frame = new JFrame();
      
      JButton hideButton = new JButton("HIDE");
      hideButton.addActionListener(
         new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               frame.hide();
            }
         });
   
      JButton exitButton = new JButton("EXIT");   
      exitButton.addActionListener(
         new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               close();
            }
         });
      frame.add(hideButton);
      frame.add(exitButton);
   
   
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.setBounds(200, 200, WINDOW_SIZE, WINDOW_SIZE);
      frame.setResizable(false);
      frame.setLayout(new FlowLayout());  
   
      final MoveableShape BlueShape = new IconObj(WINDOW_SIZE, WIDTH, 0);
   
      ShapeIcon icon = new ShapeIcon(BlueShape, ICON_WIDTH, ICON_HEIGHT);
      //iconList.addIcon(new ShapeIcon(BlueShape, ICON_WIDTH, ICON_HEIGHT));
      this.addIcon(icon);
      
      final JLabel label = new JLabel(icon);
      frame.add(label);
   
      //frame.pack();
   
      final int DELAY = 10;
      Timer t = new Timer(DELAY, 
         new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               //BlueShape.translate();
               for(int i = 0; i< iconList.getShapes().size(); i++){
                  iconList.getShapes().get(i).getShape().translate();  
               }
               label.repaint();
            }
         });
      t.start();    
      
      
      
   }
   /**
      Adds a shape to the list given a color number
      @param color sets the color of the shape      
   */
   public void addShape(int color){
      if(color == 0)
         iconList.addIcon(new ShapeIcon(( new IconObj(WINDOW_SIZE, WIDTH, 0)), ICON_WIDTH, ICON_HEIGHT));
      else if(color == 1)
         iconList.addIcon(new ShapeIcon(( new IconObj(WINDOW_SIZE, WIDTH, 1)), ICON_WIDTH, ICON_HEIGHT));
      else if(color == 2)
         iconList.addIcon(new ShapeIcon(( new IconObj(WINDOW_SIZE, WIDTH, 2)), ICON_WIDTH, ICON_HEIGHT));
   
   }
   
    /**
      Adds an icon to the list 
      @param icon is the icon to be added      
   */
   public void addIcon(ShapeIcon icon){
      iconList.addIcon(icon);
   }
   
   
    /**
      Closes the sub window     
   */
   public void close(){
      frame.dispose();
   }
    /**
      gets the iconList
      @return icon list     
   */
   public ShapeIcons getIconList(){
      return this.iconList;
   }

}