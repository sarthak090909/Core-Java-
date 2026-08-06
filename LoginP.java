import java.awt.*;
import javax.swing.*;
class LoginP
{
	public static void main(String args[])
	{
		JFrame f1=new JFrame();
		f1.setVisible(true);
		f1.setSize(700,600);
		f1.setTitle("Welcome to Login Page");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close the web page when user click on close button
		JLabel l1=new JLabel("Login");
		JLabel l2=new JLabel("Username");
		JLabel l3=new JLabel("Password");
		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JButton b1=new JButton("Sign in");
		JButton b2=new JButton("Clear");
		f1.setLayout(null);
		
		l1.setBounds(300,80,100,30);
		l2.setBounds(100,80,100,30);
		l3.setBounds(30)
		
	}
}