package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Player {
   private int w;
   private int h;
   private int x;
   private int y;
   private int ticks;
   private int yV;
	
   public Player(int _x, int _y, int _w, int _h){
      w=_w;
      h=_h;
      x=_x;
      y=_y;
      yV = 0;
      ticks = 0;
   
   }
   public void update(){
      ticks++;
      if(ticks % 2 == 0 && yV < 15){
         yV += 2;
      }
      this.y += yV;
   }
   public Rectangle getRect(){
      Rectangle r = new Rectangle(x,y,w,h);
      return r;
   }
   public int getX(){
    return x;
   }
   public void setX(int _x){
	   
   x = _x;
   }
   public int getY(){
   return y;
   }
   public void setY(int _y){
	   y = _y;
   }
   public int getYv(){
   return yV;
   }
   public void setYv(int _yV){
   yV = _yV;
   }
   public int getW(){
   return w;
   }
   public int getH(){
   return h;
   }
   public void paint(Graphics g){
      g.setColor(Color.white);
      g.fillRect(x, y, w, h);
   }
  
   
}


