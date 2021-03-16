/**
 * GameLogic -- Logic to play Shut the Box 
 *
 * @author  Jake Barber
 * @version 19 NOV, 2015
 */
import java.util.*;

public class GameLogic {

/** @return true if and only if the sum of the dice equals the sum of the tiles that are
    currently selected.
    
    For example, if the dice add up to 11 and only tile[2] and tile[8]
    are selected false is returned.  Were only tile[3] and tile[8] selected, it would return
    true.

    @param tiles an array of Tile objects.  The array size is 10.  tiles[0] is null, tiles[1]
    represents tile 1, tiles[2] represents tile 2, and so forth.
 */
   static boolean sumsAreEqual(Tile[] tiles, Die die1, Die die2) {
      boolean eq = false;
      int dieSum = die1.getValue() + die2.getValue();
      int tileSum = 0;
     
      for(int i=0; i<tiles.length; ++i){
         if(tiles[i].getState()!= 0){
           tileSum += tiles[i].getValue();
        }
      }
      
      if(tileSum==dieSum){
         eq = true;
      }   
      return eq;
   }

/** @return true if and only if the sum of the dice equals the sum of the tiles that are
    currently selected and there are no tiles left available.

    @param tiles an array of Tile objects.  The array size is 10.  tiles[0] is null, tiles[1]
    represents tile 1, tiles[2] represents tile 2, and so forth.
 */
   static boolean playerHasWon (Tile[] tiles, Die die1, Die die2){
      boolean victory = false; 
      boolean allSelected = true;
      int tileSum = 0;
      int dieSum = die1.getValue() + die2.getValue();
      for(int i=0; i<tiles.length; ++i){
         if(tiles[i].getState()==0){
            allSelected = false;
         }
      } 
      if(allSelected){ 
         for(int i=0; i<tiles.length; ++i){
            tileSum += tiles[i].getValue();
         }
      }
      if(tileSum==dieSum)
         victory = true;
      return victory;
   }

/** @return true if and only if there exists some combination of tiles that are not flipped that
    will add up to the sum of the dice.

    @param tiles an array of Tile objects.  The array size is 10.  tiles[0] is null, tiles[1]
    represents tile 1, tiles[2] represents tile 2, and so forth.
*/

   static boolean flipIsPossible (Tile[] tiles, Die die1, Die die2) {
      boolean possible = false;
      int dieSum = die1.getValue() + die2.getValue();
      
            return possible;
   }

}
