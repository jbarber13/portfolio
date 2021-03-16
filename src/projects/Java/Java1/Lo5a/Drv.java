/**
*Drv.java- Tests methods.
*@ author  Jake Barber
* version OCT 2, 2015
*/
public class Drv{
   public static void main(String args[]){
      //System.out.println("\nStarting the Driver");
      Srv srvObj = new Srv();
      int result = srvObj.sum(1, 2);
      System.out.println("1 + 2 = "+result);
      String str =  srvObj.sum("ITEC", 120);
      System.out.println("ITEC + 120 ="+str);
      
      /*****
      System.out.println("Calling Srv.sum(2, 1)");
      System.out.println("\nReturned to driver");
      
      int n1 = 5;
      int n2 = 10;
      System.out.println("Calling sum("+n1+", "+n2+")");
      srvObj.sum(n1, n2);
      System.out.println("\nReturned to driver");
      
      System.out.println("Calling sum("+n2+", "+n1+")");
      srvObj.sum(n2, n1);
      System.out.println("\nReturned to driver");
      System.out.println("Ending the driver");
      *****/
   
   }
}