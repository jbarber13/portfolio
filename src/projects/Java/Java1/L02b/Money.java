

import java.util.Scanner;
public class Money{
   public static void main(String args[]){    
      final double CHANGE =0; 	   
      int twenty, ten, five, one, qrt, dim, nic, pen;
      Scanner scan = new Scanner (System.in);
      
      System.out.println("Enter a dollar amount:"); 
      double dollars = scan.nextDouble();
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
      
      
     
      System.out.println("twenties = "+twenty);     
      System.out.println("tens = "+ten); 
      System.out.println("fives = "+five); 
      System.out.println("ones = "+one);
      System.out.println("quarters = "+qrt);
      System.out.println("dimes = "+dim);
      System.out.println("nickels = "+nic);
      System.out.println("pennies = "+pen);
   }

}



