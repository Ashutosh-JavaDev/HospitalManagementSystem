import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.ActionListener;
public class ForgetPassword extends JFrame implements ActionListener {
    public ForgetPassword(){
        ImageIcon i1=new ImageIcon("pexels-scottwebb-311458.jpg");
        Image i2=i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);
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
