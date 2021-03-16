/**
*Merch - Calculates clothing prices
*@ author  Jake Barber
*@version SEP 21, 2015
*/
import java.util.Scanner;
public class Merch{
   public static void main(String args[]){
      final int SHORTSLEEVE_PRICE = 15;
      final int TANK_PRICE = 12;
      final int LONGSLEEVE_PRICE = 20;
      final int HOODIE_PRICE = 22;
      final int HAT_PRICE = 15;
      final int CHILDRENS_SOCK = 6;
      final int ADULT_SOCK = 8;
      final int SPECIAL_SOCK = 10;
      String shirt = "";
      String shirtSize = "";
      String shirtStyle = "";
      String shirtColor = "";
      String hat = "";
      String hatColor = "";
      String socks = "";
      String sockType = "";
      int total = 0;
      int shirtTotal = 0;
      int hatTotal = 0;
      int sockTotal = 0;
      Scanner scan = new Scanner(System.in);
      String shirtOrder = "";
      String hatOrder = "";
      String sockOrder = "";      
      
      
      System.out.println("Would you like a Sockrockers T-shirt today? (Y or N)");
      shirt = scan.next();
      if(shirt.equalsIgnoreCase("Y")){
         System.out.println("Small(S), Medium(M), or Large(L)?");
         shirtSize = scan.next();
         if(shirtSize.equalsIgnoreCase("S")){
            shirtOrder += "Small ";
         }
         else if(shirtSize.equalsIgnoreCase("M")){
            shirtOrder += "Medium ";
         }
         else if(shirtSize.equalsIgnoreCase("L")){
            shirtOrder += "Large ";
         }
         else {
            System.out.println("INVALID INPUT");
         } 
         System.out.println("There are 4 colors:\nW : white\nB : black\nO : orange\nG : green");
         System.out.println("Which color would you like?");
         shirtColor = scan.next();
         if(shirtColor.equalsIgnoreCase("W")){
            shirtOrder += "white ";
         }
         else if(shirtColor.equalsIgnoreCase("B")){
            shirtOrder += "black ";
         }
         else if(shirtColor.equalsIgnoreCase("O")){
            shirtOrder += "orange ";
         }
         else if(shirtColor.equalsIgnoreCase("G")){
            shirtOrder += "green ";
         }
         else {
            System.out.println("INVALID INPUT");
         }        
         System.out.println("There are 4 styles:\nT : tank\nS : short sleeve\nL : long sleeve\nH : hoodie");
         System.out.println("Which style would you like?");
         shirtStyle = scan.next();
         if(shirtStyle.equalsIgnoreCase("T")){
            total += TANK_PRICE;
            shirtTotal += TANK_PRICE;
            shirtOrder += "tank Top ";
         }
         else if(shirtStyle.equalsIgnoreCase("S")){
            total += SHORTSLEEVE_PRICE;
            shirtTotal += SHORTSLEEVE_PRICE;
            shirtOrder += "short Sleeve ";
         }
         else if(shirtStyle.equalsIgnoreCase("L")){
            total += LONGSLEEVE_PRICE;
            shirtTotal += LONGSLEEVE_PRICE;
            shirtOrder += "long Sleeve ";
         }
         else if(shirtStyle.equalsIgnoreCase("H")){
            total += HOODIE_PRICE;
            shirtTotal += HOODIE_PRICE;
            shirtOrder += "hoodie ";
         }
         else {
            System.out.println("INVALID INPUT");
         }
      }
      System.out.println("Woud you like a Sockrockers hat today? (Y or N)");
      hat = scan.next();
      if(hat.equalsIgnoreCase("Y")){
         System.out.println("There are three colors of hats:\nW : white\nB : black\nO : orange");
         System.out.println("Which color would you like?");
         hatColor = scan.next();
         total += HAT_PRICE;
         if(hatColor.equalsIgnoreCase("W")){
            hatOrder += "White hat for $";
         }
         else if(hatColor.equalsIgnoreCase("B")){
            hatOrder += "Black hat for $";
         }
         else if(hatColor.equalsIgnoreCase("O")){
            hatOrder += "Orange hat for $";
         }
         else {
            System.out.println("INVALID INPUT");
         }
      }
      System.out.println("Would you like Sockrockers socks today? (Y or N)");
      socks = scan.next();
      if(socks.equalsIgnoreCase("Y")){
         System.out.println("There are three kinds of socks:\nC : Children's socks\nW : Adult's white gym socks\nO : Adult's 10th aniversary orange socks");
         System.out.println("Which kind of sock would you like");
         sockType = scan.next();
         if(sockType.equalsIgnoreCase("C")){
            total += CHILDRENS_SOCK;
            sockTotal += CHILDRENS_SOCK;
            sockOrder += "Childrens socks for $";
         }
         else if(sockType.equalsIgnoreCase("W")){
            total += ADULT_SOCK;
            sockTotal += ADULT_SOCK;
            sockOrder += "Adults socks for $";
         }
         else if(sockType.equalsIgnoreCase("O")){
            total += SPECIAL_SOCK;
            sockTotal += SPECIAL_SOCK;
            sockOrder += "10th anniversary socks for $";
         }
      }
      
      System.out.println("Here is your order:");
      System.out.println(shirtOrder+"for $"+shirtTotal);
      System.out.println(hatOrder + HAT_PRICE);
      System.out.println(sockOrder+sockTotal);
      System.out.println("Your total is $"+total);
       
            
      
   }
}