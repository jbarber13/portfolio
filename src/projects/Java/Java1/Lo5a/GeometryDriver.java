/**
*GrometryDriver.java- gets the perimeter, area, density, and volume of a rectangle
*@ author Russell Dixon, Jake Barber
* version Sept 9, 2014
*/
import java.util.Scanner;
public class GeometryDriver{
   public static void main(String[]args){
      int height,width,length;
      Scanner scan= new Scanner(System.in);
      Geometry geo= new Geometry();
      
      System.out.println("Enter the height of a rectangle: ");
      height=scan.nextInt();
      System.out.println("Enter the width of the rectangle: ");
      width=scan.nextInt();
      int outputPerimeter= geo.perimeter(height,width);
      System.out.println("The Perimeter of the rectangle is: " + outputPerimeter+".");
      int outputArea=geo.area(height,width);
      System.out.println("The area is " + outputArea + ".");
     
      System.out.println("\n Now enter the length: ");
      length=scan.nextInt();
      double outputVolume = geo.volume(height,width,length);
      System.out.println("The volume of the object is: " + outputVolume);
       
      System.out.println("\nNow enter the mass of the object:");
      int mass=scan.nextInt();
      double outputDensity = geo.density(height,width,length,mass);
      System.out.println("The density of the object is: " + outputDensity);
       
     
     
      
      
      
                  
   }}