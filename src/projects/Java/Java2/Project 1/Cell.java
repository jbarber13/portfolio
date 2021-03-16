import java.util.*;
/**
 * Cell class represents a cell of the grid representing the infected surface
 *
 * @author Jake Barber
 * @version 10/3/16
 */

public class Cell 
{
   private int color;//1=green  2=yellow 3=orange 4=red
   private Random rand;
   private int count;

   public Cell(){
      rand = new Random();
      color = rand.nextInt(5);
      count=rand.nextInt(250);
   }

   public int getColor(){
      return color;
   }
   public void setCount(int _count){
      count = _count;
   }
   
   public int getCount(){
      return count;
   }
   
   public void setColor(int _color){
      color = _color;
   }
   
   public int setColor(){
      int color = 0;
      if(count<3000)
         color=0;
      else if(count<6000)
         color=1;
      else if(count<9000)
         color=2;
      else if(count<12000)
         color=3;
      else if(count<15000)
         color=4; 
      else if(count<18000)
         color=5;       
      else if(count<21000)
         color=6;
      else 
         color=7;
      
         
      //if(count>21000)
         //System.out.println(count);
         
         
      //System.out.println("Set Color "+color+"\nCount = "+count);
      
      return color;
   }
   public void update(){
      this.count = this.count*2;
   //System.out.println("update Cell");
   }

   public void nextColor(){
      color = rand.nextInt();
   }
}
