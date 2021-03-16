/**
*  Public Class Item
*  Represents an item that can be added to or exist in the inventory
*
* @author  Jake Barber
* @version October 1, 2017
*/
public class Item{
   private double cost;
   private String name;
   private int qty;   
   
   public Item(String _name, double _cost, int _qty){
      cost = _cost;
      name = _name;
      qty = _qty;
   }
   public void setQty(int _qty){
      qty = _qty;
   }
   public int getQty(){
      return qty;
   }
   public String getName(){
      return name;
   }
   public double getCost(){
      return this.cost;
   }
   public String toString(){
   String out = "Item: "+name+"\nCost: "+cost+"\nNumber available: "+qty;
   out += "\n\n";
   return out;
   }
}