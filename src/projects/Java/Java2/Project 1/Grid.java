/**
 * Grid class creates a grid to represent the surface of a subject infected with the bacteria
 *
 * @author Jake Barber
 * @version 10/3/16
 */
import java.util.Random;
public class Grid
{
   private Cell[][] grid;
   public static final int GRIDSIZE = 25;
   private View view;
   private int runCount;
   

   public Grid(){
   
   
      grid = new Cell[GRIDSIZE][GRIDSIZE];
      for (int i = 0; i < grid.length; i++)
         for(int j=0; j<grid[i].length; j++){
            
            grid[i][j] = new Cell();
            //System.out.println("TEST");
            
            
            runCount++;
         }
   }
   public int getTotal(){
      int total = 0;
      for(int i=0; i<grid.length; ++i)
         for(int j=0; j<grid[i].length; ++j){
            total += grid[i][j].getCount();
         }
   
      return total;
   }
   
   public Cell getCell(int i,  int j){
     // System.out.println("getCell");
      return this.grid[i][j];
   }
   
   public void update(){
      for (int i = 0; i < grid.length; i++)
         for(int j=0; j<grid[i].length; j++){
            grid[i][j].update();
            //System.out.println(grid[i][j].getCount());
            //view.update(5);
         
         }
         //view.update(5);
   
   }
   

   public int getColor(int x, int y)
   {
      return grid[x][y].getColor();
   }
}
