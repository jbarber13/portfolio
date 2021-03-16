/**
 * ExplorerTest -- Tests Explorer 
 *
 * @author  Jake Barber
 * @version 30 OCT, 2015
 */
public class ExplorerTest{
   public static void main(String args[]){
      Treasure lint = new Treasure("Lint", "A piece of dust", 0, 0);
      Treasure key = new Treasure("Key", "A golden key", 5, 25);
      Room StartRoom = new Room("Start Room", "A cold, dark, damp place", key);
      Explorer Steve = new Explorer("Steve", StartRoom, lint, lint);
      System.out.println(Steve);
      System.out.println(StartRoom);
      System.out.println();
      System.out.println(key);
      System.out.println();   
   }
}