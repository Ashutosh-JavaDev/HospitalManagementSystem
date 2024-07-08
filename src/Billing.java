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
    JButton confirm, back;
    JComboBox methodfield;

    public Billing() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1000, 800);
        add(image);
        JLabel title = new JLabel("Billing");
        title.setBounds(450, 10, 180, 45);
        title.setFont(new Font("Arial", Font.BOLD, 35));
        image.add(title);
        //
        patientID = new JLabel("Patient ID");
        patientID.setBounds(30, 70, 200, 30);
        patientID.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(patientID);
        idfield = new JTextField();
        idfield.setBounds(180, 70, 200, 30);
        image.add(idfield);
        //
        patientName = new JLabel("Patient Name");
        patientName.setBounds(30, 120, 200, 30);
        patientName.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(patientName);
        namefield = new JTextField();
        namefield.setBounds(180, 120, 200, 30);
        image.add(namefield);
        //
        roomCharges = new JLabel("Room Charges");
        roomCharges.setBounds(30, 150, 200, 30);
        roomCharges.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(roomCharges);
        roomfield = new JTextField();
        roomfield.setBounds(180, 150, 200, 30);
        image.add(roomfield);
        //
        consultationFees = new JLabel("Consultant Fees");
        consultationFees.setBounds(30, 190, 200, 30);
        consultationFees.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(consultationFees);
        consultfield = new JTextField();
        consultfield.setBounds(180, 190, 200, 30);
        image.add(consultfield);
        //
        medicianFees = new JLabel("Medicen Fees");
        medicianFees.setBounds(30, 230, 200, 30);
        medicianFees.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(medicianFees);
        feefield = new JTextField();
        feefield.setBounds(180, 230, 200, 30);
        image.add(feefield);
        //
        labtestCharges = new JLabel("Lab Charges");
        labtestCharges.setBounds(30, 270, 200, 30);
        labtestCharges.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(labtestCharges);
        labfield = new JTextField();
        labfield.setBounds(180, 270, 200, 30);
        image.add(labfield);
        //
        surgeryCharges = new JLabel("Surgery Charges");
        surgeryCharges.setBounds(30, 310, 200, 30);
        surgeryCharges.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(surgeryCharges);
        surgeryfield = new JTextField();
        surgeryfield.setBounds(180, 310, 200, 30);
        image.add(surgeryfield);
        //
        miscellaneousCharges = new JLabel("Miscellaneous Charges");
        miscellaneousCharges.setBounds(30, 350, 200, 30);
        miscellaneousCharges.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(miscellaneousCharges);
        miscellaneousfield = new JTextField();
        miscellaneousfield.setBounds(180, 350, 200, 30);
        image.add(miscellaneousfield);
        //
        totalAmount = new JLabel("Total Amount");
        totalAmount.setBounds(30, 390, 200, 30);
        totalAmount.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(totalAmount);
        totalfield = new JTextField();
        totalfield.setBounds(180, 390, 200, 30);
        image.add(totalfield);
        //
        balanceDue = new JLabel("Balance Due");
        balanceDue.setBounds(30, 430, 200, 30);
        balanceDue.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(balanceDue);
        balancefield = new JTextField();
        balancefield.setBounds(180, 430, 200, 30);
        image.add(balancefield);
        // 
        billingID=new JLabel("Billing ID");
        billingID.setBounds(30,470,200,30);
        billingID.setFont(new Font("Arial",Font.BOLD,16));
        image.add(billingID);
        billingfield=new JTextField();
        billingfield.setBounds(180,470,200,30);
        image.add(billingfield);
        // 
        attendingPhysician=new JLabel("Physician Name");
        attendingPhysician.setBounds(30,510,200,30);
        attendingPhysician.setFont(new Font("Arial",Font.BOLD,16));
        image.add(attendingPhysician);
        physicianfield=new JTextField();
        physicianfield.setBounds(180,510,200,30);
        image.add(physicianfield);
        // 
        admissionDate=new JLabel("Admission Date");
        admissionDate.setBounds(30,550,200,30);
        admissionDate.setFont(new Font("Arial",Font.BOLD,16));
        image.add(admissionDate);
        addmissionfield=new JDateChooser();
        addmissionfield.setBounds(180,550,200,30);
        image.add(addmissionfield);
        // 
        dischargeDate=new JLabel("Discharge Date");
        dischargeDate.setBounds(30,590,200,30);
        dischargeDate.setFont(new Font("Arial",Font.BOLD,16));
        image.add(dischargeDate);
        dischargefield=new JDateChooser();
        dischargefield.setBounds(180,590,200,30);
        image.add(dischargefield);
        // 
        paymentMethod=new JLabel("Payment Method");
        paymentMethod.setBounds(30,630,200,30);
        paymentMethod.setFont(new Font("Arial",Font.BOLD,16));
        image.add(paymentMethod);
        String method[]={"Net-Banking","Online Payment","Cash","Credit Card","Debit Card"};
        methodfield=new JComboBox(method);
        methodfield.setBounds(180,630,200,30);
        image.add(methodfield);
        // Button
        back = new JButton("Back");
        back.setBounds(800, 650, 100, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.setFont(new Font("Arial", Font.BOLD, 20));
        back.addActionListener(this);
        image.add(back);
        // Confirm
        confirm = new JButton("Back");
        confirm.setBounds(800, 650, 100, 30);
        confirm.setBackground(Color.BLACK);
        confirm.setForeground(Color.white);
        confirm.setFont(new Font("Arial", Font.BOLD, 20));
        confirm.addActionListener(this);
        image.add(back);
        // Default
        setSize(1000, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(250, 150);
        setUndecorated(true);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Billing();
    }
}