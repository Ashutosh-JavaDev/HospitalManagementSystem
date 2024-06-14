import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;

public class Login extends JFrame implements ActionListener {
    JButton Login, Forget;
    JTextField loginfield;
    JPasswordField passwordfield;

    Login() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-jmeyer1220-668300.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 500, 400);
        add(image);
        JLabel title=new JLabel("Hospital Management");
        title.setBounds(150,70,250,30);
        title.setFont(new Font("Arial",Font.BOLD,18));
        add(title);
        JLabel username = new JLabel("UserName");
        username.setBounds(100,150, 100, 30);
        username.setFont(new Font("Raleway", Font.BOLD, 16));
        username.setForeground(Color.BLACK);
        add(username);
        JLabel password = new JLabel("Password");
        password.setBounds(100,200,100, 30);
        password.setForeground(Color.BLACK);
        password.setFont(new Font("Raleway", Font.BOLD, 18));
        add(password);
        loginfield=new JTextField();
        loginfield.setBounds(280,150,200,30);
        add(loginfield);
        passwordfield=new JPasswordField();
        passwordfield.setBounds(280,200,200,30);
        add(passwordfield);
        // Button
        Login=new JButton("Login");
        Login.setBounds(100,250,100,30);
        Login.setFont(new Font("Arial", Font.BOLD, 14));
        Login.setForeground(Color.white);
        Login.setBackground(Color.black);
        add(Login);
        Forget=new JButton("Forget Password");
        Forget.setBounds(280,250,200,30);
        Forget.setFont(new Font("Arial", Font.BOLD, 14));
        Forget.setForeground(Color.white);
        Forget.setBackground(Color.black);
        add(Forget);
        // Default
        setTitle("Hospital Management System");
        setLayout(null);
        setSize(500, 400);
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
