import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UsernameNdPassword extends JFrame implements ActionListener {
    JLabel username, password;
    JButton save,back;
    JTextField usernamefield;
    JPasswordField passwordfield;

    public UsernameNdPassword() {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);
        // Username
        username=new JLabel("UserName:");
        username.setBounds(25,200,100,30);
        username.setForeground(Color.black);
        username.setFont(new Font("Arial",Font.BOLD,20));
        image.add(username);
        // username Textfield
        usernamefield=new JTextField();
        usernamefield.setBounds(25,200,150,30);
        image.add(usernamefield);
        // Default
        setLayout(null);
        setSize(800,600);
        setLocation(250,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new UsernameNdPassword();
    }
}
