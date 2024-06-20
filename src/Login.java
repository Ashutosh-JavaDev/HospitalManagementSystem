import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.Color;
import java.sql.ResultSet;
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
        JLabel title = new JLabel("Hospital Management");
        title.setBounds(150,40, 250, 30);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(title);
        JLabel username = new JLabel("UserName");
        username.setBounds(100, 250, 100, 30);
        username.setFont(new Font("Raleway", Font.BOLD, 16));
        username.setForeground(Color.white);
        image.add(username);
        JLabel password = new JLabel("Password");
        password.setBounds(100, 300, 100, 30);
        password.setForeground(Color.white);
        password.setFont(new Font("Raleway", Font.BOLD, 18));
        image.add(password);
        loginfield = new JTextField();
        loginfield.setBounds(280, 250, 200, 30);
        image.add(loginfield);
        passwordfield = new JPasswordField();
        passwordfield.setBounds(280, 300, 200, 30);
        image.add(passwordfield);
        // Button
        Login = new JButton("Login");
        Login.setBounds(100, 350, 100, 30);
        Login.setFont(new Font("Arial", Font.BOLD, 14));
        Login.setForeground(Color.white);
        Login.setBackground(Color.black);
        image.add(Login);
        Forget = new JButton("Forget Password");
        Forget.setBounds(280, 350, 200, 30);
        Forget.setFont(new Font("Arial", Font.BOLD, 14));
        Forget.setForeground(Color.white);
        Forget.setBackground(Color.black);
        image.add(Forget);
        // Default
        setTitle("Hospital Management System");
        setLayout(null);
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(400, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==Login){
            String user=loginfield.getText();
            String password=passwordfield.getText();
            try{

                HospitalManagementSystem conn=new HospitalManagementSystem();
                String query="Select*from UsernamePassword where Username ='"+user+"' and Password ='"+password+"'";
                ResultSet res=conn.state.executeQuery(query);
                while(res.next()){

                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new Login();
    }
}
