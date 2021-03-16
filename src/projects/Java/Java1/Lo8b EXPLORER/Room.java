/**
 * Room -- Defines a Room 
 *
 * @author  Jake Barber
 * @version 30 OCT, 2015
 */
public class Room{
   private String name;
   private String description;
   private Treasure treasure;
   
   public Room(String _name, String _description, Treasure _treasure){
      name = _name;
      description = _description;
      treasure = _treasure;
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
   public String toString(){
      return "Room: "+name+"\nDescription: "+description+"\nTreasure: "+treasure.getName();
   }
}