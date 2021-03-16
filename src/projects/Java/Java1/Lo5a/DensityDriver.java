/**
*DensityDriver.java- gets the volume of a rectangle
*@ author Russell Dixon, Jake Barber
* version Sept 9, 2014
*/
import java.util.Scanner;
public class DensityDriver{
   public static void main(String[]args){
    int height,width,length,mass;
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter the height: ");
      height=scan.nextInt();
      System.out.println("Enter the width: ");
      width=scan.nextInt();
      System.out.println("Enter the length: ");
      length=scan.nextInt();
      System.out.println("Enter the mass: ");
      mass=scan.nextInt();
      
      Geometry geo= new Geometry();
      double outputDensity= geo.density(height,width,length,mass);
       System.out.println("The density is :"+ outputDensity+"\nThe height is: "+height+"\nThe width is: "+width+"\nThe length is: "+length + "\n The mass is: "+mass);
      }}