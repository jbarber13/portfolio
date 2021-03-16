/**
 * TreasureTest -- Tests Treasure 
 *
 * @author  Jake Barber
 * @version 6 NOV, 2015
 */
public class TreasureTest{
   public static void main(String args[]){
      Treasure t1 = new Treasure("Key", "Golden Key", 1.5, 25);
      Treasure t11 = new Treasure("Key", "Silver Key", 1.5, 25);
      Treasure t12 = new Treasure("Key", "Golden Key", 1.5, 10);
      Treasure t13 = new Treasure("Key", "Golden Key", 2.5, 25);
      Treasure t14 = new Treasure("theKey", "Golden Key", 1.5, 25);
      System.out.println(t1==t1);
      System.out.println(t1==t11);
      System.out.println(t1.equals(t1));
      System.out.println(t1.equals(t11));
      System.out.println(t1.equals(t12));
      System.out.println(t1.equals(t13));
      System.out.println(t1.equals(t14));
      System.out.println(t1.compareTo(t1));
      System.out.println(t1.compareTo(t12));
      System.out.println(t12.compareTo(t1));
      
      Room StartRoom = new Room("Start Room", "A cold, dark, damp place", t1);
      Explorer Steve = new Explorer("Steve", StartRoom, t1, t1);
      Explorer Mike = new Explorer("Mike", StartRoom, t1, t11);  
      Explorer Jane = new Explorer("Jane", StartRoom, t1, t1);  
      Explorer Leo = new Explorer("Leo", StartRoom, t1, t12);
      Explorer Sara = new Explorer("Sara", StartRoom, t11, t13);  
      Explorer Andy = new Explorer("Andy", StartRoom, t1, t12);
      Explorer Charles = new Explorer("Charles", StartRoom, t12, t1);
         
   }
}