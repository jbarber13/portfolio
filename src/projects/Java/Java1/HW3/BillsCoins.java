
/* BillsCoins.java -- calulates change 
*  
*@author Jake Barber
*@version SEP 23, 2015
*/
import java.util.Scanner;
public class BillsCoins{
   public static void main(String args[]){    
      final double CHANGE =0; 	   
      int twenty, ten, five, one, qrt, dim, nic, pen;
      Scanner scan = new Scanner (System.in);
      
      System.out.println("Enter a dollar amount:"); 
      double dollars = scan.nextDouble();
      if(dollars<0){
         System.out.println(dollars+" is an invalid amount of money.");
      }
      else if(dollars>0){
         dollars *= 100;     
         int change = (int)(dollars);  
      
         twenty = change/2000;
         change %= 2000;
      
         ten = change/1000;
         change %= 1000;
      
         five = change/500;
         change %= 500;
      
         one = change/100;
         change %= 100;
      
         qrt = change/25;
         change %= 25;
      
         dim = change/10;
         change %= 10;
      
         nic = change/5;
         change %= 5;
      
         pen = change/1;
         change %= 1;
      
         if(twenty==1){
            System.out.println(twenty+" twenty dollar bill");
         }
         if(twenty>1){
            System.out.println(twenty+" twenty dollar bills");         
         }
         
         if(ten==1){
            System.out.println(ten+" ten dollar bill");
         }
         if(ten>1){
            System.out.println(ten+" ten dollar bills");         
         }
         
         if(five==1){
            System.out.println(five+" five dollar bill");
         }
         if(five>1){
            System.out.println(five+" five dollar bills");         
         }
         
         if(one==1){
            System.out.println(one+" twenty dollar bill");
         }
         if(one>1){
            System.out.println(one+" twenty dollar bills");         
         }
         
         if(qrt==1){
            System.out.println(qrt+" quarter");
         }
         if(qrt>1){
            System.out.println(qrt+" quarters");         
         }
         
         if(dim==1){
            System.out.println(dim+" dime");
         }
         if(dim>1){
            System.out.println(dim+" dimes");         
         }
         
         if(nic==1){
            System.out.println(nic+" nickel");
         }
         if(nic>1){
            System.out.println(nic+" nickels");         
         }
         
         if(pen==1){
            System.out.println(pen+" penny");
         }
         if(pen>1){
            System.out.println(pen+" pennies");         
         }                 
      }
   }

}



