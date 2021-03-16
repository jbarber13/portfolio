/**
 * Controller class manages Project 1 simulation
 *
 * @author Jake Barber
 * @version 10/3/16
 */
public class Controller
{
   private Grid g;
   private View v;
   int runCount;
    

   public Controller()
   {
      g = new Grid();
      v = new View(g);
      
      runCount = 0;
   
      while(g.getTotal()<10000000){
         g.update();
         
         for(int i=0; i<g.GRIDSIZE; i++){
            for(int j=0; j<g.GRIDSIZE; j++){
               v.update(g.getCell(i, j), i, j);
               //System.out.println(g.getCell(i, j).getCount());
            }      
         } 
         //v.update(g.getCell());
         runCount++;
         System.out.println("CONTROLLER UPDATE     "+"Total = "+ g.getTotal());
         try{
            Thread.sleep(500);
         }
         catch (Exception e){
            System.out.println("Thread.sleep failed for some reason...");
         }
      }
        
        
   }

   public void end()
   {
      System.out.println("INFECTIOUS DOSE REACHED IN "+runCount*6.3+" MINUTES");
      System.out.println(runCount+" GENERATIONS ELAPSED");
   
   }
} 
