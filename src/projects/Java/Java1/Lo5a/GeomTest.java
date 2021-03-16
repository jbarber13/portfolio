/**
*GeomTest.java- gets the area and perimeter of a rectangle
*@ author  Jake Barber
* version OCT 2, 2015
*/

import java.util.Scanner;

public class GeomTest
{
   public static void main(String[]args){
      int height,width;   
      Geometry geomObj= new Geometry();
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter the height: ");
      height=scan.nextInt();
      System.out.println("Enter the width: ");
      width=scan.nextInt();
      double recArea = geomObj.area(height, width);
      System.out.println("The area is: "+ recArea+"\nThe height is: "+height+"\nThe width is: "+width);
   	
   }
}

