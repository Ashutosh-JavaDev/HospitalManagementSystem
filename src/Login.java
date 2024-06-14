import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
public class Login extends JFrame implements ActionListener {
    JButton Login, Forget;
    JTextField loginfield, passwordfield;

    Login() {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/pexels-jmeyer1220-668300.jpg"));
        Image i2=i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 1000, 700);
        add(image);
        JLabel username=new JLabel("UserName");
        username.setBounds(400, 300,100,30);
        username.setFont(new Font("Arial",Font.BOLD,18));
        add(username);
        // Default
        setTitle("Hospital Management System");
        setLayout(null);
        setSize(1000,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(400, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) throws Exception {
        new Login();
    }
}
