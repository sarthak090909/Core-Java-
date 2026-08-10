import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LoginPage extends JFrame {

    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    JButton b1, b2, b3;

    LoginPage() {
    }

    LoginPage(String s1) {
        super(s1);
    }

    void setComponents() {

        l1 = new JLabel("LOGIN");
        l2 = new JLabel("Username");
        l3 = new JLabel("Password");
        l4 = new JLabel();

        t1 = new JTextField();
        t2 = new JTextField();

        b1 = new JButton("Click here");
        b2 = new JButton("Clear");
        b3 = new JButton("Add");

        // Position and size
        l1.setBounds(300, 80, 150, 30);
        l2.setBounds(200, 175, 100, 30);
        l3.setBounds(200, 275, 100, 30);
        l4.setBounds(200, 550, 160, 30);

        t1.setBounds(400, 175, 150, 30);
        t2.setBounds(400, 275, 150, 30);

        b1.setBounds(200, 450, 100, 30);
        b2.setBounds(350, 450, 100, 30);
        b3.setBounds(500, 450, 100, 30);

        // Fonts
        Font f1 = new Font("Arial", Font.BOLD, 16);
        Font f2 = new Font("Times New Roman", Font.BOLD, 20);

        // Cursors
        Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
        Cursor c2 = new Cursor(Cursor.CROSSHAIR_CURSOR);
        Cursor c3 = new Cursor(Cursor.TEXT_CURSOR);

        b1.setCursor(c1);
        b2.setCursor(c2);
        b3.setCursor(c3);

        // Colors
        b1.setForeground(Color.ORANGE);
        b1.setBackground(Color.BLACK);

        // Fonts for components
        l1.setFont(f2);
        l2.setFont(f1);
        l3.setFont(f1);

        t1.setFont(f1);
        t2.setFont(f1);

        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);

        // Add components to JFrame
        add(l1);
        add(l2);
        add(l3);
        add(l4);

        add(t1);
        add(t2);

        add(b1);
        add(b2);
        add(b3);

        // Action listeners
        b1.addActionListener(new Button1());
        b2.addActionListener(new Button2());

        // Mouse listener
        b3.addMouseListener(new Button3());

        // Use no layout manager because we are using setBounds()
        setLayout(null);
    }

    public static void main(String args[]) {

        LoginPage p1 = new LoginPage("Welcome to the Login Page");

        p1.setSize(800, 650);
        p1.setLayout(null);

        p1.setComponents();

        p1.setVisible(true);
        p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Button 1 - Login
    class Button1 implements ActionListener {

        public void actionPerformed(ActionEvent e1) {

            String w1 = t1.getText();
            String w2 = t2.getText();

            if (w1.equals("admin") && w2.equals("12345")) {

                String pass = JOptionPane.showInputDialog(
                        "2 Factor Password"
                );

                if ("11111".equals(pass)) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Login Successful"
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            null,
                            "Wrong 2 Factor Password"
                    );
                }

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "Login Unsuccessful"
                );
            }
        }
    }

    // Button 2 - Clear
    class Button2 implements ActionListener {

        public void actionPerformed(ActionEvent e1) {

            t1.setText("");
            t2.setText("");
            l4.setText("");
        }
    }

    // Button 3 - Mouse events
    class Button3 implements MouseListener {

        public void mouseExited(MouseEvent m1) {

            l1.setForeground(Color.BLACK);
        }

        public void mouseEntered(MouseEvent m2) {

            l1.setForeground(Color.GREEN);
        }

        public void mouseReleased(MouseEvent m3) {

            l1.setText("LOGIN");
        }

        public void mousePressed(MouseEvent m4) {

            l1.setForeground(Color.MAGENTA);
        }

        public void mouseClicked(MouseEvent m5) {

        }
    }
}