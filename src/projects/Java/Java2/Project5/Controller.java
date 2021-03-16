package Project5;

/*
 * Controller.java - Launches the View for the platform jump game
 * @author Jake Barber
 * @version 11/28/16
 */
import javax.swing.JPanel;
import java.awt.Graphics;
public class Controller extends JPanel{

   private View init;
   //private Renderer init;
   public Controller(){
        init = new View();
      //init = new Renderer();
      //System.out.println("Controller");
   }
}