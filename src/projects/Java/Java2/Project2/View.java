/**   View.java   Controlls the GUI for Project 2 Palindrome tester
 *
 * @author Jake Barber
 * @version 10/17/16
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View extends javax.swing.JDialog {
   private javax.swing.JButton clear;
   private javax.swing.JTextArea input;
   private javax.swing.JLabel inputTxt;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JButton no;
   private javax.swing.JButton palindrome;
   private javax.swing.JButton yes;

   
   
   public View(java.awt.Frame parent, boolean modal) {
      super(parent, modal);
      initComponents();
      this.addWindowListener(
         new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
               System.exit(0);
            }
         });
      this.setVisible(true);
   }

   
   /*
   *  initComponets   Generated code for basic GUI outline from NetBeans
   */                             
   private void initComponents() {
   
      jScrollPane1 = new javax.swing.JScrollPane();
      input = new javax.swing.JTextArea();
      inputTxt = new javax.swing.JLabel();
      clear = new javax.swing.JButton();
      palindrome = new javax.swing.JButton();
      yes = new javax.swing.JButton();
      no = new javax.swing.JButton();
   
      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
   
      input.setColumns(20);
      input.setRows(5);
      jScrollPane1.setViewportView(input);
   
      inputTxt.setText("INPUT");
   
      clear.setText("CLEAR");
   
      palindrome.setText("PALINDROME?");
      palindrome.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               palindromeActionPerformed(evt);
            }
         });
      clear.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               clearActionPerformed(evt);
            }
         });
   
      yes.setText("YES");
   
      no.setText("NO");
   
      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(layout.createSequentialGroup()
                     .addGap(428, 428, 428)
                     .addComponent(palindrome))
                 .addGroup(layout.createSequentialGroup()
                     .addGap(85, 85, 85)
                     .addComponent(inputTxt)
                     .addGap(52, 52, 52)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                         .addGroup(layout.createSequentialGroup()
                             .addComponent(no)
                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(yes))
                         .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                     .addComponent(clear)))
             .addContainerGap(52, Short.MAX_VALUE))
         );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(layout.createSequentialGroup()
                     .addGap(103, 103, 103)
                     .addComponent(inputTxt))
                 .addGroup(layout.createSequentialGroup()
                     .addGap(63, 63, 63)
                     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGroup(layout.createSequentialGroup()
                     .addGap(98, 98, 98)
                     .addComponent(clear)))
             .addGap(184, 184, 184)
             .addComponent(palindrome)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(yes)
                 .addComponent(no))
             .addGap(86, 86, 86))
         );
   
      pack();
   }                      
   
   private void palindromeActionPerformed(java.awt.event.ActionEvent evt) {                                           
      //System.out.println("Button Push");
      
      Model m = new Model(input.getText());
      boolean palindrome = m.palindrome();
      this.clearButtons();
      
      if(palindrome){
         yes.setBackground(Color.GREEN);
      }
      else
         no.setBackground(Color.RED);
   }
   //resets buttons to null color
   private void clearButtons(){
      yes.setBackground(null);
      no.setBackground(null);
   }
   //clears text field and resets buton colors to null
   private void clearActionPerformed(java.awt.event.ActionEvent evt){
      //System.out.println("CLEAR");
      input.setText("");
      yes.setBackground(null);
      no.setBackground(null);
   
   }   
}
