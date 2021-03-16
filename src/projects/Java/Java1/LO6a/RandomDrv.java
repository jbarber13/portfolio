/**
*RandomDrv - prints a histogram
*@ author  Jake Barber
*@version OCT 16, 2015
*/
public class RandomDrv{
   public static void main(String args[]){
   RandomSrv test = new RandomSrv();
   test.generateNumbers(100);
  // test.print(0, 0);
  System.out.println();
  int[] random = test.generateNumbers(200, 20);
  test.print(random);
   }
}