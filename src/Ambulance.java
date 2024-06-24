import javax.swing.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ambulance extends JFrame implements ActionListener{

    public Ambulance(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
    }
    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String[]args){
        new Ambulance() ;
    }
}
