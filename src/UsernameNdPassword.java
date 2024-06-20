import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UsernameNdPassword extends JFrame implements ActionListener {
    JLabel username, password;
    JButton save;
    JTextField usernamefield;
    JPasswordField passwordfield;

    public UsernameNdPassword() {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new UsernameNdPassword();
    }
}
