/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author jabot_000
 */
import java.awt.*;

public class JFrame extends javax.swing.JFrame {
   Lab2 srv = new Lab2();
   //Jframe frame = new Jframe("test");
   

   /**
    * Creates new form JFrame
    */
   public JFrame() {
      initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {
   
      Input = new javax.swing.JTextField();
      b1 = new javax.swing.JButton();
      b2 = new javax.swing.JButton();
      b3 = new javax.swing.JButton();
      b4 = new javax.swing.JButton();
      b5 = new javax.swing.JButton();
      goButton = new javax.swing.JButton();
   
      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
   
      Input.setText("11111");
      Input.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               InputActionPerformed(evt);
            }
         });
   
      b1.setText("Button 1");
      //b1.setBackground(Color.black);
      b1.setOpaque(true);
      
   
      b2.setText("Button 2");
      //b1.setBackground
      b2.setOpaque(true);
   
      b3.setText("Button 3");
      b3.setOpaque(true);
   
      b4.setText("Button 4");
      b4.setOpaque(true);
   
      b5.setText("Button 5");
      b5.setOpaque(true);
   
   
      goButton.setText("-----GO-----");
      goButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               goButtonActionPerformed(evt);
            }
         });
   
      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
             .addContainerGap()
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(Input, javax.swing.GroupLayout.Alignment.TRAILING)
                 .addGroup(layout.createSequentialGroup()
                     .addComponent(b1)
                     .addGap(133, 133, 133)
                     .addComponent(b2)
                     .addGap(172, 172, 172)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                             .addComponent(goButton)
                             .addGap(0, 0, Short.MAX_VALUE))
                         .addGroup(layout.createSequentialGroup()
                             .addComponent(b3)
                             .addGap(155, 155, 155)
                             .addComponent(b4)
                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                             .addComponent(b5)))))
             .addContainerGap())
         );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
             .addGap(60, 60, 60)
             .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addGap(85, 85, 85)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(b1)
                 .addComponent(b2)
                 .addComponent(b3)
                 .addComponent(b4)
                 .addComponent(b5))
             .addGap(285, 285, 285)
             .addComponent(goButton)
             .addContainerGap(368, Short.MAX_VALUE))
         );
   
      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_InputActionPerformed

   private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
       //srv.read(Input.getText());
      String nums = Input.getText();
      System.out.println(nums);
      this.setColor(nums);
       
   }//GEN-LAST:event_goButtonActionPerformed
   private void setColor(String nums){
      System.out.println("SET COLOR");
      
      if(nums.charAt(0)=='1')
         b1.setBackground(Color.blue);
      else if(nums.charAt(0)=='2')
         b1.setBackground(Color.red);
      else if(nums.charAt(0)=='3')
         b1.setBackground(Color.yellow);
      else if(nums.charAt(0)=='4')
         b1.setBackground(Color.cyan);
      else if(nums.charAt(0)=='5')
         b1.setBackground(Color.green);
         
      if(nums.charAt(1)=='1')
         b2.setBackground(Color.blue);
      else if(nums.charAt(1)=='2')
         b2.setBackground(Color.red);
      else if(nums.charAt(1)=='3')
         b2.setBackground(Color.yellow);
      else if(nums.charAt(1)=='4')
         b2.setBackground(Color.cyan);
      else if(nums.charAt(1)=='5')
         b2.setBackground(Color.green);
         
      if(nums.charAt(2)=='1')
         b3.setBackground(Color.blue);
      else if(nums.charAt(2)=='2')
         b3.setBackground(Color.red);
      else if(nums.charAt(2)=='3')
         b3.setBackground(Color.yellow);
      else if(nums.charAt(2)=='4')
         b3.setBackground(Color.cyan);
      else if(nums.charAt(2)=='5')
         b3.setBackground(Color.green);
         
      if(nums.charAt(3)=='1')
         b4.setBackground(Color.blue);
      else if(nums.charAt(3)=='2')
         b4.setBackground(Color.red);
      else if(nums.charAt(3)=='3')
         b4.setBackground(Color.yellow);
      else if(nums.charAt(3)=='4')
         b4.setBackground(Color.cyan);
      else if(nums.charAt(3)=='5')
         b4.setBackground(Color.green);
         
      if(nums.charAt(4)=='1')
         b5.setBackground(Color.blue);
      else if(nums.charAt(4)=='2')
         b5.setBackground(Color.red);
      else if(nums.charAt(4)=='3')
         b5.setBackground(Color.yellow);
      else if(nums.charAt(4)=='4')
         b5.setBackground(Color.cyan);
      else if(nums.charAt(4)=='5')
         b5.setBackground(Color.green);
   
   
   }

   
   

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTextField Input;
   private javax.swing.JButton goButton;
   private javax.swing.JButton b1;
   private javax.swing.JButton b2;
   private javax.swing.JButton b3;
   private javax.swing.JButton b4;
   private javax.swing.JButton b5;
   // End of variables declaration//GEN-END:variables
}
