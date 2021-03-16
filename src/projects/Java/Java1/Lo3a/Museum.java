/**
*Museum - contains txt to print the story using parts of speech from StoryDriver
*@ author  Jake Barber
*@version SEP 18, 2015
*/
import java.util.Scanner;
public class Museum{
   public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      final int ADULT_PRICE = 20;    
      final int SENIOR_PRICE = 18;
      final int STUDENT_PRICE = 14;
      final int YOUTH_PRICE = 14;
      final int STUDENT_MEMBER_FEE = 40;
      final int MEMBER_FEE = 75;
      String memberIn =" ";
      String todayIn =" ";
      String studentIn =" ";   
      int ageIn = 0;
   
      System.out.println("Welcome to the Radford museum of Fine Art!");
      System.out.println("Are you a member? (Y or N)");
      memberIn = scan.next();      
      if(memberIn.equalsIgnoreCase("Y")){         
         System.out.println("Enjoy your day at the Radfort museum of FIne Art!");         
      }
      else if(memberIn.equalsIgnoreCase("N")){
         System.out.println("Would you like to become a member today? (Y or N)");
         todayIn = scan.next();
         if(todayIn.equalsIgnoreCase("Y")){
            System.out.println("Are you a student (with a valid ID)? (Y or N)");
            studentIn = scan.next();
            if(studentIn.equalsIgnoreCase("Y")){
               System.out.println("Your admission today will be $"+STUDENT_MEMBER_FEE+", good for a whole year.\n");
               System.out.println("Enjoy your day at the Radfort museum of FIne Art!");             
            }
            else if(studentIn.equalsIgnoreCase("N")){
               System.out.println("Your admission today will be $"+MEMBER_FEE+", good for a whole year.\n");
               System.out.println("Enjoy your day at the Radfort museum of FIne Art!");
            }
         }
         else if(todayIn.equalsIgnoreCase("N")){
            System.out.println("What is your age?");
            ageIn = scan.nextInt();
            if(ageIn<=12&&ageIn!=0){
               System.out.println("Admission is FREE!");
               System.out.println("Enjoy your day at the Radfort museum of FIne Art!");             
            
            }
            else if((ageIn<=18&&ageIn!=0)){
               System.out.println("Your admission today will be $"+YOUTH_PRICE+".\n");
               System.out.println("Enjoy your day at the Radfort museum of FIne Art!");
            
            }
            else if(ageIn<65&&ageIn!=0){
               System.out.println("Are you a student (with a valid ID)? (Y or N)");
               studentIn = scan.next();
               if(studentIn.equalsIgnoreCase("Y")){
                  System.out.println("Your admission today will be $"+STUDENT_PRICE+".\n");
                  System.out.println("Enjoy your day at the Radfort museum of FIne Art!");             
               }
               else if(studentIn.equalsIgnoreCase("N")){
                  System.out.println("Your admission today will be $"+ADULT_PRICE+".\n");
                  System.out.println("Enjoy your day at the Radfort museum of FIne Art!");
               }
            } 
            
            else if(ageIn>=65){
               System.out.println("Your admission today will be $"+SENIOR_PRICE+".\n");
               System.out.println("Enjoy your day at the Radfort museum of FIne Art!");
            }
         }
      }
      
      else{
         System.out.println("INVALID INPUT");
      }
   }
}