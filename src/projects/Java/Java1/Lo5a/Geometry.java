
/**
*Geometry.java- contains methods to determine area, perimeter, volume, and density.
*@ author  Jake Barber
* version OCT 2, 2015
*/
import java.util.Scanner;

public class Geometry
{
   public double area(int height, int width){
      return height*width;
   }
   public int perimeter(int height, int width){
      return 2*height+2*width;
   }
   public int volume(int height, int width, int length){
      return height*width*length;
   }
   public double density(int height, int width, int length,int mass){
      double volume = this.volume(length, height, width);
      
      return (double)(volume)/mass;
   }
}
