import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.Color;

public class Login extends JFrame implements ActionListener {
    JButton Login, Forget;
    JTextField loginfield, passwordfield;

    Login() {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/pexels-jmeyer1220-668300.jpg"));
        // Default
        setTitle("Hospital Management System");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) throws Exception {
        new Login();
    }
}
