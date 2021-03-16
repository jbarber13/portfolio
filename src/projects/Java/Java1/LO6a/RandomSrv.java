/**
*RandomSrv - prints a histogram
*@ author  Jake Barber
*@version OCT 16, 2015
*/
import java.util.Random;
public class RandomSrv{
   final int UPPER_BOUND = 10;
   int count0 =0;
   int count1 =0;
   int count2 =0;
   int count3 =0;
   int count4 =0;
   int count5 =0;
   int count6 =0;
   int count7 =0;
   int count8 =0;
   int count9 =0;
   Random randObj = new Random();

   public void generateNumbers(int total){      
      for(int i=0; i<total;++i){
         //System.out.println(randObj.nextInt(UPPER_BOUND));
         switch (randObj.nextInt(UPPER_BOUND)){
            case 1: count1++;
               break;
            case 2: count2++;
               break;
            case 3: count3++;
               break;
            case 4: count4++;
               break;
            case 5: count5++;
               break;
            case 6: count6++;
               break;
            case 7: count7++;
               break;
            case 8: count8++;
               break;
            case 9: count9++;
               break;
            case 0: count0++;
               break;
         }
      }
      this.print(1, count1);
      this.print(2, count2);
      this.print(3, count3);
      this.print(4, count4);
      this.print(5, count5);
      this.print(6, count6);
      this.print(7, count7);
      this.print(8, count8);
      this.print(9, count9);
      this.print(0, count0); 
            
   }//end generateNumbers 1
   public void print(int num, int count){
      String hist = "";
      for(int i=0; i<count; ++i)
         hist+='*';
      System.out.println(num+" "+hist);
   }//end print1
   public int[] generateNumbers(int total, int upperBound){
      int[] counters = new int[total];
      for(int i=0; i<counters.length;++i){
         counters[i]=randObj.nextInt(upperBound);
      }   
      return counters;
   }
   public void print(int[] nums){
      for(int i=0; i<nums.length;++i){
         this.print(i, nums[i]);
      }
   }
   
   
   
}