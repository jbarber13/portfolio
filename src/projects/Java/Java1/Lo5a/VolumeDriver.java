/**
*VolumeDriver.java- gets the volume of a rectangle
*@ author Russell Dixon, Jake Barber
* version Sept 9, 2014
*/
import java.util.Scanner;
public class VolumeDriver{
   public static void main(String[]args){
    int height,width,length;
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter the height: ");
      height=scan.nextInt();
      System.out.println("Enter the width: ");
      width=scan.nextInt();
      System.out.println("Enter the length: ");
      length=scan.nextInt();
      Geometry geo= new Geometry();
      int outputVolume= geo.volume(height,width,length);
       System.out.println("The Volume is :"+ outputVolume+"\nThe height is: "+height+"\nThe width is: "+width+"\nThe length is: "+length);
      }}