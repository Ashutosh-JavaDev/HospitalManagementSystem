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
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-jmeyer1220-668300.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1000, 800);
        add(image);
        JLabel username = new JLabel("UserName");
        username.setBounds(300, 300, 100, 30);
        username.setFont(new Font("Arial", Font.BOLD, 18));
        add(username);
        JPasswordField password = new JPasswordField("Password");
        password.setBounds(300, 350, 100, 30);
        password.setFont(new Font("Arial", Font.BOLD, 18));
        add(password);
        loginfield=new JTextField();
        loginfield.setBounds(500,300,150,30);
        add(loginfield);
        passwordfield=new JTextField();
        passwordfield.setBounds(500,350,150,30);
        add(passwordfield);
        // Button
        Login=new JButton("Login");
        Login.setBounds(300,410,100,30);
        Login.setFont(new Font("Arial", Font.BOLD, 14));
        Login.setBackground(Color.black);
        add(Login);
        Forget=new JButton("Forget Password");
        Forget.setBounds(500,410,200,30);
        Forget.setFont(new Font("Arial", Font.BOLD, 14));
        Forget.setBackground(Color.black);
        add(Forget);
        // Default
        setTitle("Hospital Management System");
        setLayout(null);
        setSize(1000, 800);
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
