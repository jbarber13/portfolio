import java.util.*;
import java.io.*;

public class AddressList {
 /**
 This nested, private class represents a node of a singly linked list.
 */
   private class ListNode
   {
      private String name;
      private String tel; // Telephone number
      private String email;
      private String addr; // Address
      private String dob; // Date of birth
      private ListNode next; // Pointer to the next node
   
      private ListNode(String name, String tel, String email, String addr, String dob)
      {
         this.name = name;
         this.tel = tel;
         this.email = email;
         this.addr = addr;
         this.dob = dob;
      } // end of the constructor
   
      public String getName() { 
         return name; }
      public String getTel() { 
         return tel; }
      public String getEmail() { 
         return email; }
      public String getAddr() { 
         return addr; }
      public String getDob() {
         return dob; }
   
      public void setName(String name) { this.name = name; }
      public void setTel(String tel) { this.tel = tel; }
      public void setEmail(String email) { this.email = email; }
      public void setAddr(String addr) { this.addr = addr; }
      public void setDob(String dob) { this.dob = dob; }
   
      public ListNode getNext() { 
         return next; }
      public void setNext(ListNode link) { next = link; }
   } // end of class ListNode
   
   
   
   
   
   
   private ListNode head;
   private ListNode current;
   
   public AddressList(){
      head = new ListNode("head", "", "", "", "");
      current = head;
      
      
      
      
      //init
      /*
      addToFront("name1", "t1", "e1", "a1", "d1");
      addToFront("name2", "t2", "e2", "a2", "d2");
      addToFront("name3", "t3", "e3", "a3", "d3");
      */
      //System.out.println(phoneNumberByName("s"));
   
               
   }
   public void reset(){
      current = head;
   }


   public boolean isEmpty(){
      boolean empty = false;
      if(head.getNext()== null){
         empty = true;
      }   
      return empty;
   }
   public void addToFront(String name, String tel, String email, String address, String dob){
      //System.out.println("add to front");
      ListNode n = new ListNode(name, tel, email, address, dob);
      n.setNext(head.getNext());
      head.setNext(n);
      current = head;
   }
   public void addToFront(ListNode n){
      n.setNext(head.getNext());
      head.setNext(n); 
      current = head;     
   }
   
   public void addToBack(String name, String tel, String email, String address, String dob){
      ListNode n = new ListNode(name, tel, email, address, dob);
   
      if(!this.isEmpty()){
         if(current.getNext() == null){
            current.setNext(n);
            current = head;
         }else{
            current = current.getNext();
            addToBack(n.getName(), n.getTel(), n.getEmail(), n.getAddr(), n.getDob());
         }           
      }
   }
   public void addToBack(ListNode n){
      if(!this.isEmpty()){
         if(current.getNext() == null){
            current.setNext(n);
            current = head;
         }else{
            current = current.getNext();
            addToBack(n);
         }           
      }
   
   }
   public String toString(){
   
      if(current.getNext() == null || current == null){
         //System.out.println("null?");
         return "";
      }else
         //System.out.println(current.getName());          
         current = current.getNext();
      return current.getName()+" "+current.getTel()+" "+current.getEmail()+" "+current.getAddr()+" "+current.getDob()+"\n\n" + toString();
      
   }
     
   
   public String reverseToString(){ 
      this.reverse(); 
      String out = this.toString();
      this.reverse();      
      return out;
      //return "words";
   }/*
   public AddressList reverse(){
      AddressList reverse = new AddressList();   
      if(head.getNext() != null){
         current = head.getNext();
         this.reverse(current, current.getNext(), null);     
         
         current = head.getNext();
         while(current != null){
            reverse.addToBack(current);
            current = current.getNext(); 
         }
         current = head.getNext();
         this.reverse(current, current.getNext(), null);       
      }  
      return reverse;     
   }*/
   public void reverse(){
      current = head;
      ListNode pre = null;
      ListNode next = null;
      
      
      while(current != null){
         //System.out.println("loop");
         next = current.getNext();
         current.setNext(pre);
         pre = current;
         current = next;
      }
      
      //System.out.println(next.getName());
      current = pre;
      //head.setNext(pre);
      //current = head;
      //System.out.println(head.getNext().getName());
      
      //head.setNext(current);
   }
   public void reverse(ListNode p1, ListNode p2, ListNode previous){
      
      if(p2.getNext() != null){
         ListNode t1 = p2;
         ListNode t2 = p2.getNext();
         p1.setNext(previous);
         previous = p1;
         reverse(t1,t2,previous);
      }else{
         p2.setNext(p1);
         p1.setNext(previous);
         head.setNext(p2);
      }
      
   
   }
   public int sizeOf(){
      int size = 0;
      if(current.getNext() == null){
         current = head;
         return 0;
      }else{
         current = current.getNext();         
         return 1 + sizeOf();
      }     
   }
   
 
   public String phoneNumberByName(String name){
      try{
         if(current == null){
            return "no matching data";
         }else{
            current = current.getNext();
            if(current.getName().equals(name)){
               return current.getTel();
            }else
               return phoneNumberByName(name);
         }
      }catch(Exception e){System.out.println(e);}
      return "no matching data";
   }
   
   public String emailByName(String name){
      try{
         if(current == null){
            return "no matching data";
         }else{
            current = current.getNext();
            if(current.getName().equals(name)){
               return current.getEmail();
            }else
               return emailByName(name);
         }
      }catch(Exception e){System.out.println(e);}
      return "no matching data";
   }
   public String nameByPhoneNumber(String phoneNum){
      try{
         if(current == null){
            return "no matching data";
         }else{
            current = current.getNext();
            if(current.getTel().equals(phoneNum)){
               return current.getName();
            }else
               return nameByPhoneNumber(phoneNum);
         }
      }catch(Exception e){System.out.println(e);}
      return "no matching data";
   }
   public String dobByName(String name){
      try{
         if(current == null){
            return "no matching data";
         }else{
            current = current.getNext();
            if(current.getName().equals(name)){
               return current.getDob();
            }else
               return dobByName(name);
         }
      }catch(Exception e){System.out.println(e);}
      return "no matching data";
   }
   
   
   
  

}