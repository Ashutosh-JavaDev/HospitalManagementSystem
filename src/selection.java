import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
public class selection extends JFrame implements ActionListener {
    selection(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/pexels-jmeyer1220-668300.jpg"));
        Image i2=i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 500, 400);
        add(image);
        // default
        setTitle("Hospital Management System");
        setSize(500,400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String[]args){
        new selection();
    }
}
