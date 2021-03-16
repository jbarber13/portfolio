package Project5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
/*
 * Player.java - Represents the player for the platform jump game
 * @author Jake Barber
 * @version 11/28/16
 */
public class Player{
   private int w;
   private int h;
   private int x;
   private int y;
   private double xV;
   private int yV;
   
   /*
   *  Player - constructor for the Player class
   */
   public Player(int _x, int _y, int _w, int _h){
      w=_w;
      h=_h;
      x=_x;
      y=_y;
      xV = 0.0;
      
   
   }
   /*
   *  getRect - returns the rectangle that represents the player
   */
   public Rectangle getRect(){
      Rectangle r = new Rectangle(x,y,w,h);
      return r;
   }
   
   /*
   *  update - updates the players speed left or right
   */
   public void update(){//OLD UPDATE METHOD      
      this.x += xV;
   }
   
   /*
   *  left - moves the player left
   */
   public void left(){
      if(this.xV<=0){
         this.xV-=1.5;
      }
      else{
         this.xV = 0;          
      }
   }
   /*
   *  right - moves the player right
   */
   public void right(){
      if(this.xV>=0){
         this.xV+=1.5;
      }
      else{
         this.xV = 0;           
      }
   }
   
   /*
   *  getX - returns the x value
   */
   public int getX(){
      return x;
   }
   
   /*
   *  setX - sets the value for x
   */
   public void setX(int _x){      
      x = _x;
   }
   
   /*
   *  getY - returns the Y value
   */
   public int getY(){
      return y;
   }
   
   /*
   *  getW - returns the W value
   */
   public int getW(){
      return w;
   }
   
   /*
   *  getXv - returns the value representing the velocity of the player int he X dimension
   */
   public int getXv(){
      return yV;
   }
   
   /*
   *  setXv - sets the value representing the velocity of the player int he X dimension
   */
   public void setXv(int _xV){
      xV = _xV;
   }
   
   /*
   *  setY - sets a new Y value
   */
   public void setY(int _y){
      y = _y;
   }
  
  /*
   *  paint - paints the player on the game screen
   */
   public void paint(Graphics g){
      g.setColor(Color.green);
      g.fillRect(x, y, w, h);
   }

}