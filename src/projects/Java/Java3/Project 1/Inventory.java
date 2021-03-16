/**
*  Public Class Inventory
*  Represents the running inventory of the vending machine
* 
* @author  Jake Barber
* @version October 1, 2017
*/
import java.util.*;
public class Inventory{
   private LinkedList<Item> items;
   //private Money sysBalance;
   private double systemBalance;
   private LinkedList<Money> coinCount;
   private Vend v;
   private double userBalance;
   

   
  
   public Inventory(){
      items = new LinkedList<Item>();
      //sysBalance = new Money(100, 20, 10, 8, 5, 5, 3, 3);
      userBalance = 0.0;
      coinCount = new LinkedList<Money>();
      this.initCoins();
      this.calcBalance(coinCount);      
   }
   private void calcBalance(LinkedList<Money> _coinCount){
      for (int i = 0; i<coinCount.size(); i++){
         systemBalance += coinCount.get(i).getValue();
      }
   }
   
   /**
 * addCoin() -- adds a coin to the list
 * @param  i -- coin to be added
 */ 
   public void addCoin(char i){
      coinCount.add(new Money(i));
   }
 /**
 * initCoins() -- Initailizes the coins within the vending machine
 */ 
   private void initCoins(){
      for(int i = 0; i<500; i++){
         this.addCoin('q');
      }
      for(int i = 0; i<500; i++){
         this.addCoin('n');
      }
      for(int i = 0; i<500; i++){
         this.addCoin('p');
      }
      for(int i = 0; i<500; i++){
         this.addCoin('d');
      }
   }
   
   
 /**
 * Adds an item to the LinkedList of items 
 * Note: overloaded to allow for input of item object
 * @param  i  an item to be added to inventory
 */
   public void addItem(Item i){
      items.add(i);
   }
  
   
   
/**
 * Adds an item to the LinkedList of items 
 * Note: overloaded to allow for input of initalizing paramaters for a new item
 * @param  cost, name  initalizing paramaters for a new item
 */
   public void addItem(String name, double cost, int qty){
      items.add(new Item(name, cost, qty));
   }
   
 /**
 * Adjusts the quanity of a specific item in the list 
 * @param  name, adj  a name to find the correct item, and a new quanity to set it at
 */
   public void adjQty(String name, int adj){
      int i=0;
      boolean done = false;
      while(i < items.size() || !done){
         if(items.get(i).getName().equals(name)){
            items.get(i).setQty(adj);
            done = true;
         }
         i++;
      }
   }
/**
 * Loops through the list to find the item, then removes its quanity by exactly one 
 * as long as at least one exists 
 * @param  name, adj  a name to find the correct item, and a new quanity to set it at
 * @return string to represent a sold confirmation, or to notify that item is sold out
 */ 
   public void sell(String name){
      int i=0;
      boolean done = false;
      int temp = 0;
      double cost = 0.0;
      boolean funds = true;
      boolean available = true;
      try{
         while(i < items.size() || !done){
         
            if(items.get(i).getName().equals(name)){
               temp = items.get(i).getQty();
               done = true;
            }
            if(temp > 0){
               cost = items.get(i).getCost();
               if(cost <= userBalance){
                  System.out.println("Sold!");
                  items.get(i).setQty(temp-1);               
                  userBalance -= cost;
                  //systemBalance += cost; //do something here with coins
                  
               }else{
                  funds = false;
               }
            }else
               available = false;         
            i++;
         }
         if(!funds)
            System.out.println("Insuficient Funds");
         else if(!available)
            System.out.println("Item not available");
      }catch(Exception e){
         //System.out.println("Item not available");
         v = new Vend();
      }
   }
   
   
/**
 * Returns a linked list of all of the items 
 * @return a linked list of all of the items
 */ 
   public LinkedList<Item> getItems(){
      return items;
   }
/**
 * Returns a string containing a formated list of all of the items
 * @return a formated list of all of the items
 */ 
   public String toString(){
      String out = "";
      for (int i = 0; i<items.size(); i++){
         out += items.get(i).toString();
      }      
      return out;      
   }
 /**
 * setUserBalance() -- sets the user balance\
 * @param  in -- input balance
 */
   public void setUserBalance(double in){
      this.userBalance += in;
   }
 /**
 * getsUserBalance() -- gets the user balance\
 * @return -- current user balance
 */
   public double getUserBalance(){
      return this.userBalance;
   }
   
 /**
 * change() -- makes change and adjusts the machines inventory of coins
 * @param  input -- input balance
 */
   public void change(double input){
      int qrt, dim, nic, pen;
      //double input = this.userBalance;
      input *= 100;     
      int change = (int)(input);  
            
      qrt = change/25;
      change %= 25;
      
      dim = change/10;
      change %= 10;
      
      nic = change/5;
      change %= 5;
      
      pen = change/1;
      change %= 1; 
      
     
      System.out.println("quarters = "+qrt);
      System.out.println("dimes = "+dim);
      System.out.println("nickels = "+nic);
      System.out.println("pennies = "+pen);
      
      int count = 0;
      int i=0;
      while (count < qrt && i < coinCount.size()) {
         if(coinCount.get(i).equals('Q'))
            coinCount.remove(i);
         count++;
         i++;         
      }
      count = 0;
      i=0;
      while (count < dim && i < coinCount.size()) {
         if(coinCount.get(i).equals('D'))
            coinCount.remove(i);
         count++;
         i++;         
      }
      count = 0;
      i=0;
      while (count < nic && i < coinCount.size()) {
         if(coinCount.get(i).equals('N'))
            coinCount.remove(i);
         count++;
         i++;         
      }
      count = 0;
      i=0;
      while (count < pen && i < coinCount.size()) {
         if(coinCount.get(i).equals('P'))
            coinCount.remove(i);
         count++;
         i++;         
      }
      
   
   }
 /**
 * getSysBalance() -- gets thr user balance\
 * @return -- current total system balance
 */
   public double getSysBalance(){
      return systemBalance;
   }
   
 /**
 * adjSysBalnce() -- adjusts the current system balance and determinds if funds are sufficient
 */
   public void adjSysBalance(){
      Scanner scan = new Scanner(System.in);
      double adjBal = 0.0;
      System.out.println("Enter the amount to withdraw from the machine");
      adjBal = scan.nextDouble();
      if(adjBal > systemBalance){
         System.out.println("Insufficient funds");
         this.adjSysBalance();
      }else{
         systemBalance -= adjBal;
         this.change(adjBal);
      }
         
   }
   
   
}