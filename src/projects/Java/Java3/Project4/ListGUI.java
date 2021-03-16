import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListGUI
{	
   private AddressList addressList = new AddressList();
   private JFrame mainFrame;
   private JPanel contentPane;
   private JTextField searchTextField, addressInputField, dobInputField, nameInputField, telephoneInputField, emailInputField;
   private JButton findNameByNumberButton, findPhoneByNameButton, findEmailByNameButton, findDobByNameButton, addToFrontButton, addToBackButton, isEmptyButton, sizeOfButton, toStringButton, reverseToStringButton, reverseAddressListButton;
   private JTextArea TA_1, TA_2, TA_3, TA_4, TA_5, TA_6, TA_7, TA_8, TA_9, outputTextArea;
   private JScrollPane scrollPane;
	
   private boolean isEmpty;
	
   public ListGUI()
   {
      mainFrame = new JFrame("Address List");
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mainFrame.setBounds(100, 100, 800, 450);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      mainFrame.setContentPane(contentPane);
      contentPane.setLayout(null);
   	
      searchTextField = new JTextField();
      searchTextField.setHorizontalAlignment(SwingConstants.CENTER);
      searchTextField.setBounds(17, 17, 239, 30);
      contentPane.add(searchTextField);
      searchTextField.setColumns(10);
   
      addressInputField = new JTextField();
      addressInputField.setBounds(566, 17, 90, 30);
      contentPane.add(addressInputField);
      addressInputField.setColumns(10);
   	
      dobInputField = new JTextField();
      dobInputField.setBounds(667, 17, 90, 30);
      contentPane.add(dobInputField);
      dobInputField.setColumns(10);
   
      nameInputField = new JTextField();
      nameInputField.setBounds(278, 17, 90, 30);
      contentPane.add(nameInputField);
      nameInputField.setColumns(10);
   	
      telephoneInputField = new JTextField();
      telephoneInputField.setBounds(371, 17, 90, 30);
      contentPane.add(telephoneInputField);
      telephoneInputField.setColumns(10);
   	
      emailInputField = new JTextField();
      emailInputField.setBounds(465, 17, 90, 30);
      contentPane.add(emailInputField);
      emailInputField.setColumns(10);
   	
      findNameByNumberButton = new JButton("Find Name");
      findNameByNumberButton.setBounds(17, 73, 100, 29);
      findNameByNumberButton.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               addressList.reset();
               outputTextArea.setText(addressList.nameByPhoneNumber(searchTextField.getText()));
            }
         });
      contentPane.add(findNameByNumberButton);
   	
      findPhoneByNameButton = new JButton("Find Phone");
      findPhoneByNameButton.setBounds(156, 73, 100, 29);
      findPhoneByNameButton.addActionListener(
         new ActionListener () {
            public void actionPerformed(ActionEvent e) {
               addressList.reset();
               outputTextArea.setText(addressList.phoneNumberByName(searchTextField.getText()));
            }
         });
      contentPane.add(findPhoneByNameButton);
   
      findEmailByNameButton = new JButton("Find Email");
      findEmailByNameButton.setBounds(17, 138, 100, 29);
      findEmailByNameButton.addActionListener(
         new ActionListener () {
            public void actionPerformed(ActionEvent e) {
               addressList.reset();
               outputTextArea.setText(addressList.emailByName(searchTextField.getText()));
            }
         });
      contentPane.add(findEmailByNameButton);
   	
      findDobByNameButton = new JButton("Find DOB");
      findDobByNameButton.setBounds(156, 138, 100, 29);
      findDobByNameButton.addActionListener(
         new ActionListener () {
            public void actionPerformed(ActionEvent e) {
               addressList.reset();
               outputTextArea.setText(addressList.dobByName(searchTextField.getText()));
            }
         });
      contentPane.add(findDobByNameButton);
   
      addToFrontButton = new JButton("Add To Front");
      addToFrontButton.setBounds(373, 73, 118, 29);
      addToFrontButton.addActionListener(
         new ActionListener () {
            public void actionPerformed(ActionEvent e) {
               addressList.reset();
               addressList.addToFront(nameInputField.getText(), telephoneInputField.getText(), emailInputField.getText(), addressInputField.getText(), dobInputField.getText());
               nameInputField.setText("");
               telephoneInputField.setText("");
               emailInputField.setText("");
               addressInputField.setText("");
               dobInputField.setText("");
            }
         });
      contentPane.add(addToFrontButton);
   	
      addToBackButton = new JButton("Add To Back");
      addToBackButton.setBounds(537, 73, 118, 29);
      addToBackButton.addActionListener(
         new ActionListener () {
            public void actionPerformed(ActionEvent e) {
               addressList.reset();
               addressList.addToBack(nameInputField.getText(), telephoneInputField.getText(), emailInputField.getText(), addressInputField.getText(), dobInputField.getText());
               nameInputField.setText("");
               telephoneInputField.setText("");
               emailInputField.setText("");
               addressInputField.setText("");
               dobInputField.setText("");
            }
         });
      contentPane.add(addToBackButton);
   	
      isEmptyButton = new JButton("Empty?");
      isEmptyButton.setBounds(373, 138, 118, 29);
      isEmptyButton.addActionListener(
         new ActionListener () {
            public void actionPerformed(ActionEvent e) {
               addressList.reset();
               isEmpty = addressList.isEmpty();
               if (isEmpty == false)
               {
                  outputTextArea.setText("List is not empty");
               }
               else if (isEmpty == true)
               {
                  outputTextArea.setText("List is empty");
               }
            }
         });
      contentPane.add(isEmptyButton);
   	
      sizeOfButton = new JButton("Size");
      sizeOfButton.setBounds(537, 138, 118, 29);
      sizeOfButton.addActionListener(
         new ActionListener () {
            public void actionPerformed(ActionEvent e) {
               addressList.reset();
               outputTextArea.setText("There are " + addressList.sizeOf() + " addresses in this list");
            }
         });
      contentPane.add(sizeOfButton);
   	
      toStringButton = new JButton("String");
      toStringButton.setBounds(373, 202, 118, 29);
      toStringButton.addActionListener(
         new ActionListener () {
            public void actionPerformed(ActionEvent e) {
               addressList.reset();
               outputTextArea.setText(addressList.toString());
            }
         });
      contentPane.add(toStringButton);
   	
      reverseToStringButton = new JButton("Reverse String");
      reverseToStringButton.setBounds(537, 202, 118, 29);
      reverseToStringButton.addActionListener(
         new ActionListener () {
            public void actionPerformed(ActionEvent e) {
               addressList.reset();
               outputTextArea.setText(addressList.reverseToString());
            }
         });
      contentPane.add(reverseToStringButton);
   	
      reverseAddressListButton = new JButton("Reverse List");
      reverseAddressListButton.setBounds(373, 263, 118, 29);
      reverseAddressListButton.addActionListener(
         new ActionListener () {
            public void actionPerformed(ActionEvent e) {
               addressList.reset();
               addressList.reverse();
            }
         });
      contentPane.add(reverseAddressListButton);
   	
     
   	
      TA_1 = new JTextArea();
      TA_1.setFont(new Font("Ariel", Font.PLAIN, 10));
      TA_1.setEditable(false);
      TA_1.setLineWrap(true);
      TA_1.setWrapStyleWord(true);
      TA_1.setOpaque(false);
      TA_1.setFocusable(false);
      TA_1.setText("     Find name            by phone");
      TA_1.setBounds(27, 100, 80, 26);
      contentPane.add(TA_1);
   	
      TA_2 = new JTextArea();
      TA_2.setFont(new Font("Ariel", Font.PLAIN, 10));
      TA_2.setEditable(false);
      TA_2.setLineWrap(true);
      TA_2.setWrapStyleWord(true);
      TA_2.setOpaque(false);
      TA_2.setFocusable(false);
      TA_2.setText("     Find phone            by name");
      TA_2.setBounds(166, 100, 80, 26);
      contentPane.add(TA_2);
   	
      TA_3 = new JTextArea();
      TA_3.setFont(new Font("Ariel", Font.PLAIN, 10));
      TA_3.setEditable(false);
      TA_3.setLineWrap(true);
      TA_3.setWrapStyleWord(true);
      TA_3.setOpaque(false);
      TA_3.setFocusable(false);
      TA_3.setText("    Find email             by name");
      TA_3.setBounds(27, 164, 80, 26);
      contentPane.add(TA_3);
   	
      TA_4 = new JTextArea();
      TA_4.setFont(new Font("Ariel", Font.PLAIN, 10));
      TA_4.setEditable(false);
      TA_4.setLineWrap(true);
      TA_4.setWrapStyleWord(true);
      TA_4.setOpaque(false);
      TA_4.setFocusable(false);
      TA_4.setText("      Find DOB             by name");
      TA_4.setBounds(166, 164, 80, 26);
      contentPane.add(TA_4);
   	   	
      TA_5 = new JTextArea();
      TA_5.setFont(new Font("Ariel", Font.PLAIN, 10));
      TA_5.setEditable(false);
      TA_5.setLineWrap(true);
      TA_5.setWrapStyleWord(true);
      TA_5.setOpaque(false);
      TA_5.setFocusable(false);
      TA_5.setText("               Search by name or number");
      TA_5.setBounds(27, 41, 219, 16);
      contentPane.add(TA_5);
   	
      TA_6 = new JTextArea();
      TA_6.setFont(new Font("Ariel", Font.PLAIN, 10));
      TA_6.setEditable(false);
      TA_6.setLineWrap(true);
      TA_6.setWrapStyleWord(true);
      TA_6.setOpaque(false);
      TA_6.setFocusable(false);
      TA_6.setText("       Name");
      TA_6.setBounds(288, 41, 71, 16);
      contentPane.add(TA_6);
   	
      TA_7 = new JTextArea();
      TA_7.setFont(new Font("Ariel", Font.PLAIN, 10));
      TA_7.setEditable(false);
      TA_7.setLineWrap(true);
      TA_7.setWrapStyleWord(true);
      TA_7.setOpaque(false);
      TA_7.setFocusable(false);
      TA_7.setText("    Telephone");
      TA_7.setBounds(381, 41, 71, 16);
      contentPane.add(TA_7);
   	
      TA_7 = new JTextArea();
      TA_7.setFont(new Font("Ariel", Font.PLAIN, 10));
      TA_7.setEditable(false);
      TA_7.setLineWrap(true);
      TA_7.setWrapStyleWord(true);
      TA_7.setOpaque(false);
      TA_7.setFocusable(false);
      TA_7.setText("       Email");
      TA_7.setBounds(475, 41, 71, 16);
      contentPane.add(TA_7);
   	
      TA_8 = new JTextArea();
      TA_8.setFont(new Font("Ariel", Font.PLAIN, 10));
      TA_8.setEditable(false);
      TA_8.setLineWrap(true);
      TA_8.setWrapStyleWord(true);
      TA_8.setOpaque(false);
      TA_8.setFocusable(false);
      TA_8.setText("     Address");
      TA_8.setBounds(576, 41, 71, 16);
      contentPane.add(TA_8);
   	
      TA_9 = new JTextArea();
      TA_9.setFont(new Font("Ariel", Font.PLAIN, 10));
      TA_9.setEditable(false);
      TA_9.setLineWrap(true);
      TA_9.setWrapStyleWord(true);
      TA_9.setOpaque(false);
      TA_9.setFocusable(false);
      TA_9.setText(" Date of birth");
      TA_9.setBounds(677, 41, 71, 16);
      contentPane.add(TA_9);
      scrollPane = new JScrollPane();
      scrollPane.setBounds(17, 202, 239, 118);
      scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      contentPane.add(scrollPane);
   	
      outputTextArea = new JTextArea();
      outputTextArea.setEditable(false);
      scrollPane.setViewportView(outputTextArea);
   	
      mainFrame.setVisible(true);
   }
	
}
