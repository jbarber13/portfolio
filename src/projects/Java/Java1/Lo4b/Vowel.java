/* Vowels.java -- counts vowels 
*  
*@author Jake Barber
*@version SEP 25, 2015
*/
import java.util.Scanner;
public class Vowel{
   public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      final String QUIT = "quit";
      String input = "";
      String vowels = "";
      int count = 0;
      int i = 0;
      
      System.out.println("Welcome to the vowel counter.\nEnter a sentence (type Quit to quit):");  
      input = scan.nextLine();
      while(input.compareToIgnoreCase(QUIT)!=0){
         while(i<input.length()){
            if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'
            ||input.charAt(i)=='A'||input.charAt(i)=='E'||input.charAt(i)=='I'||input.charAt(i)=='O'||input.charAt(i)=='U'){
               ++count;
               vowels += input.charAt(i);
            }
            i++;
         }
         System.out.println("There are "+count+" vowels in the sentence\n"+input);
         System.out.println("They are: "+vowels); 
         input = "";
         vowels = "";
         count = 0;
         i=0;
         System.out.println("Welcome to the vowel counter.\nEnter a sentence (type Quit to quit):");  
         input = scan.nextLine(); 
      }
      System.out.println("\n\nThank you for using the vowel counter.\n");
   }
}