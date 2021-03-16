public class Test{

   public Test(){
      this.testNum();
   }
   public boolean testNum(){
      String x = "x";
   
      if(x.equals("y")){
         return true;
      }else{
         System.out.println("asdf");
         return false;
      }
   }
   public static void main(String args[]){
      Test t = new Test();
   }
}