import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Billing extends JFrame implements ActionListener {
    JLabel patientID, patientName, admissionDate, dischargeDate, roomCharges, consultationFees, medicianFees,
            labtestCharges, surgeryCharges, miscellaneousCharges, totalAmount, amountPaid, balancepaid, paymentMethod,
            billingDate, billingID, attendingPhysician;
    JTextField idfield, namefield, roomfield, consultfield, feefield, labfield, surgeryfield, miscellaneousfield,
            totalfield, amountfield, balancefield, billingfield, physicianfield;
    JDateChooser addmissionfield, dischargefield;
    JButton confirm, back;
    JComboBox methodfield;

    public Billing() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1000, 600);
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
        patientName.setBounds(30, 110, 200, 30);
        patientName.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(patientName);
        namefield = new JTextField();
        namefield.setBounds(180, 110, 200, 30);
        image.add(namefield);
        //
        roomCharges = new JLabel("Room Charges");
        roomCharges.setBounds(30, 160, 200, 30);
        roomCharges.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(roomCharges);
        roomfield = new JTextField();
        roomfield.setBounds(180, 160, 200, 30);
        image.add(roomfield);
        //
        consultationFees = new JLabel("Consultant Fees");
        consultationFees.setBounds(30, 210, 200, 30);
        consultationFees.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(consultationFees);
        consultfield = new JTextField();
        consultfield.setBounds(180, 210, 200, 30);
        image.add(consultfield);
        //
        medicianFees = new JLabel("Medicen Fees");
        medicianFees.setBounds(420, 210, 200, 30);
        medicianFees.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(medicianFees);
        feefield = new JTextField();
        feefield.setBounds(640, 210, 200, 30);
        image.add(feefield);
        //
        labtestCharges = new JLabel("Lab Charges");
        labtestCharges.setBounds(30, 310, 200, 30);
        labtestCharges.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(labtestCharges);
        labfield = new JTextField();
        labfield.setBounds(180, 310, 200, 30);
        image.add(labfield);
        //
        surgeryCharges = new JLabel("Surgery Charges");
        surgeryCharges.setBounds(420, 110, 200, 30);
        surgeryCharges.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(surgeryCharges);
        surgeryfield = new JTextField();
        surgeryfield.setBounds(640, 110, 200, 30);
        image.add(surgeryfield);
        //
        miscellaneousCharges = new JLabel("Miscellaneous Charges");
        miscellaneousCharges.setBounds(420, 160, 200, 30);
        miscellaneousCharges.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(miscellaneousCharges);
        miscellaneousfield = new JTextField();
        miscellaneousfield.setBounds(640, 160, 200, 30);
        image.add(miscellaneousfield);
        //
        totalAmount = new JLabel("Total Amount");
        totalAmount.setBounds(30, 260, 200, 30);
        totalAmount.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(totalAmount);
        totalfield = new JTextField();
        totalfield.setBounds(180, 260, 200, 30);
        image.add(totalfield);
        //
        balancepaid = new JLabel("Balance Paid");
        balancepaid.setBounds(420, 260, 200, 30);
        balancepaid.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(balancepaid);
        balancefield = new JTextField();
        balancefield.setBounds(640, 260, 200, 30);
        image.add(balancefield);
        //
        billingID = new JLabel("Billing ID");
        billingID.setBounds(420, 310, 200, 30);
        billingID.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(billingID);
        billingfield = new JTextField();
        billingfield.setBounds(640, 310, 200, 30);
        image.add(billingfield);
        //
        attendingPhysician = new JLabel("Physician Name");
        attendingPhysician.setBounds(420, 410, 200, 30);
        attendingPhysician.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(attendingPhysician);
        physicianfield = new JTextField();
        physicianfield.setBounds(640, 410, 200, 30);
        image.add(physicianfield);
        //
        admissionDate = new JLabel("Admission Date");
        admissionDate.setBounds(30, 360, 200, 30);
        admissionDate.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(admissionDate);
        addmissionfield = new JDateChooser();
        addmissionfield.setBounds(180, 360, 200, 30);
        image.add(addmissionfield);
        //
        dischargeDate = new JLabel("Discharge Date");
        dischargeDate.setBounds(420, 360, 200, 30);
        dischargeDate.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(dischargeDate);
        dischargefield = new JDateChooser();
        dischargefield.setBounds(640, 360, 200, 30);
        image.add(dischargefield);
        //
        paymentMethod = new JLabel("Payment Method");
        paymentMethod.setBounds(30, 410, 200, 30);
        paymentMethod.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(paymentMethod);
        String method[] = { "Net-Banking", "Online Payment", "Cash", "Credit Card", "Debit Card" };
        methodfield = new JComboBox(method);
        methodfield.setBounds(180, 410, 200, 30);
        image.add(methodfield);
        // Button
        back = new JButton("Back");
        back.setBounds(650, 470, 200, 50);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.setFont(new Font("Arial", Font.BOLD, 20));
        back.addActionListener(this);
        image.add(back);
        // Confirm
        confirm = new JButton("Confirm");
        confirm.setBounds(30, 470, 200, 50);
        confirm.setBackground(Color.BLACK);
        confirm.setForeground(Color.white);
        confirm.setFont(new Font("Arial", Font.BOLD, 20));
        confirm.addActionListener(this);
        image.add(confirm);
        // Default
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(250, 150);
        setUndecorated(true);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            System.exit(0);
        } else if (ae.getSource() == confirm) {
            // idfield, namefield, roomfield, consultfield, feefield, labfield,
            // surgeryfield, miscellaneousfield,
            // totalfield, amountfield, balancefield, billingfield, physicianfield;
            /*
             * JDateChooser addmissionfield, dischargefield;
             * JButton confirm, back;
             * JComboBox methodfield;
             */

            String IDfield = idfield.getText();
            String Namefield = namefield.getText();
            String Roomfield = roomfield.getText();
            String Consultfield = consultfield.getText();
            String Feefield = feefield.getText();
            String Labfield = labfield.getText();
            String Surgeryfield = surgeryfield.getText();
            String Miscellaneous = miscellaneousfield.getText();
            String BalanceField = balancefield.getText();
            String Billingfield = billingfield.getText();
            String Physicianfield = physicianfield.getText();
            String Addmissionfield = ((JTextField) addmissionfield.getDateEditor().getUiComponent()).getText();
            String Dischargefield = ((JTextField) dischargefield.getDateEditor().getUiComponent()).getText();
            String Method = (String) methodfield.getSelectedItem();
            int roomcharges = Integer.parseInt(Roomfield);
            int constlantfee = Integer.parseInt(Consultfield);
            int Fee = Integer.parseInt(Feefield);
            int lab = Integer.parseInt(Labfield);
            int miscelleous = Integer.parseInt(Miscellaneous);
            int surgery = Integer.parseInt(Surgeryfield);
            int total = roomcharges + constlantfee + Fee + lab + miscelleous + surgery;
            int balancefld = Integer.parseInt(BalanceField);
            int balanceDue = total - balancefld;
            String Total = Integer.toString(total);

            totalfield.setText(Total);

            String BalanceDue = Integer.toString(balanceDue);
            try {
                HospitalManagementSystem conn = new HospitalManagementSystem();
                String search = "select*from HospitalManagementSystem where Patient_ID = '" + IDfield
                        + "' and Patient_Name = '" + Namefield + "'";
                ResultSet result = conn.state.executeQuery(search);

                while (result.next()) {
                    String query = "insert into billing values('" + IDfield + "','" + Namefield + "','" + Roomfield
                            + "','"
                            + Addmissionfield + "','" + Dischargefield + "','" + Labfield + "','" + Surgeryfield + "','"
                            + Miscellaneous + "','"
                            + Feefield + "','" + Billingfield + "','" + Total + "','" + BalanceField + "','"
                            + BalanceDue + "','"
                            + Physicianfield + "','" + Consultfield + "','" + Method + "')";
                    conn.state.executeUpdate(query);
                    JOptionPane.showMessageDialog(rootPane, "Balance Due: " + BalanceDue);
                    JOptionPane.showMessageDialog(rootPane, "Data Updated Succesfully");
                }

            } catch (SQLException a) {
                a.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Billing();
    }
}