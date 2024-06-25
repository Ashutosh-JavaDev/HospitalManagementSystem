import javax.swing.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ambulance extends JFrame implements ActionListener{
    JLabel name,start,arrive,cause,phone;
    JTextField namefield,startfield,causefield,arrivefield,phonefield;
    JButton confirm;
    public Ambulance(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);
        // Name
        name=new JLabel("Name:");
        name.setBounds(25,50,150,50);
        name.setFont(new Font("Arial",Font.BOLD,20));
        image.add(name);
        // Name field
        namefield=new JTextField();
        namefield.setBounds(250,50,100,50);
        namefield.setFont(new Font("Arial",Font.BOLD,18));
        image.add(namefield);
        // start
        start=new JLabel("Pickup Point:");
        start.setBounds(25,120,150,50);
        start.setFont(new Font("Arial",Font.BOLD,20));
        image.add(start);
        // Default
        setLayout(null);
        setTitle("Ambluance");
        setSize(800,600);
        setLocation(250,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String[]args){
        new Ambulance() ;
    }
}
