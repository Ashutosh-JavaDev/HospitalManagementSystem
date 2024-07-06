import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Billing extends JFrame implements ActionListener {
    JLabel patientID, patientName, admissionDate, dischargeDate, roomCharges, consultationFees, medicianFees,
            labtestCharges, surgeryCharges, miscellaneousCharges, totalAmount, amountPaid, balanceDue, paymentMethod,
            billingDate, billingID, attendingPhysician;
    JTextField idfield, namefield, roomfield, consultfield, feefield, labfield, surgeryfield, miscellaneousfield,
            totalfield, amountfield, balancefield, billingfield, physicianfield;
    JDateChooser addmissionfield, dischargefield;
    JButton confirm,back;
    JRadioButton methodfield;

    public Billing() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1000, 800);
        add(image);
        JLabel title=new JLabel("Billing");
        title.setBounds(300,10,180,30);
        title.setFont(new Font("Arial",Font.BOLD,20));
        add(title);
        patientID=new JLabel("Patient ID");
        patientID.setBounds(30,70,100,30);
        patientID.setFont(new Font("Raleway",Font.BOLD,16));
        add(patientID);
        idfield=new JTextField();
        idfield.setBounds(180,70,100,30);
        add(idfield);

        // Button
        back=new JButton("Back");
        back.setBounds(600,900,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        
        // Default
        setSize(1000,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(250,150);
        setUndecorated(true);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

    }
    public static void main(String[]args){
        new Billing();
    }
}