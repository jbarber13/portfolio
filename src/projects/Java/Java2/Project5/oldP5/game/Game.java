package game;

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

public class Game implements ActionListener, MouseListener, KeyListener{
   public  static Game game;
   private final int SIZE = 1700;//>850 for best results
   private final int W=SIZE, H=SIZE;
   private Renderer renderer;
   private Player player;
   private Random rand;
   private final int SPEED = 10;
   private boolean gameOver, gameStart;
   private int score;
   
   //private Sound sound;
   
   //ColumnCollection cc;
   private ArrayList<Rectangle> columns;
   
   
   
   public Game(){
      JFrame jframe = new JFrame();
   
      Timer timer = new Timer(25, this);
     
      renderer = new Renderer();
      player = new Player(W/2-10, H/2-10, 20, 20);
     
     
      jframe.add(renderer);
      jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jframe.setSize(W,H);
      jframe.setVisible(true);
      jframe.setResizable(false);
      jframe.setTitle("PROJECT 5");
      jframe.addMouseListener(this);
      jframe.addKeyListener(this);
      
      timer.start();
      
      rand = new Random();
      
      columns = new ArrayList<Rectangle>();
      
      gameOver = false;
      gameStart = false;
      score = 0;
      
      //audio();
      //sound = new Sound("/music.wav");
      
      
      addColumn(true);
      addColumn(true);
      addColumn(true);
      addColumn(true);     
   
   }//constructor
   public void paintColumn(Graphics g, Rectangle column){
      g.setColor(Color.red);
      //System.out.println("paintColumn");   
      g.fillRect(column.x, column.y, column.width, column.height);
   }
   public void addColumn(boolean b){
      //System.out.println("addColumn"); 
      int space = 300;
      int width = 100;
      int height = 50 + rand.nextInt(SIZE/2-100);
   
      try{
         if(b){
            columns.add(new Rectangle(W+width+columns.size()*300, H-height-120,width,height));
            columns.add(new Rectangle(W+width+(columns.size()-1)*300, 0,width,H-height-space));
         }
         else {
            columns.add(new Rectangle(columns.get(columns.size() - 1).x + 600, H-height-120, width, height));
            columns.add(new Rectangle(columns.get(columns.size() - 1).x, 0,width,H-height-space));         
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }
      
   }
   public void actionPerformed(ActionEvent e) {
      if(gameStart){
         player.update();
         sideScroll();
         renderer.repaint();
         checkCollision();
         checkScore();
      }
      	
   }   
   
   public void sideScroll(){
      for(int i=0;i<columns.size();++i){
         Rectangle c = columns.get(i);
         c.x -= SPEED;
      }
      for(int i=0;i<columns.size();++i){
         Rectangle c = columns.get(i);
         if(c.x + c.width < 0){
            columns.remove(c);
            if(c.y == 0)
               addColumn(false);
         }
      }
      
   }
   
   public void repaint(Graphics g) {
      g.setColor(Color.black);
      g.fillRect(0, 0, W, H);
      //System.out.println("repaint"); 
      //System.out.println(columns.size());    
      for(Rectangle c : columns){
         paintColumn(g, c);
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
         g.drawString(" Click or press SPACE", SIZE/2-SIZE/2, SIZE/2-SIZE/3);
         g.drawString(" to play!", SIZE/2-SIZE/2, SIZE/2-SIZE/5);
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
   public void checkScore(){
      for(Rectangle c : columns){
         if(c.y==0 && ((player.getX()+player.getW())/2) > (((c.x + c.width) / 2)-2) && ((player.getX()+player.getW())/2)<(((c.x + c.width)/2)+2)){
            ++score;
            //System.out.println(score);
         }
      }
   }//checkScore
   
   public void checkCollision(){
      
      
      for(Rectangle c : columns){
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
   public void mouseClicked(MouseEvent e) {
      jump();
   }

   public void jump() {
      if(gameOver){
         columns.clear();
         player = new Player(SIZE/2-10, SIZE/2-10, 20,20);
         player.setYv(0);
         addColumn(true);
         addColumn(true);
         addColumn(true);
         addColumn(true);
         score = 0;
         
      
         gameOver = false;
      }
      if(!gameStart){
         gameStart = true;      
      }
      else if(!gameOver){
         if(player.getYv()>0){
            player.setYv(0);
         }
         player.setYv(player.getYv()-10);
      }
   }
   public void mouseEntered(MouseEvent e) {
   
   }

   public void mouseExited(MouseEvent e) {
   
   }

   public void mousePressed(MouseEvent e) {
      
   }
   public void mouseReleased(MouseEvent e) {
   
   }
   public void keyPressed(KeyEvent e){ 
      int keyCode = e.getKeyCode();
      if(keyCode == KeyEvent.VK_SPACE ){
         jump();
      }  
   }
   public void keyReleased(KeyEvent e){
        
   }
   public void keyTyped(KeyEvent e){
   
   }   
   public static void main(String[] args){
      game = new Game();   
   }
}