import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class ForgetPassword extends JFrame implements ActionListener {
    JLabel newpin, phonenumber, email, username;
    JTextField newpinfield, phonenumberfield, emailfield, usernamefield;
    JButton confirm, back;

    public ForgetPassword() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
        // Change pin
        JLabel heading=new JLabel("Forget PIN?");
        heading.setBounds(300,25,200,50);
        heading.setFont(new Font("Raleway",Font.BOLD,30));
        image.add(heading);
        // Forget pin
        username = new JLabel("Enter Your UserName:");
        username.setBounds(125, 150, 250, 30);
        username.setFont(new Font("Raleway", Font.BOLD, 16));
        username.setForeground(Color.black);
        image.add(username);
        // Textfield
        usernamefield = new JTextField();
        usernamefield.setBounds(410, 150, 250, 30);
        usernamefield.setFont(new Font("Raleway", Font.BOLD, 18));
        image.add(usernamefield);
        // Forget pin
        phonenumber = new JLabel("Enter Your Phone Number:");
        phonenumber.setBounds(125, 200, 250, 30);
        phonenumber.setFont(new Font("Raleway", Font.BOLD, 16));
        phonenumber.setForeground(Color.black);
        image.add(phonenumber);
        // Textfield
        phonenumberfield = new JTextField();
        phonenumberfield.setBounds(410, 200, 250, 30);
        phonenumberfield.setFont(new Font("Raleway", Font.BOLD, 18));
        image.add(phonenumberfield);
        // email pin
        email = new JLabel("Enter Your Email ID:");
        email.setBounds(125, 250, 250, 30);
        email.setFont(new Font("Raleway", Font.BOLD, 16));
        email.setForeground(Color.black);
        image.add(email);
        // Textfield
        emailfield = new JTextField();
        emailfield.setBounds(410, 250, 250, 30);
        emailfield.setFont(new Font("Raleway", Font.BOLD, 18));
        image.add(emailfield);
        // new pin
        newpin = new JLabel("ENew Pin:");
        newpin.setBounds(125, 300, 250, 30);
        newpin.setFont(new Font("Raleway", Font.BOLD, 16));
        newpin.setForeground(Color.black);
        image.add(newpin);
        // Textfield
        newpinfield = new JTextField();
        newpinfield.setBounds(410, 300, 250, 30);
        newpinfield.setFont(new Font("Raleway", Font.BOLD, 18));
        image.add(newpinfield);
        // confirm
        confirm = new JButton("Confirm");
        confirm.setBounds(500, 400, 150, 30);
        confirm.setBackground(Color.black);
        confirm.setForeground(Color.white);
        confirm.setFont(new Font("Raleway", Font.BOLD, 20));
        confirm.addActionListener(this);
        image.add(confirm);
        // confirm
        back = new JButton("Back");
        back.setBounds(125, 400, 150, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.addActionListener(this);

        image.add(back);
        // Default
        setLayout(null);
        setSize(800, 600);
        setLocation(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            System.exit(0);
        } else if (ae.getSource() == confirm) {
            String UserName=usernamefield.getText();
            String Newpin = newpinfield.getText();
            String phone = phonenumberfield.getText();
            String emailid = emailfield.getText();
            try {
                HospitalManagementSystem conn = new HospitalManagementSystem();
                String query = "select*from Employee where Phone='" + phone + "' and Email='" + emailid + "'";
                String query3="select *from UsernamePassword where Username='"+UserName+"'";
                ResultSet res = conn.state.executeQuery(query);
                ResultSet resu=conn.state.executeQuery(query3);
                if (res.next()&& resu.next()) {
                    String query2 = "update UsernamePassword set Password='" + Newpin + "' where Username='"+UserName+"'";
                    conn.state.executeUpdate(query2);
                    JOptionPane.showMessageDialog(rootPane, "Password Changed  Successfully");
                    System.exit(0);
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Username or Email or Phone  Number Not Matched");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new ForgetPassword();
    }
}
