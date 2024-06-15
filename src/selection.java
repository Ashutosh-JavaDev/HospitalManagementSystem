import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
public class selection extends JFrame implements ActionListener {
    selection(){
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
