import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Billing extends JFrame implements ActionListener{
    JLabel patientID,patientName,admissionDate,dischargeDate,roomCharges,consultationFees,medicianFees,labtestCharges,surgeryCharges,miscellaneousCharges,totalAmount,amountPaid,balanceDue,paymentMethod,billingDate,billingID,attendingPhysician;
    JTextField idfield,namefield,roomfield,consultfield,feefield,labfield,surgeryfield,miscellaneousfield,totalfield,amountfield,balancefield,billingfield,physicianfield;
    JDateChooser addmissionfield,dischargefield;
    JRadioButton methodfield;
    public Billing() {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2=i1.getImage().getScaledInstance(1000, 800, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
    }
    public void actionPerformed(ActionEvent ae){

    }
}