import javax.swing.*;
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

    public medical() {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
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
