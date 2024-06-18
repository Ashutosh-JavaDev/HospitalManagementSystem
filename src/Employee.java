import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
public class Employee extends JFrame implements ActionListener{
    JLabel name,proffesion,ID,email,phone,IDnumber,doj,maritial;
    public Employee(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);
        // Name
        // Default Information
        setLayout(null);
        setTitle("Employee Entry");
        setSize(800,600);
        setLocation(250,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String[]args){
        new Employee();
    }
}
