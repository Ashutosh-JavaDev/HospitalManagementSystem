import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
public class Patient extends JFrame implements ActionListener{
    JLabel name,ID,phone,email,room,cause,date,gaurdian;
    JTextField namefield,idfield,emailfield,phonefield,roomfield,causefield,datefield,gaurdianfield;
    Patient(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);
        //Name 
        name=new JLabel("Patient's Name: ");
        name.setFont(new Font("Arial",Font.BOLD,20));
        name.setForeground(Color.black);
        name.setBounds(100,35,200,30);
        image.add(name);
        namefield=new JTextField();
        namefield.setFont(new Font("Arial",Font.PLAIN,18));
        namefield.setBounds(350,35,200,30);
        image.add(namefield);
        // Default
        setTitle("Patient Details");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocation(250,250);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String[]args){
        new Patient();
    }
}
