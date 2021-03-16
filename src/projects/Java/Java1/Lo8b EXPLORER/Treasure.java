/**
 * Treasure -- Defines a Treasure 
 *
 * @author  Jake Barber
 * @version 6 NOV, 2015
 */
public class Treasure{
   private String name;
   private String description;
   private double weight;
   private int value;

   public Treasure(String _name, String _description, double _weight, int _value){
      name = _name;
      description = _description;
      weight = _weight;
      value = _value;
   }
   public String getName(){
      return name;
   }
   public void setName(String _name){
      name = _name;
   }
   public String getDescription(){
      return description;
   }
   public void setDescription(String _description){
      description = _description;
   }
   public double getWeight(){
      return weight;
   }
   public void setWeight(double _weight){
      weight = _weight;
   }
   public int getValue(){
      return value;
   }
   public void setValue(int _value){
      value = _value;
   }
   public boolean equals(Treasure t){
      boolean equals = false;
      if(this.name.equals(t.name)&&this.description.equals(t.description)&&this.weight==t.weight&&this.value==t.value){
      equals=true;
      }
      return equals;
   }
   public int compareTo(Treasure t){
   int comp = 0;
   comp = this.value-t.value;
   return comp;
   }
   public String toString(){
      return("Name: "+name+"\nDescription: "+description+"\nWeight: "+weight+" Value: "+value);
   }
}