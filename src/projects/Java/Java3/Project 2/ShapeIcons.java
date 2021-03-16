import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
   A list of ShapeIcons that each contain a moveable shape.
*/
public class ShapeIcons {
   private ArrayList<ShapeIcon> shapes;
   
   public ShapeIcons(){   
      shapes = new ArrayList<ShapeIcon>();   
   }
   public void addIcon(ShapeIcon icon){
      shapes.add(icon);
   }
   public void addIcon(MoveableShape shape, int width, int height)
   {
      shapes.add(new ShapeIcon(shape, width, height));
   }   
   public ArrayList<ShapeIcon> getShapes(){
      return shapes;
   }
}


