/**
 * Explorer -- Defines an Explorer 
 *
 * @author  Jake Barber
 * @version 30 OCT, 2015
 */
public class Explorer{
   private String name;
   private Room room;
   private Treasure leftPocket;
   private Treasure rightPocket;
   
   public Explorer(String _name, Room _room, Treasure _leftPocket, Treasure _rightPocket){
      name = _name;
      room = _room;
      leftPocket = _leftPocket;
      rightPocket = _rightPocket;   
   }
   public String getName(){
      return name;
   }
   public void setName(String _name){
      name = _name;
   }
   public String toString(){
      return "Explorer: "+name+"\nLeft Pocket: "+leftPocket.getName()+"\nRight Pocket: "+rightPocket.getName()+"Room: "+room.getName();
   }

}