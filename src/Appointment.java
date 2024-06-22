import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.Font;
import java.awt.Color;
import java.sql.SQLException;
public class Appointment extends JFrame implements ActionListener {
    public Appointment(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
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
