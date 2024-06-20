import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.ActionListener;
public class ForgetPassword extends JFrame implements ActionListener {
    JLabel newpin,phonenumber;
    JTextField oldpinfield,phonenumberfield;
    public ForgetPassword(){
        ImageIcon i1=new ImageIcon("pexels-scottwebb-311458.jpg");
        Image i2=i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);
        // Check Form number
        JLabel heading=new JLabel("Form No:");
        heading.setBounds(300,20,150,30);
        heading.setFont(new Font("Arial",Font.BOLD,20));
        image.add(heading);
        // Forget pin
        phonenumber=new JLabel("Enter Your Phone Number:");
        phonenumber.setBounds(25,200,250,30);
        phonenumber.setFont(new Font("Raleway",Font.PLAIN,16));
        phonenumber.setForeground(Color.black);
        image.add(phonenumber);
        // Textfield
        phonenumberfield=new JTextField();
        phonenumberfield.setBounds(310,200,150,30);
        phonenumberfield.setFont(new Font("Raleway",Font.BOLD,18));
        image.add(phonenumberfield);

        // Default
        setLayout(null);
        setSize(800,600);
        setLocation(250,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

    }
}
