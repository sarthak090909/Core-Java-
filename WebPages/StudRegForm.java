import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class StudRegForm extends JFrame implements ActionListener
{
	JLabel nameLabel, emailLabel, passwordLabel, genderLabel;
	JLabel courseLabel, skillLabel, addressLabel;
	
	JTextField nameField, emailField;
	JPasswordField passwordField;
	
	JRadioButton maleButton, femaleButton, otherButton;
	
	JComboBox<String> courseBox;
	
	JCheckBox javaBox, pythonBox, cppBox, sqlBox;
	
	JTextArea adressArea;
	
	JButton registerationButton, resetButton ;
	
	ButtonGroup genderGroup;
	
	StudRegForm()
	{
		// Frame
		setTitle("Student Registeration");
		setSize(600, 650);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Name
		nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(50, 40, 100, 30);
		add(nameLabel);
		
		nameField = new JTextField();
		nameField.setBounds(170, 40, 300, 30);
		add(nameField);
		
		//Email
		emailLabel = new JLabel("Email");
		emailLabel.setBounds(50, 90, 100, 30);
		add(emailLabel);
		
		emailField = new JTextField();
		emailField.setBounds(170, 90, 300, 30);
		add(emailField);
		
		//password
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(50, 140, 100, 30);
		add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(170, 140, 300, 30);
		add(passwordField);
		
		//gender
			genderLabel = new JLabel("Gender: ");
			genderLabel.setBounds(50, 190, 100, 30);
			add(genderLabel);
			
			maleButton = new JRadioButton("Male");
			maleButton.setBounds(170, 190, 70, 30);
			add(maleButton);
			
			femaleButton = new JRadioButton("Female");
			femaleButton.setBounds(250, 190, 80, 30);
			add(femaleButton);
			
			otherButton = new JRadioButton("Radio");
			otherButton.setBounds(340, 190, 80, 30);
			add(otherButton);
			
			//Button Group
			genderGroup = new ButtonGroup();
			genderGroup.add(maleButton);
			genderGroup.add(femaleButton);
			genderGroup.add(otherButton);
		
			// Course 
			courseLabel = new JLabel("Course");
			courseLabel.setBounds(50, 240, 100, 30);
			add(courseLabel);
			
			String[] courses=
			{
				"BSC Computer Science",
				"BCA",
				"B Tech",
				"MBA",
				"M Tech"
			};
			
			
			courseBox = new JComboBox<>(courses);
			courseBox.setBounds(170, 240, 300, 30);
			add(courseBox);
			
			// Skills
			skillLabel = new JLabel("skills");
			skillLabel.setBounds(50, 290, 100, 30);
			add(skillLabel);
			
			javaBox = new JCheckBox("Java");
			javaBox.setBounds(170, 290, 70, 30);
			add(javaBox);
			
			pythonBox = new JCheckBox("Python");
			pythonBox.setBounds(240, 290, 80, 30);
			add(pythonBox);
			
			cppBox = new JCheckBox("cpp");
			cppBox.setBounds(320, 290, 70, 30);
			add(cppBox);
			
			sqlBox = new JCheckBox("SQL");
			sqlBox.setBounds(390 ,290, 70, 30);
			add(sqlBox);
			
			//Adress
			addressLabel= new JLabel("Address:");
			addressLabel.setBounds(50 , 340, 100, 30);
			add(addressLabel);
			
			adressArea = new JTextArea();
			adressArea.setBounds(170, 340, 300, 80);
			add(adressArea);
			
			// registerButton
			registerationButton = new JButton("Register");
			registerationButton.setBounds(170, 460, 120, 40);
			registerationButton.addActionListener(this);
			add(registerationButton);
			
			// Reset Button
			resetButton = new JButton("Reset");
			resetButton.setBounds(320, 460, 120, 40);
			resetButton.addActionListener(this);
			add(resetButton);
			
			// Make frame visible
			setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// Register Button 
		if(e.getSource() ==  registerationButton)
		{
			String name = nameField.getText();
			String email = emailField.getText();
			String password =new  String(passwordField.getPassword());
			
			//Validation
			
			if(name.isEmpty() || email.isEmpty() || password.isEmpty())
			{
				JOptionPane.showMessageDialog(
				this,
				"Pleasse fill all required fields.",
				"Error",
				JOptionPane.ERROR_MESSAGE
				);
				return;
			}
			//Gender 
			String gender = "";
			if(maleButton.isSelected())
			{
				gender = "Male";
			}
			else if(femaleButton.isSelected())
			{
				gender = "Female";
			}
			else if(otherButton.isSelected())
			{
				gender = "Other";
			}
			
			// Courses
			String course = (String) courseBox.getSelectedItem();
			
			//Skills
			String skills = "";
			
			if(javaBox.isSelected())
			{
				skills += "Java, ";
			}
			if(pythonBox.isSelected())
			{
				skills += "Python, ";
			}
			if(cppBox.isSelected())
			{
				skills += "CPP";
			}
			if(sqlBox.isSelected())
			{
				skills += "SQL";
			}
			if(skills.isEmpty())
			{
				skills = "No skills selected";
			}
			else
			{
				skills = skills.substring(0, skills.length() - 2);
			}
			// Adress
			String adress = adressArea.getText();
			
			//Display result
			String message = 
						"Reisteration Successfully! \n\n" + 
						"Name: " + name + "\n" + 
						"Email" + email + "\n" + 
						"Gender" + gender + "\n" +
						"Course" + course + "\n" +
						"Skills" + skills + "\n" +
						"Adress" + adress;
						
						JOptionPane.showMessageDialog
						(
						this, 
						message,
						"Registeration Details",
						JOptionPane.INFORMATION_MESSAGE
						);
		}
		
		//Reset Button
		if(e.getSource() == resetButton)
		{
			nameField.setText("");
			emailField.setText("");
			passwordField.setText("");
			
			genderGroup.clearSelection();
			
			courseBox.setSelectedIndex(0);
			
			javaBox.setSelected(false);
			pythonBox.setSelected(false);
			cppBox.setSelected(false);
			sqlBox.setSelected(false);
			
			adressArea.setText("");
		}
	}
	
	
	public static void main(String args[])
	{
		new StudRegForm();
	}
	
}