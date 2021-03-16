package Project5;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.util.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
//import sun.audio.*;
import java.io.*;
/*
 * View.java - Sets up and runs the GUI for the block maze game
 * @author Jake Barber
 * @version 11/28/16
 */
public class View implements ActionListener, KeyListener{
   public  static View view;
   private final int SIZE = 1700;//Developed on 1440p display, reduce for smaller resolutions, >850 for best results
   private final int W=SIZE/2, H=SIZE;
   private Player player;
   private Random rand;
   private final int SPEED = 3;
   private boolean gameOver, gameStart;
   private int score;
   private ArrayList<Rectangle> blocks;
   private Timer t;
   private int space = 400;
   private Renderer renderer;
   private static View VIEW;
   

/*
 * view - Constructor for the the View class 
 */
   public View(){
      JFrame jframe = new JFrame();  
      t = new Timer(25, this); 
      
      //renderer = new Renderer(VIEW);
      renderer = new Renderer();
      jframe.add(renderer);
         
      player = new Player(W/2-10, H-(H/4), 20, 20);    
      jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jframe.setSize(W,H);
      jframe.setVisible(true);
      jframe.setResizable(true);
      jframe.setTitle("PROJECT 5");
      jframe.addKeyListener(this);
      t.start();      
      rand = new Random();     
      blocks = new ArrayList<Rectangle>();      
      gameOver = false;
      gameStart = false;
      score = 0; 
      
    
      this.addBlock(true);
      this.addBlock(true);
      this.addBlock(true);
      this.addBlock(true);
      this.addBlock(true);
      this.addBlock(true);
   
   
   }//end constructor
   
/*
 * addBlock - adds blocks to the arraylist with random dimensions 
 */
   public void addBlock/*heh*/(boolean b){
      //System.out.println("addBlock"); 
      
      int width = rand.nextInt(SIZE/3)-150;
      int height = 100;
   
      try{
         if(b){
            blocks.add(new Rectangle(0,blocks.size()*150-(SIZE/2 + 400), width,height));//right side
            blocks.add(new Rectangle((int)blocks.get(blocks.size()-1).getWidth()+(int)space, blocks.size()*150-(SIZE/2 + 400), 10000,height));//left
         }
         else {
           // System.out.println("false addBlock");
            //blocks.add(new Rectangle(blocks.get(blocks.size() - 1).y + 300, H-height-120, width, height));
            //blocks.add(new Rectangle(blocks.get(blocks.size() - 1).y+300, 100000,width,height));
            
            blocks.add(new Rectangle(0,blocks.size()*150 - SIZE, width,height));//right side
            blocks.add(new Rectangle((int)blocks.get(blocks.size()-1).getWidth()+(int)space, blocks.size()*150-SIZE, 10000,height));//left
            
            /*
            blocks.add(new Rectangle(0,blocks.get(blocks.size() - 1).y + 600, width, height));
            blocks.add(new Rectangle(blocks.get(blocks.size() - 1).y+300, 100000,width,height));
            */         
         }
         space--;
         System.out.println(space);
      }
      catch(Exception e){
         e.printStackTrace();
      }
      
   }
   
/*
 * paintBlock - paints the given block on the game panel 
 */
   public void paintBlock(Graphics g, Rectangle block){
      g.setColor(Color.red);
      //System.out.println("paintBlock");   
      g.fillRect(block.x, block.y, block.width, block.height);
   }
   
/*
 * repant - is called continously by Renderer to keep the game panel up to date 
 */
   public void repaint(Graphics g) {
      //System.out.println("REPAINT");
      g.setColor(Color.black);
      g.fillRect(0, 0, W, H);
      //System.out.println("repaint"); 
      //System.out.println(blocks.size());    
      for(Rectangle c : blocks){
         paintBlock(g, c);
         //System.out.println("repaint forEach loop");      
      }
      g.setColor(Color.orange);
      g.fillRect(0, H-150, W, 150);
      g.setColor(Color.red);
      g.fillRect(0, H-150, W, 20);
      //cc.paint(g);
      g.setColor(Color.white);
      g.setFont(new Font("Ariel", 1, 80));
      player.paint(g);
      if(!gameStart){ 
         g.drawString(" Left or Right arrows", SIZE/2-SIZE/2, SIZE/2-SIZE/3);
         g.drawString(" to play!!", SIZE/2-SIZE/2, SIZE/2-SIZE/5);
      } 
      if(gameOver){
         g.drawString("GAME OVER", SIZE/2, SIZE/2);
         g.setFont(new Font("Ariel", 1, 50));
         g.drawString("CLICK TO TRY AGAIN", SIZE/2, SIZE/2+50);
         g.drawString("SCORE: "+score, SIZE/2, (SIZE/7)*3);
      }
      if(!gameOver && gameStart){
         g.drawString(String.valueOf(score), 50,80);
      }
      
   
   }//end repaint
   
/*
 * sideScroll - scrolls the blocks from top to bottom
 */
 
   public void sideScroll(){
      for(int i=0;i<blocks.size();++i){
         Rectangle c = blocks.get(i);
         c.y += SPEED;
      }
      
        
      for(int i=0;i<blocks.size();++i){
         //System.out.println("test");         
         Rectangle c = blocks.get(i);
         if(c.y > SIZE){
            blocks.remove(c);
            
            if(c.y > SIZE && blocks.size() < 10)
               addBlock(false);
               
         }
      }
      
   }
   
/*
 * checkCollision - checks to see if the player has collided with an obsticle or the edge of the game
 */
   public void checkCollision(){      
      
      for(Rectangle c : blocks){
         //int xStart = player.getX();
      
         if(c.intersects(player.getRect()) && (!(c.y==0 && ((player.getX()+player.getW())/2) > (((c.x + c.width) / 2)-2) && ((player.getX()+player.getW())/2)<(((c.x + c.width)/2)+2))) ) {
            //System.out.println("INTERSECT");
           // gameOver = true;
            player.setX(c.x-player.getRect().width);
         }
         if(player.getX()<0)
            gameOver = true;
      }
      if(player.getY()>H-120 || player.getY()<0){
         gameOver = true;
         player.setY(H-120 - player.getRect().height);
         //System.out.println("OUT OF BOUNDS");
      }
      
      
   }


/*
 * actionPerformed - is called continously to update the game
 */
   public void actionPerformed(ActionEvent e) {
      //System.out.println("ACTION PERFORMED");
      if(gameStart){
         player.update();
         sideScroll();
         renderer.repaint();
         checkCollision();
         //checkScore();
      }
      	
   } 
 /*
 * keyPress - determines what to do when a key is pressed
 */
   public void keyPress(int dir){
      if(gameOver){
         blocks.clear();
         player = new Player(SIZE/2-10, SIZE/2-10, 20,20);
         player.setXv(0);
         
         score = 0;     
         gameOver = false;
      }
      if(!gameStart){
         gameStart = true;      
      }
      else if(!gameOver){
         /*if(player.getYv()>0){
            player.setYv(0);
         }
         //player.setYv(player.getYv()-10);
         */
       
         switch(dir){
            case 0://left
               //System.out.println("LEFT");
               player.left();
               break;
            case 1://right
               //System.out.println("RIGHT");
               player.right();            
               break;
         }
      }     
   }
   
/*
 * keyPressed - determines which key was pressed
 */
   public void keyPressed(KeyEvent e){ 
      int keyCode = e.getKeyCode();
      switch( keyCode ) { 
         case KeyEvent.VK_LEFT:
            this.keyPress(0);
            break;
         case KeyEvent.VK_RIGHT :
            this.keyPress(1);
            break;
      }
      
   }
   
/*
 * keyReleased - determines when a key is released
 */
   public void keyReleased(KeyEvent e){
        
   }
   
/*
 * keyTyped - determines when a key is typed
 */
   public void keyTyped(KeyEvent e){
   
   } 
   
/*
 * main - runs the game
 */
   public static void main(String[] args){
      view = new View();   
   }
}