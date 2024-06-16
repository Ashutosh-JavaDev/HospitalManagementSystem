import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
public class Patient extends JFrame implements ActionListener{
    JLabel name,ID,phone,email,room,cause,date,gaurdian;
    Patient(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/.jgp"));
        Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);
        //Name 
        name=new JLabel("Patient's Name: ");
        name.setFont(new Font("Arial",Font.BOLD,18));
        name.setForeground(Color.white);
        name.setBounds(100,25,200,20);
        image.add(name);
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
