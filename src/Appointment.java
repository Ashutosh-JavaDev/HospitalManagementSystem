import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.Font;
import java.awt.Color;
import java.sql.SQLException;
public class Appointment extends JFrame implements ActionListener {
    JLabel name,phone,timing,cause,payment;
    JTextField namefield,phonefield,timingfield,causefield,paymentfield;
    JButton back,done;
    public Appointment(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);
        // 
        JLabel newPatient=new JLabel("New Appoinment");
        newPatient.setBounds(150,20,150,35);
        newPatient.setFont(new Font("Arial",Font.BOLD,25));
        image.add(newPatient);
        // Name
        name=new JLabel("Patient's Name");
        name.setBounds(25,100,150,20);
        name.setFont(new Font("Raleway",Font.BOLD,25));
        image.add(name);
        // Name filed
        namefield=new JTextField();
        namefield.setBounds(200,100,150,20);
        namefield.setFont(new Font("Raleway",Font.BOLD,18));
        image.add(namefield);
        //Default
        setLayout(null);
        setSize(800,600);
        setLocation(250,150);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

    }
}
