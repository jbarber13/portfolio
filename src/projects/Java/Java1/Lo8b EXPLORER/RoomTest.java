/**
 * RoomTest -- Tests Room 
 *
 * @author  Jake Barber
 * @version 30 OCT, 2015
 */
public class RoomTest{
   public static void main(String args[]){
      Treasure lint = new Treasure("Lint", "A piece of dust", 0, 0);
      Treasure key = new Treasure("Key", "A golden key", 5, 25);
      Room StartRoom = new Room("Start Room", "A cold, dark, damp place", key);
      Room Davis225 = new Room("Davis225", "Computer Lab", lint);
      
      System.out.println(StartRoom);
      System.out.println();
      System.out.println(key);
      System.out.println();
      System.out.println(Davis225);
      System.out.println();
      System.out.println(lint);
      System.out.println();  
   }
}