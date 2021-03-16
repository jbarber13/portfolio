/* Count.java -- counts and sums 
*  
*@author Jake Barber
*@version SEP 23, 2015
*/

import java.util.Scanner;
public class Count{
   public static void main(String args[]){
      int start = 0;
      int end = 0;
      int sum = 0;
      int temp;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter a starting number:");
      start = scan.nextInt();
      System.out.println("Enter an ending number:");
      end = scan.nextInt();
      
      temp = start;
      
      if(start<end || start==end){
         while (start<=end){
            System.out.println(start);
            sum+=start;
            ++start;    
         }
         System.out.println("\nThe sum of the numbers from "+temp+" to "+end+" is "+sum); 
      }
      else if(end<start){
         while (start>=end){
            System.out.println(start);
            sum+=start;
            --start;
         }
         System.out.println("\nThe sum of the numbers from "+temp+" to "+end+" is "+sum);      
      }
   }  
}
