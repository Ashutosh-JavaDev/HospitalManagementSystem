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
    JTextField notesfield, treatementfield, prescriptionfield, surgeryfield,
            immmunizatonfield;
    JDateChooser consult;
    JCheckBox Xray, CTScan, BloodTest, MRIs, BP;

    public medical() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
        JLabel head = new JLabel("Medical Report");
        head.setBounds(300, 20, 200, 40);
        head.setFont(new Font("Arial", Font.BOLD, 22));
        image.add(head);
        // consultatiion
        consulation = new JLabel("Consultation Date:");
        consulation.setFont(new Font("Arial", Font.BOLD, 18));
        consulation.setBounds(35, 75, 200, 30);
        image.add(consulation);
        // Consult field
        consult = new JDateChooser();
        consult.setBounds(270, 75, 200, 30);
        consult.setFont(new Font("Arial", Font.BOLD, 22));
        image.add(consult);
        // Notes
        DoctorsNotes = new JLabel("Doctor Notes:");
        DoctorsNotes.setBounds(35, 115, 200, 30);
        DoctorsNotes.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(DoctorsNotes);
        // Dooctor field
        notesfield = new JTextField();
        notesfield.setBounds(270, 115, 200, 30);
        notesfield.setFont(new Font("Arial", Font.BOLD, 22));
        image.add(notesfield);

        // Notes
        diagnostic = new JLabel("Diagnostic:");
        diagnostic.setBounds(35, 155, 200, 30);
        diagnostic.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(diagnostic);
        // Dooctor field
        Xray = new JCheckBox("X-Ray");
        Xray.setBounds(270, 155, 100, 30);
        Xray.setFont(new Font("Arial", Font.BOLD, 22));
        Xray.setBackground(Color.white);
        image.add(Xray);

        //
        CTScan = new JCheckBox("CT-Scan");
        CTScan.setBounds(380, 155, 100, 30);
        CTScan.setFont(new Font("Arial", Font.BOLD, 22));
        CTScan.setBackground(Color.white);
        image.add(CTScan);
        //
        BloodTest = new JCheckBox("Blood Test");
        BloodTest.setBounds(490, 155, 200, 30);
        BloodTest.setFont(new Font("Arial", Font.BOLD, 22));
        BloodTest.setBackground(Color.white);
        image.add(BloodTest);
        //
        MRIs = new JCheckBox("MRIs");
        MRIs.setBounds(300, 195, 100, 30);
        MRIs.setFont(new Font("Arial", Font.BOLD, 22));
        MRIs.setBackground(Color.white);
        image.add(MRIs);
        //
        BP = new JCheckBox("BP");
        BP.setBounds(410, 195, 100, 30);
        BP.setFont(new Font("Arial", Font.BOLD, 22));
        image.add(BP);

        // Notes
        // Default
        setLayout(null);
        setTitle("Medical Report");
        setSize(800, 600);
        setLocation(250, 150);
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
