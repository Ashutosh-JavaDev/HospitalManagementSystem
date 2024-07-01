import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.ResultSet;

public class medical extends JFrame implements ActionListener {
    JLabel consulation, DoctorsNotes, diagnostic, treatement, prescription, surgery, physica, code,
            treatementdate, treatementDesc, Profession;
    JTextField notesfield, treatementfield, prescriptionfield,
            physicianfield, codefield;
    JDateChooser consult, surgeryfield;
    JComboBox box;
    JCheckBox Xray, CTScan, BloodTest, MRIs, BP;
    JButton back, confirm;

    public medical() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1000, 800);
        add(image);
        JLabel head = new JLabel("Medical Report");
        head.setBounds(300, 10, 600, 60);
        head.setForeground(Color.gray);
        head.setFont(new Font("Arial", Font.BOLD, 32));
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
        DoctorsNotes = new JLabel("Operation:");
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
        Xray.setOpaque(false);
        image.add(Xray);

        //
        CTScan = new JCheckBox("CT-Scan");
        CTScan.setBounds(380, 155, 120, 30);
        CTScan.setFont(new Font("Arial", Font.BOLD, 22));
        CTScan.setOpaque(false);
        image.add(CTScan);
        //
        BloodTest = new JCheckBox("Blood Test");
        BloodTest.setBounds(510, 155, 200, 30);
        BloodTest.setFont(new Font("Arial", Font.BOLD, 22));
        BloodTest.setOpaque(false);
        image.add(BloodTest);
        //
        MRIs = new JCheckBox("MRIs");
        MRIs.setBounds(300, 195, 100, 30);
        MRIs.setFont(new Font("Arial", Font.BOLD, 22));
        MRIs.setOpaque(false);
        image.add(MRIs);
        //
        BP = new JCheckBox("BP");
        BP.setBounds(490, 195, 100, 30);
        BP.setFont(new Font("Arial", Font.BOLD, 22));
        BP.setOpaque(false);
        image.add(BP);
        // Treatemewnt
        treatement = new JLabel("Treatement Details");
        treatement.setBounds(300, 240, 500, 50);
        treatement.setFont(new Font("Raleway", Font.BOLD, 28));
        treatement.setForeground(Color.GRAY);
        image.add(treatement);
        // Prescription
        prescription = new JLabel("Prescription:");
        prescription.setBounds(35, 310, 200, 30);
        prescription.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(prescription);
        // Pre textField
        prescriptionfield = new JTextField();
        prescriptionfield.setBounds(250, 310, 200, 30);
        prescriptionfield.setFont(new Font("Arial", Font.BOLD, 22));
        image.add(prescriptionfield);
        // surgery
        surgery = new JLabel("Surgery Field");
        surgery.setBounds(35, 350, 200, 30);
        surgery.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(surgery);
        // Surgery date
        surgeryfield = new JDateChooser();
        surgeryfield.setBounds(250, 350, 200, 30);
        surgeryfield.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(surgeryfield);
        // physician
        physica = new JLabel("Physician");
        physica.setBounds(35, 390, 200, 30);
        physica.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(physica);
        // Phuysician date
        physicianfield = new JTextField();
        physicianfield.setBounds(250, 390, 200, 30);
        physicianfield.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(physicianfield);
        // // physician
        code = new JLabel("Surgery Code");
        code.setBounds(35, 430, 200, 30);
        code.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(code);
        // Phuysician date
        codefield = new JTextField();
        codefield.setBounds(250, 430, 200, 30);
        codefield.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(codefield);
        // Profession
        Profession = new JLabel("Profession");
        Profession.setBounds(35, 470, 200, 30);
        Profession.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(Profession);
        // Phuysician date
        String prof[] = { "Junior Doctor", "Senior Doctor" };
        box = new JComboBox(prof);
        box.setBounds(250, 470, 200, 30);
        box.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(box);
        // Button
        back = new JButton("Back");
        back.setBounds(300, 600, 100, 30);
        back.setFont(new Font("Arial", Font.BOLD, 18));
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        back.addActionListener(this);
        image.add(back);
        // Button
        confirm = new JButton("Confirm");
        confirm.setBounds(500, 600, 150, 30);
        confirm.setFont(new Font("Arial", Font.BOLD, 18));
        confirm.setForeground(Color.white);
        confirm.setBackground(Color.black);
        confirm.addActionListener(this);
        image.add(confirm);

        // Default
        setLayout(null);
        setTitle("Medical Report");
        setSize(1000, 800);
        setLocation(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            System.exit(0);
        } else if (ae.getSource() == confirm) {
            String Code = codefield.getText();
            String Consultant = ((JTextField) consult.getDateEditor().getUiComponent()).getText();
            String Notes = notesfield.getText();
            String facility = "";
            if (Xray.isSelected()) {
                facility = facility + "Xray ";
            } else if (CTScan.isSelected()) {
                facility = facility + "CT-Scan ";
            } else if (BP.isSelected()) {
                facility = facility + "BP ";
            } else if (MRIs.isSelected()) {
                facility = facility + "MRIs ";
            } else if (BloodTest.isSelected()) {
                facility = facility + "Blood Test ";
            }
            String prescription = prescriptionfield.getText();
            String Physician = physicianfield.getText();
            String Box = (String) box.getSelectedItem();
            try {
                HospitalManagementSystem conn = new HospitalManagementSystem();
                String query = "Select *from Employee where(Employee_Name ='" + Physician + "'and Profession='" + Box
                        + "')";
                ResultSet res = conn.state.executeQuery(query);
                if (res.next()) {
                    String query2 = "insert into Medical values('" + Code + "','" + Consultant + "','" + Notes + "','"
                            + Physician + "','" + facility + "','" + prescription + "')";
                    conn.state.executeUpdate(query2);
                    JOptionPane.showMessageDialog(rootPane, "Data Inserted Succesfully");
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Profession or Doctor Name not Matched");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        new medical();
    }
}
