import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;

public class selection extends JFrame implements ActionListener {
    JButton addPatient, addEmployee, ambulance, appointment, medical, billing, logout;

    selection() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-jmeyer1220-668300.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
        // Button 1
        addPatient = new JButton("Patient");
        addPatient.setBounds(40, 60, 150, 40);
        addPatient.setFont(new Font("Arial", Font.BOLD, 18));
        addPatient.setBackground(Color.black);
        addPatient.setForeground(Color.white);
        image.add(addPatient);
        addPatient.addActionListener(this);
        // Button 2
        ambulance = new JButton("Ambulance");
        ambulance.setBounds(200, 60, 150, 40);
        ambulance.setFont(new Font("Arial", Font.BOLD, 18));
        ambulance.setBackground(Color.black);
        ambulance.setForeground(Color.white);
        image.add(ambulance);
        addPatient.addActionListener(this);
        // Button 3
        appointment = new JButton("Appointment");
        appointment.setBounds(360, 60, 180, 40);
        appointment.setFont(new Font("Arial", Font.BOLD, 18));
        appointment.setBackground(Color.black);
        appointment.setForeground(Color.white);
        image.add(appointment);
        addPatient.addActionListener(this);

        // Button 4
        medical = new JButton("Medical");
        medical.setBounds(560, 60, 150, 40);
        medical.setFont(new Font("Arial", Font.BOLD, 18));
        medical.setBackground(Color.black);
        medical.setForeground(Color.white);
        image.add(medical);
        medical.addActionListener(this);

        // Button 5
        billing = new JButton("Billing");
        billing.setBounds(40, 120, 150, 40);
        billing.setFont(new Font("Arial", Font.BOLD, 18));
        billing.setBackground(Color.black);
        billing.setForeground(Color.white);
        image.add(billing);
        billing.addActionListener(this);

        // Employee
        addEmployee = new JButton("Employee");
        addEmployee.setBounds(200, 120, 150, 40);
        addEmployee.setFont(new Font("Arial", Font.BOLD, 18));
        addEmployee.setBackground(Color.black);
        addEmployee.setForeground(Color.white);
        image.add(addEmployee);
        addEmployee.addActionListener(this);
        // Button 8
        logout = new JButton("Logout");
        logout.setBounds(360, 120, 180, 40);
        logout.setFont(new Font("Arial", Font.BOLD, 18));
        logout.setBackground(Color.black);
        logout.setForeground(Color.white);
        image.add(logout);
        logout.addActionListener(this);
        // default
        setTitle("Hospital Management System");
        setSize(800, 600);
        setLocation(400, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addPatient) {
            setVisible(false);
            new Patient().setVisible(true);
        } else if (ae.getSource() == addEmployee) {
            setVisible(false);
            new Employee().setVisible(true);
        } else if (ae.getSource() == appointment) {
            setVisible(false);
            new Appointment().setVisible(true);
        } else if (ae.getSource() == ambulance) {
            setVisible(false);
            new Ambulance().setVisible(true);
        } else if (ae.getSource() == medical) {
            setVisible(false);
            new medical().setVisible(true);
        } else if (ae.getSource() == billing) {
            setVisible(false);
            new Billing().setVisible(true);
        } else if (ae.getSource() == logout) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new selection();
    }
}
