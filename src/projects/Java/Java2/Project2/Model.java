/**   Model.java   Contains the logic for for Project 2 Palindrome tester
 *
 * @author Jake Barber
 * @version 10/17/16
 */
import java.util.*;
public class Model{

   private String input;
   private Stack<Character> stk;
   private Queue<Character> q;
   private String qString;
   private String stkString;
   //private boolean palindrome;
   
   public Model(String _input){
      //System.out.println("MODEL CONSTRUCTOR");
      input = this.valid(_input);
      stk = new Stack<Character>();
      q = new LinkedList();
      //q = new PriorityQueue<Character>();
      this.queue(input);//initalizes q
      this.stack(input);//initailizes stk
   
      qString = this.toString(q);//initalizes qString to comparable String
      stkString = this.stkToString(stk);//initalizes stkString to comparable String
      
      
      //palindrome = false;
   
   
   }
   /* valid    
   *  removes invalid charicters from input string
   */
   private String valid(String s){
      //System.out.println("valid");
      String x = "";
      for(int i=0; i<s.length(); ++i){
         if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z')){
            x+=s.charAt(i);
         }      
      }   
      return x;
   }
   /* queue    
   *  adds valid characters to the queue
   */
   private void queue(String s){
      //System.out.println("queue method");
     // System.out.println("queue method starting string: "+s);
      
      for(int i=0; i<s.length(); ++i){
         try{
            this.q.add(s.charAt(i));
            //System.out.print(s.charAt(i));
         }
         catch(NullPointerException e){
            System.out.println("null pointer queue method");
         }
         catch (Exception e){
            System.out.println("queue method error");
         }
      }
      //System.out.println(q.toString());
   }
   /* stack    
   *  pushes valid characters onto the stack
   */
   private void stack(String s){
      //System.out.println("stack method");
      for(int i=0; i<s.length(); ++i){
         try{
            this.stk.push(s.charAt(i));
         }
         catch(NullPointerException e){
            System.out.println("null pointer stack method");
         }
         catch (Exception e){
            System.out.println("stack method error");
         }
      }
   }
   
   /* toString    
   *  pops chars off of the stack to reverse order and returns a string of those chars
   */   
   private String stkToString(Stack<Character> stack){
      //System.out.println("toString stack");
      String s = "";
      while(!stack.empty()){
         try{                                  
               s += stack.pop();
           
         }
         catch(NullPointerException e){
            System.out.println("null pointer stack ToString method");
         }
         catch (Exception e){
            System.out.println("stack toString method error");
         }
      }
      
      //System.out.println(s);
   
      return s;
   }
   /* toString    
   *  removes chars from queue to preserve order and stores those chars in a string
   */
   
   private String toString(Queue<Character> _q){
      //System.out.println("toString queue");
      //System.out.println(q.toString());
      //System.out.println(input);
      String s = "";
      while(!_q.isEmpty()){
         try{
            s += _q.remove();
         }
         catch(NullPointerException e){
            System.out.println("null pointer stack ToString method");
         }
         catch (Exception e){
            System.out.println("stack toString method error");
         }
         
      }
      return s;
   }
   /* palindrome    
   *  compares the contents of the queue and the stack to determine if palindrome
   *  returns boolean
   */
   public boolean palindrome(){
      System.out.println("\nQueueResult:"+qString+"\nStackResult: "+stkString);
      boolean p = false;
      
      if(qString.equals(stkString)){
         p = true;
         //System.out.println(">>>>>>>>>>PALENDROME<<<<<<<<<<");
      }
      return p;
   }

}