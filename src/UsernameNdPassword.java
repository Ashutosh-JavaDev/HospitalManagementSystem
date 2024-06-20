import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UsernameNdPassword extends JFrame implements ActionListener {
    JLabel username, password;
    JButton save, back;
    JTextField usernamefield;
    JPasswordField passwordfield;

    public UsernameNdPassword() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
        // Username
        username = new JLabel("UserName:");
        username.setBounds(25, 200, 100, 30);
        username.setForeground(Color.black);
        username.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(username);
        // username Textfield
        usernamefield = new JTextField();
        usernamefield.setBounds(150, 200, 100, 30);
        image.add(usernamefield);
        // Password
        password = new JLabel("Password:");
        password.setBounds(25, 250, 100, 30);
        password.setForeground(Color.black);
        password.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(password);
        // password Textfield
        passwordfield = new JPasswordField();
        passwordfield.setBounds(150, 250, 100, 30);
        image.add(passwordfield);
        // Button
        save=new JButton("Save");
        save.setBackground(Color.black);
        save.setForeground(Color.white);
        save.setBounds(25,320,100,30);
        save.setFont(new Font("Raleway", Font.BOLD, 20));
        image.add(save);
        save.addActionListener(this);
        // Back
        back=new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(450,320,100,30);
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        image.add(back);
        back.addActionListener(this);
        // Default
        setLayout(null);
        setSize(800, 600);
        setLocation(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==back){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new UsernameNdPassword();
    }
}
