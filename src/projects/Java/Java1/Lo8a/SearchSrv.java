/**
 * SearchDrv -- Methods to search Arrays 
 *
 * @author  Jake Barber
 * @version 23 OCT, 2015
 */
public class SearchSrv{
   public int timesFound(int[] nums, int num){
      int count = 0;
      for(int i=0; i<nums.length; ++i){
         if(nums[i]==num){
            ++count;
         }
      }
      return count;
   }
   public boolean isFound(int[] nums, int num){
      boolean found = false;
      for(int i=0; i<nums.length; ++i){
         if(nums[i]==num){
            found=true;
         }
      }   
      return found;
   }
   public int range(int[] nums){
      int range = 0;
      int max=0;
      int min=999999;
      if(nums.length>0){
         for(int i=0; i<nums.length; ++i){
            if(nums[i]>max)
               max = nums[i];
            if(nums[i]<min)
               min = nums[i];
         }
         range = max-min;  
      } 
      return range;
   }
   public int[] reverse(int[] nums){
      int[] reverse = new int[nums.length];
      for(int i=nums.length-1; i>=0; --i){
         for(int j=0; j<nums.length; ++j){
            reverse[j]=nums[i];
         }
      }
      
      return reverse;
   }

}
