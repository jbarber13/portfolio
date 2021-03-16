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
	private JButton findNameByNumberButton, findPhoneByNameButton, findEmailByNameButton, findDobByNameButton, addToFrontButton, addToBackButton, isEmptyButton, sizeOfButton, toStringButton, reverseToStringButton, reverseAddressListButton, exitButton;
	private JTextArea unimportantTextAreaOne, unimportantTextAreaTwo, unimportantTextAreaThree, unimportantTextAreaFour, unimportantTextAreaFive, unimportantTextAreaSix, unimportantTextAreaSeven, unimportantTextAreaEight, unimportantTextAreaNine, unimportantTextAreaTen, unimportantTextAreaEleven, unimportantTextAreaTwelve, unimportantTextAreaThirteen, unimportantTextAreaFourteen, unimportantTextAreaFifteen, unimportantTextAreaSixteen, unimportantTextAreaSeventeen, unimportantTextAreaEighteen, outputTextArea;
	private JScrollPane scrollPane;
	
	private boolean isEmpty;
	
	public ListGUI()
	{
		mainFrame = new JFrame("Address List");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setBounds(100, 100, 800, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainFrame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		searchTextField = new JTextField();
		searchTextField.setHorizontalAlignment(SwingConstants.CENTER);
		searchTextField.setBounds(17, 17, 239, 26);
		contentPane.add(searchTextField);
		searchTextField.setColumns(10);

		addressInputField = new JTextField();
		addressInputField.setBounds(566, 17, 89, 26);
		contentPane.add(addressInputField);
		addressInputField.setColumns(10);
		
		dobInputField = new JTextField();
		dobInputField.setBounds(667, 17, 89, 26);
		contentPane.add(dobInputField);
		dobInputField.setColumns(10);

		nameInputField = new JTextField();
		nameInputField.setBounds(278, 17, 89, 26);
		contentPane.add(nameInputField);
		nameInputField.setColumns(10);
		
		telephoneInputField = new JTextField();
		telephoneInputField.setBounds(371, 17, 89, 26);
		contentPane.add(telephoneInputField);
		telephoneInputField.setColumns(10);
		
		emailInputField = new JTextField();
		emailInputField.setBounds(465, 17, 89, 26);
		contentPane.add(emailInputField);
		emailInputField.setColumns(10);
		
		findNameByNumberButton = new JButton("Find Name");
		findNameByNumberButton.setBounds(17, 73, 100, 29);
		findNameByNumberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputTextArea.setText(addressList.nameByPhoneNumber(searchTextField.getText()));
			}
		});
		contentPane.add(findNameByNumberButton);
		
		findPhoneByNameButton = new JButton("Find Phone");
		findPhoneByNameButton.setBounds(156, 73, 100, 29);
		findPhoneByNameButton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				outputTextArea.setText(addressList.phoneNumberByName(searchTextField.getText()));
			}
		});
		contentPane.add(findPhoneByNameButton);

		findEmailByNameButton = new JButton("Find Email");
		findEmailByNameButton.setBounds(17, 138, 100, 29);
		findEmailByNameButton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				outputTextArea.setText(addressList.emailByName(searchTextField.getText()));
			}
		});
		contentPane.add(findEmailByNameButton);
		
		findDobByNameButton = new JButton("Find DOB");
		findDobByNameButton.setBounds(156, 138, 100, 29);
		findDobByNameButton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				outputTextArea.setText(addressList.dobByName(searchTextField.getText()));
			}
		});
		contentPane.add(findDobByNameButton);

		addToFrontButton = new JButton("Add To Front");
		addToFrontButton.setBounds(373, 73, 118, 29);
		addToFrontButton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
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
		addToBackButton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
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
		isEmptyButton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
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
		sizeOfButton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				outputTextArea.setText("There are " + addressList.sizeOf() + " addresses in this list");
			}
		});
		contentPane.add(sizeOfButton);
		
		toStringButton = new JButton("String");
		toStringButton.setBounds(373, 202, 118, 29);
		toStringButton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				outputTextArea.setText(addressList.toString());
			}
		});
		contentPane.add(toStringButton);
		
		reverseToStringButton = new JButton("Reverse String");
		reverseToStringButton.setBounds(537, 202, 118, 29);
		reverseToStringButton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				outputTextArea.setText(addressList.reverseToString());
			}
		});
		contentPane.add(reverseToStringButton);
		
		reverseAddressListButton = new JButton("Reverse List");
		reverseAddressListButton.setBounds(373, 263, 118, 29);
		reverseAddressListButton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				addressList.reverse();
			}
		});
		contentPane.add(reverseAddressListButton);
		
		exitButton = new JButton("Exit");
		exitButton.setBounds(537, 263, 118, 29);
		exitButton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(exitButton);
		
		unimportantTextAreaOne = new JTextArea();
		unimportantTextAreaOne.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaOne.setEditable(false);
		unimportantTextAreaOne.setLineWrap(true);
		unimportantTextAreaOne.setWrapStyleWord(true);
		unimportantTextAreaOne.setOpaque(false);
		unimportantTextAreaOne.setFocusable(false);
		unimportantTextAreaOne.setText("     Find name            by phone");
		unimportantTextAreaOne.setBounds(27, 100, 80, 26);
		contentPane.add(unimportantTextAreaOne);
		
		unimportantTextAreaTwo = new JTextArea();
		unimportantTextAreaTwo.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaTwo.setEditable(false);
		unimportantTextAreaTwo.setLineWrap(true);
		unimportantTextAreaTwo.setWrapStyleWord(true);
		unimportantTextAreaTwo.setOpaque(false);
		unimportantTextAreaTwo.setFocusable(false);
		unimportantTextAreaTwo.setText("     Find phone            by name");
		unimportantTextAreaTwo.setBounds(166, 100, 80, 26);
		contentPane.add(unimportantTextAreaTwo);
		
		unimportantTextAreaThree = new JTextArea();
		unimportantTextAreaThree.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaThree.setEditable(false);
		unimportantTextAreaThree.setLineWrap(true);
		unimportantTextAreaThree.setWrapStyleWord(true);
		unimportantTextAreaThree.setOpaque(false);
		unimportantTextAreaThree.setFocusable(false);
		unimportantTextAreaThree.setText("    Find email             by name");
		unimportantTextAreaThree.setBounds(27, 164, 80, 26);
		contentPane.add(unimportantTextAreaThree);
		
		unimportantTextAreaFour = new JTextArea();
		unimportantTextAreaFour.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaFour.setEditable(false);
		unimportantTextAreaFour.setLineWrap(true);
		unimportantTextAreaFour.setWrapStyleWord(true);
		unimportantTextAreaFour.setOpaque(false);
		unimportantTextAreaFour.setFocusable(false);
		unimportantTextAreaFour.setText("      Find DOB             by name");
		unimportantTextAreaFour.setBounds(166, 164, 80, 26);
		contentPane.add(unimportantTextAreaFour);
		
		unimportantTextAreaFive = new JTextArea();
		unimportantTextAreaFive.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaFive.setEditable(false);
		unimportantTextAreaFive.setLineWrap(true);
		unimportantTextAreaFive.setWrapStyleWord(true);
		unimportantTextAreaFive.setOpaque(false);
		unimportantTextAreaFive.setFocusable(false);
		unimportantTextAreaFive.setText("       Add address            to front of list");
		unimportantTextAreaFive.setBounds(383, 100, 100, 26);
		contentPane.add(unimportantTextAreaFive);
		
		unimportantTextAreaSix = new JTextArea();
		unimportantTextAreaSix.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaSix.setEditable(false);
		unimportantTextAreaSix.setLineWrap(true);
		unimportantTextAreaSix.setWrapStyleWord(true);
		unimportantTextAreaSix.setOpaque(false);
		unimportantTextAreaSix.setFocusable(false);
		unimportantTextAreaSix.setText("       Add address            to back of list");
		unimportantTextAreaSix.setBounds(547, 97, 100, 29);
		contentPane.add(unimportantTextAreaSix);
		
		unimportantTextAreaSeven = new JTextArea();
		unimportantTextAreaSeven.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaSeven.setEditable(false);
		unimportantTextAreaSeven.setLineWrap(true);
		unimportantTextAreaSeven.setWrapStyleWord(true);
		unimportantTextAreaSeven.setOpaque(false);
		unimportantTextAreaSeven.setFocusable(false);
		unimportantTextAreaSeven.setText("    Is address list                  empty");
		unimportantTextAreaSeven.setBounds(383, 164, 100, 26);
		contentPane.add(unimportantTextAreaSeven);
		
		unimportantTextAreaEight = new JTextArea();
		unimportantTextAreaEight.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaEight.setEditable(false);
		unimportantTextAreaEight.setLineWrap(true);
		unimportantTextAreaEight.setWrapStyleWord(true);
		unimportantTextAreaEight.setOpaque(false);
		unimportantTextAreaEight.setFocusable(false);
		unimportantTextAreaEight.setText("         Get size                     of array");
		unimportantTextAreaEight.setBounds(547, 164, 100, 26);
		contentPane.add(unimportantTextAreaEight);

		unimportantTextAreaNine = new JTextArea();
		unimportantTextAreaNine.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaNine.setEditable(false);
		unimportantTextAreaNine.setLineWrap(true);
		unimportantTextAreaNine.setWrapStyleWord(true);
		unimportantTextAreaNine.setOpaque(false);
		unimportantTextAreaNine.setFocusable(false);
		unimportantTextAreaNine.setText("          Returns                     address");
		unimportantTextAreaNine.setBounds(383, 225, 100, 26);
		contentPane.add(unimportantTextAreaNine);
		
		unimportantTextAreaTen = new JTextArea();
		unimportantTextAreaTen.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaTen.setEditable(false);
		unimportantTextAreaTen.setLineWrap(true);
		unimportantTextAreaTen.setWrapStyleWord(true);
		unimportantTextAreaTen.setOpaque(false);
		unimportantTextAreaTen.setFocusable(false);
		unimportantTextAreaTen.setText("           Reverse                    address");
		unimportantTextAreaTen.setBounds(547, 225, 100, 26);
		contentPane.add(unimportantTextAreaTen);
		
		unimportantTextAreaEleven = new JTextArea();
		unimportantTextAreaEleven.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaEleven.setEditable(false);
		unimportantTextAreaEleven.setLineWrap(true);
		unimportantTextAreaEleven.setWrapStyleWord(true);
		unimportantTextAreaEleven.setOpaque(false);
		unimportantTextAreaEleven.setFocusable(false);
		unimportantTextAreaEleven.setText("          Reverse                   addresses");
		unimportantTextAreaEleven.setBounds(383, 290, 100, 30);
		contentPane.add(unimportantTextAreaEleven);
		
		unimportantTextAreaTwelve = new JTextArea();
		unimportantTextAreaTwelve.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaTwelve.setEditable(false);
		unimportantTextAreaTwelve.setLineWrap(true);
		unimportantTextAreaTwelve.setWrapStyleWord(true);
		unimportantTextAreaTwelve.setOpaque(false);
		unimportantTextAreaTwelve.setFocusable(false);
		unimportantTextAreaTwelve.setText("              Exit");
		unimportantTextAreaTwelve.setBounds(547, 290, 100, 30);
		contentPane.add(unimportantTextAreaTwelve);
		
		unimportantTextAreaThirteen = new JTextArea();
		unimportantTextAreaThirteen.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaThirteen.setEditable(false);
		unimportantTextAreaThirteen.setLineWrap(true);
		unimportantTextAreaThirteen.setWrapStyleWord(true);
		unimportantTextAreaThirteen.setOpaque(false);
		unimportantTextAreaThirteen.setFocusable(false);
		unimportantTextAreaThirteen.setText("               Search by name or number");
		unimportantTextAreaThirteen.setBounds(27, 41, 219, 16);
		contentPane.add(unimportantTextAreaThirteen);
		
		unimportantTextAreaFourteen = new JTextArea();
		unimportantTextAreaFourteen.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaFourteen.setEditable(false);
		unimportantTextAreaFourteen.setLineWrap(true);
		unimportantTextAreaFourteen.setWrapStyleWord(true);
		unimportantTextAreaFourteen.setOpaque(false);
		unimportantTextAreaFourteen.setFocusable(false);
		unimportantTextAreaFourteen.setText("       Name");
		unimportantTextAreaFourteen.setBounds(288, 41, 71, 16);
		contentPane.add(unimportantTextAreaFourteen);
		
		unimportantTextAreaFifteen = new JTextArea();
		unimportantTextAreaFifteen.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaFifteen.setEditable(false);
		unimportantTextAreaFifteen.setLineWrap(true);
		unimportantTextAreaFifteen.setWrapStyleWord(true);
		unimportantTextAreaFifteen.setOpaque(false);
		unimportantTextAreaFifteen.setFocusable(false);
		unimportantTextAreaFifteen.setText("    Telephone");
		unimportantTextAreaFifteen.setBounds(381, 41, 71, 16);
		contentPane.add(unimportantTextAreaFifteen);
		
		unimportantTextAreaSixteen = new JTextArea();
		unimportantTextAreaSixteen.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaSixteen.setEditable(false);
		unimportantTextAreaSixteen.setLineWrap(true);
		unimportantTextAreaSixteen.setWrapStyleWord(true);
		unimportantTextAreaSixteen.setOpaque(false);
		unimportantTextAreaSixteen.setFocusable(false);
		unimportantTextAreaSixteen.setText("       Email");
		unimportantTextAreaSixteen.setBounds(475, 41, 71, 16);
		contentPane.add(unimportantTextAreaSixteen);
		
		unimportantTextAreaSeventeen = new JTextArea();
		unimportantTextAreaSeventeen.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaSeventeen.setEditable(false);
		unimportantTextAreaSeventeen.setLineWrap(true);
		unimportantTextAreaSeventeen.setWrapStyleWord(true);
		unimportantTextAreaSeventeen.setOpaque(false);
		unimportantTextAreaSeventeen.setFocusable(false);
		unimportantTextAreaSeventeen.setText("     Address");
		unimportantTextAreaSeventeen.setBounds(576, 41, 71, 16);
		contentPane.add(unimportantTextAreaSeventeen);
		
		unimportantTextAreaEighteen = new JTextArea();
		unimportantTextAreaEighteen.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		unimportantTextAreaEighteen.setEditable(false);
		unimportantTextAreaEighteen.setLineWrap(true);
		unimportantTextAreaEighteen.setWrapStyleWord(true);
		unimportantTextAreaEighteen.setOpaque(false);
		unimportantTextAreaEighteen.setFocusable(false);
		unimportantTextAreaEighteen.setText(" Date of birth");
		unimportantTextAreaEighteen.setBounds(677, 41, 71, 16);
		contentPane.add(unimportantTextAreaEighteen);
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
