/*import java.util.Scanner;
public class Money{
   public static void main(String args[]){    
      Scanner scan = new Scanner(System.in); 
      int num20,num10,num5,num1,numQt,numDm,numNk,numPn; 
      int temp;
      int dollars;
      int cents;
   
      System.out.println("Enter a dollar amount:");
      dollars = scan.nextInt();
      temp=dollars%20;
      num20=dollars/20;    
      num10=temp/10;
      temp = temp%10;    
      num5 = temp/5;
      temp = temp%5;
      num1 = temp;
      
      System.out.println("\nEnter the number of cents:");
      cents = scan.nextInt();
      temp = cents%25;
      numQt = cents/25;
      numDm = temp/10;
      temp = temp%10;
      numNk = temp/5;
      temp = temp%5;
      numPn = temp;
      
      
      System.out.println(num20+" twenty dollar bills");
      System.out.println(num10+" tend dollar bills");
      System.out.println(num5+" five dollar bills");
      System.out.println(num1+" one dollar bills");
      
      System.out.println(numQt+" quarter");
      System.out.println(numDm+" dimes");
      System.out.println(numNk+" nickels");
      System.out.println(numPn+" pennies");
   
   
   
           
   
   }

}
*/