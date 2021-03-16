/**
*PerimeterDriver.java- gets the perimeter of a rectangle
*@ author Russell Dixon, Jake Barber
* version Sept 9, 2014
*/
import java.util.Scanner;
public class PerimeterDriver{
   public static void main(String[]args){
    int height,width;
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter the height: ");
      height=scan.nextInt();
      System.out.println("Enter the width: ");
      width=scan.nextInt();
      Geometry geo= new Geometry();
      int outputPerim= geo.perimeter(height,width);
       System.out.println("The Perimeter is :"+ outputPerim+"\nThe height is: "+height+"\nThe width is: "+width);
      }}