import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.ActionListener;

public class ForgetPassword extends JFrame implements ActionListener {
    JLabel newpin, phonenumber, email;
    JTextField newpinfield, phonenumberfield, emailfield;
    JButton confirm, back;

    public ForgetPassword() {
        ImageIcon i1 = new ImageIcon("pexels-scottwebb-311458.jpg");
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
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
        if(ae.getSource()==back){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new ForgetPassword();
    }
}
