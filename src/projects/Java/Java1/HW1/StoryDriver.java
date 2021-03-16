/**
* StoryDriver.java 
*
*@author Jake Barber    card number 1
*@version 9-SEP-2015
*/
import java.util.Scanner;
public class StoryDriver{
   public static void main(String args[]){
   
      String hldy = "";
      String teacher = "";
      String twoSylSingN = "";    //2 syllable singular noun
      String twoSylAdj = "";   //2 syllable adjective
      String pNoun = "";
      String adj = "";
      String pNoun2 = "";
      String adj2 = "";
      String pNoun3 = "";
      String twoSylAdj2 = "";
      String oneSylPlrlN = "";   //1 syllable plural noun
      String pNoun4 = "";
      String ingV = "";
      String plrlAnml= "";      
      String plrlAnml2= "";
      String ingV2 = "";
      String pNoun5 = "";
      String plrlAnml3 = "";
      String plrlVgtbl = "";
      String ingV3= "";   
      String pNoun6 = "";   
      String ingV4= "";
            
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter a holiday:");
      hldy= scan.nextLine();
      
      System.out.println("A Teacher's Name:");
      teacher = scan.nextLine();
   
      System.out.println("Two Syllable Singular Noun:");
      twoSylSingN = scan.nextLine();
      
      System.out.println("Two Syllable Adjective:");
      twoSylAdj = scan.nextLine();
      
      System.out.println("Plural Noun:");
      pNoun = scan.nextLine();
      
      System.out.println("Adjective");
      adj  = scan.nextLine();
      
      System.out.println("Plural Noun");
      pNoun2= scan.nextLine();
      
      System.out.println("Adjective");
      adj2 = scan.nextLine();
      
      System.out.println("Plural Noun");      
      pNoun3 = scan.nextLine();
      
      System.out.println("Two Syllable Adjective");
      twoSylAdj2 = scan.nextLine();
      
      System.out.println("One Syllable Plural Noun");
      oneSylPlrlN  = scan.nextLine();
      
      System.out.println("Plural Noun");
      pNoun4 = scan.nextLine();
      
      System.out.println("Verb ending in -ing");
      ingV = scan.nextLine();
      
      System.out.println("Animal (Plural)");
      plrlAnml = scan.nextLine();
      
      System.out.println("Animal (Plural)");
      plrlAnml2 = scan.nextLine();
      
      System.out.println("Verb ending in -ing");
      ingV2 = scan.nextLine();
      
      System.out.println("Plural Noun");
      pNoun5   = scan.nextLine();
      
      System.out.println("Animal (Plural)");
      plrlAnml3   = scan.nextLine();
      
      System.out.println("Vegetable (Plural)");
      plrlVgtbl= scan.nextLine();
      
      System.out.println("Verb ending in -ing");
      ingV3 = scan.nextLine();
      
      System.out.println("Plural Noun");
      pNoun6 = scan.nextLine();
      
      System.out.println("Verb ending in -ing");
      ingV4 = scan.nextLine();
     
      System.out.println("Push ENTER to read your wacky story.");
      scan.nextLine();
      
      
      
      
      System.out.println("On the first day of "+hldy+", "+teacher+" gave to me");
      System.out.println("a(n) "+twoSylSingN+" in a pear tree.\n");
        
      System.out.println("On the second day of "+hldy+", "+teacher+" gave to me");
      System.out.println("two "+twoSylAdj+" "+pNoun+", and a(n) "+twoSylSingN+" in a pear tree.\n");
      
      System.out.println("On the third day of "+hldy+", "+teacher+" gave to me");
      System.out.println("three "+adj+" "+pNoun2+", two "+twoSylAdj+" "+pNoun+", and a(n) "
         +twoSylSingN+" in a pear tree.\n");
        
      System.out.println("On the fourth day of "+hldy+", "+teacher+" gave to me");
      System.out.println("four "+adj2+" "+pNoun3+", three "+adj+" "+pNoun2+", two "+twoSylAdj+" "
         +pNoun+", and a(n) "+twoSylSingN+" in a pear tree.\n");
   
      System.out.println("On the fifth day of "+hldy+", "+teacher+" gave to me");
      System.out.println("five "+twoSylAdj2+" "+oneSylPlrlN+", four "+adj2+" "+pNoun3+", three "+adj+" "
         +pNoun2+", two "+twoSylAdj+" "+pNoun+", and a(n) "+twoSylSingN+" in a pear tree.\n");
      
      System.out.println("On the sixth day of "+hldy+", "+teacher+" gave to me");
      System.out.println("six "+pNoun4+" "+ ingV+", five "+twoSylAdj2+" "+oneSylPlrlN+", four "+adj2+" "
         +pNoun3+", three "+adj+" "+pNoun2+", two "+twoSylAdj+" "+pNoun+"\n and a(n) "+twoSylSingN+" in a pear tree.\n");
   
      System.out.println("On the seventh day of "+hldy+", "+teacher+" gave to me");
      System.out.println("seven "+plrlAnml+" swimming, six "+pNoun4+" "+ ingV+", five "+twoSylAdj2+" "+oneSylPlrlN+", four "
         +adj2+" "+pNoun3+", three\n "+adj+" "+pNoun2+", two "+twoSylAdj+" "+pNoun+", and a(n) "+twoSylSingN+" in a pear tree.\n");
   
      System.out.println("On the eighth day of "+hldy+", "+teacher+" gave to me");
      System.out.println("eight "+plrlAnml2+" "+ingV2+", seven "+plrlAnml2+" swimming, six "+pNoun4+" "+ ingV+", five "
         +twoSylAdj2+"\n"+oneSylPlrlN+", four "+adj2+" "+pNoun3+", three "+adj+" "+pNoun2+", two "+twoSylAdj+" "+pNoun+", and a(n) "
         +twoSylSingN+" in a pear \ntree.\n");
   
      System.out.println("On the ninith day of "+hldy+", "+teacher+" gave to me");
      System.out.println("nine "+pNoun5+" dancing, eight "+plrlAnml2+" "+ingV2+", seven "+plrlAnml2+" swimming, six "+pNoun4+"\n"
         + ingV+", five "+twoSylAdj2+" "+oneSylPlrlN+", four "+adj2+" "+pNoun3+", three "+adj+" "+pNoun2+", two "+twoSylAdj+" "
         +pNoun+", and a(n)\n"+twoSylSingN+" in a pear tree.\n");
   
      System.out.println("On the tenth day of "+hldy+", "+teacher+" gave to me");
      System.out.println("ten "+plrlAnml3+" leaping, nine "+pNoun5+" dancing, eight "+plrlAnml2+" "+ingV2+", seven\n"
         +plrlAnml2+" swimming, six "+pNoun4+" "+ ingV+", five "+twoSylAdj2+" "+oneSylPlrlN+", four "+adj2+" "+pNoun3
         +", three\n"+adj+" "+pNoun2+", two "+twoSylAdj+" "+pNoun+", and a(n) "+twoSylSingN+" in a pear tree.\n");
   
      System.out.println("On the eleventh day of "+hldy+", "+teacher+" gave to me");
      System.out.println("eleven "+plrlVgtbl+" "+ingV3+", ten "+plrlAnml3+" leaping, nine "+pNoun5+" dancing, eight "
         +plrlAnml2+"\n"+ingV2+", seven "+plrlAnml2+" swimming, six "+pNoun4+" "+ ingV+", five "+twoSylAdj2+" "+
         oneSylPlrlN+", four\n "+adj2+" "+pNoun3+", three "+adj+" "+pNoun2+", two "+twoSylAdj+" "+pNoun+", and a(n) "
         +twoSylSingN+" in a pear tree.\n");
   
      System.out.println("On the twelfth day of "+hldy+", "+teacher+" gave to me");
      System.out.println("twelve "+pNoun6+" "+ingV4+", eleven "+plrlVgtbl+" "+ingV3+", ten "
         +plrlAnml3+" leaping, nine "+pNoun5+"\ndancing, eight "+plrlAnml2+" "+ingV2+", seven "+plrlAnml2+" swimming, six "
         +pNoun4+" "+ ingV+", five\n"+twoSylAdj2+" "+oneSylPlrlN+", four "+adj2+" "+pNoun3+", three "+adj+" "
         +pNoun2+", two "+twoSylAdj+" "+pNoun+", and a(n) "+twoSylSingN+" in\na pear tree.\n");
   
   
   
           
              
      
      
      
          
      
      
      
   
   
   }
}