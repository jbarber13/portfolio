/**
*  Public Class Vend
*  Represents the varioius functions of a vending machine
* 
* @author  Jake Barber
* @version October 1, 2017
*/
import java.util.Scanner;
public class Vend{

   private Inventory Inventory;
   private int input;
   private Scanner scan;
   private final String PSWD = "Passw0rd";
   private String pIn;
   
   
   
   public Vend(){
      Inventory = new Inventory();
      this.initInventory();
      scan = new Scanner(System.in);
      input = 0;
      pIn = "";
      this.menu();
         
   
   }
/**
 * initInventory() -- initailizes system inventory with items
 */
   public void initInventory(){   
      Inventory.addItem("chocolate", 4.99, 12);
      Inventory.addItem("candy", 5.0, 10);
      Inventory.addItem("Lays", 3.50, 10);
      Inventory.addItem("gummies", 2.75, 10);
      Inventory.addItem("CocaCola", 2.99, 10);
      Inventory.addItem("Pepsi", 2.98, 10);
      Inventory.addItem("Pretzels", 2.99, 20);
   
      //System.out.println(Inventory.toString());
      
   }
/**
 * menu() -- handles inital user input and initalizes switch()
 */
   private void menu(){
      input = 0;
      System.out.println("\n\nEnter your selection\n");
      System.out.println("1 -- Insert funds\n2 -- Operator mode");
      System.out.println("3 -- View Inventory\n4 -- Purchase Item");
      
      System.out.println("99 -- exit");
      input = scan.nextInt();
      this.Switch();
      
      //System.out.println(input);
   
   }
/**
 * Switch() --main switch statement for program
 */
   private void Switch(){
      switch (input){
         default: System.out.println("invalid input");
            break; 
         case 1: this.userBalance();
            break;
         case 2: this.operator();
            break;
         case 3: System.out.println(Inventory.toString()); 
            this.menu();  
            break;
         case 4: this.sell();
            break; 
         case 99: System.out.println("Thank You!\nYour change is: \n");
            Inventory.change(Inventory.getUserBalance());
            break;                
      }
   }
   
/**
 * operator() -- checks password for operator mode
 */
   private void operator(){
      System.out.println("Enter the operator password:\n99 -- return to main menu");
      pIn = scan.next();
      if (pIn.equals(PSWD)){
         this.oMode();
      }else if(pIn.equals("99")){
         this.menu();
      
      }else{
         System.out.println("invalid Password");
         this.operator();
      }
   }
 /**
 * oMode() -- Handles I/O for operator mode
 */
   private void oMode(){
      String Oin = "";
      System.out.println("//////////OPERATOR MODE\\\\\\\\\\");
      System.out.println("System Balance: "+Inventory.getSysBalance());
      System.out.println("\n1 -- ADJUST SYSTEM BALANCE\n2 -- ADJUST INVENTORY\n99 -- RETURN TO MAIN MENU");
      Oin = scan.next();
      switch (Oin){
         default: System.out.println("invalid input");
            break; 
         case "1": Inventory.adjSysBalance();
            break;
         case "2": this.adjInventory();
            break;
         case "99": this.menu();  
            break;
      
      }
      this.oMode();
   }
/**
 * userBalance() -- user sets the amount of money they are inputting into the machine
 */
   private void userBalance(){
      double bal = 0;
      System.out.println("Enter a dollar amount: \n0 -- return to main menu");
      boolean fail = false;
      try{
         bal = scan.nextDouble();
         if(bal == 0 || bal == 0.0)
            this.menu();
         else
            Inventory.setUserBalance(bal);
      }catch(Exception e){
         System.out.println("invalid input");
      }
    
      System.out.println("User Balance = "+Inventory.getUserBalance());
      this.menu();
    
   }
 /**
 * sell() -- checks if balance is sufficient, then remove one item from the inventory, and adjusts system balance
 */
   public void sell(){
      String selection = "";
      System.out.println(Inventory.toString());
      System.out.println("Enter an item to purchase");
      selection = scan.next();
      Inventory.sell(selection);
      this.menu();
    
     
   }
   
}