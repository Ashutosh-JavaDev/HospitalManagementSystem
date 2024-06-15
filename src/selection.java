import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
public class selection extends JFrame implements ActionListener {
    JButton addPatient,ambulance,appointment,medical,billing,inventory,security,logout;
    selection(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/pexels-jmeyer1220-668300.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
        // Button 1
        addPatient=new JButton("Patient");
        addPatient.setBounds(40,20,80,20);
        addPatient.setFont(new Font("Arial",Font.BOLD,18));
        addPatient.setBackground(Color.black);
        addPatient.setForeground(Color.white);
        image.add(addPatient);
        // Button 2
        ambulance=new JButton("Ambulance");
        ambulance.setBounds(140,20,80,20);
        ambulance.setFont(new Font("Arial",Font.BOLD,18));
        ambulance.setBackground(Color.black);
        ambulance.setForeground(Color.white);
        image.add(ambulance);
        // Button 3
        appointment=new JButton("Appointment");
        appointment.setBounds(240,20,80,20);
        appointment.setFont(new Font("Arial",Font.BOLD,18));
        appointment.setBackground(Color.black);
        appointment.setForeground(Color.white);
        image.add(appointment);
        // Button 4
        medical=new JButton("Medical");
        medical.setBounds(340,20,80,20);
        medical.setFont(new Font("Arial",Font.BOLD,18));
        medical.setBackground(Color.black);
        medical.setForeground(Color.white);
        image.add(medical);
        // Button 5
        billing=new JButton("Billing");
        billing.setBounds(20,60,80,20);
        billing.setFont(new Font("Arial",Font.BOLD,18));
        billing.setBackground(Color.black);
        billing.setForeground(Color.white);
        image.add(billing);
        // Button 6
        inventory=new JButton("Inventory");
        inventory.setBounds(140,100,80,20);
        inventory.setFont(new Font("Arial",Font.BOLD,18));
        inventory.setBackground(Color.black);
        inventory.setForeground(Color.white);
        image.add(inventory);
        // Button 7
        security=new JButton("Security");
        security.setBounds(240,140,80,20);
        security.setFont(new Font("Arial",Font.BOLD,18));
        security.setBackground(Color.black);
        security.setForeground(Color.white);
        image.add(security);
        // Button 8
        logout=new JButton("Logout");
        logout.setBounds(340,180,80,20);
        logout.setFont(new Font("Arial",Font.BOLD,18));
        logout.setBackground(Color.black);
        logout.setForeground(Color.white);
        image.add(logout);
        // default
        setTitle("Hospital Management System");
        setSize(800,600);
        setLocation(400,200);
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
