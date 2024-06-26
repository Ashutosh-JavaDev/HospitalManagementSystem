import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.sql.SQLException;

public class medical extends JFrame implements ActionListener {
    JLabel consulation, DoctorsNotes, diagnostic, treatement, prescription, surgery, immunization;
    JTextField consultfield, notesfield, diagnosticfield, treatementfield, prescriptionfield, surgeryfield,
            immmunizatonfield;
    JDateChooser consult;
    public medical() {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);
        JLabel head=new JLabel("Medical Report");
        head.setBounds(300,20,100,40);
        head.setFont(new Font("Arial",Font.BOLD,22));
        image.add(head);
        // consultatiion
        consulation=new JLabel("Consultation Date:");
        consulation.setFont(new Font("Arial",Font.BOLD,18));
        consulation.setBounds(35,75,200,30);
        image.add(consulation);
        // Default
        setLayout(null);
        setTitle("Medical Report");
        setSize(800,600);
        setLocation(250,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new medical();
    }
}
