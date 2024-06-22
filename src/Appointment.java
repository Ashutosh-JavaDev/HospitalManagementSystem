import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.Font;
import java.awt.Color;
import java.sql.SQLException;

public class Appointment extends JFrame implements ActionListener {
    JLabel name, phone, timing, cause, payment;
    JTextField namefield, phonefield, timingfield, causefield, paymentfield;
    JButton back, done;

    public Appointment() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
        //
        JLabel newPatient = new JLabel("New Appoinment");
        newPatient.setBounds(250, 20, 250, 35);
        newPatient.setFont(new Font("Arial", Font.BOLD, 25));
        image.add(newPatient);
        // Name
        name = new JLabel("Patient's Name");
        name.setBounds(25, 100, 200, 30);
        name.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(name);
        // Name filed
        namefield = new JTextField();
        namefield.setBounds(250, 100, 300, 30);
        namefield.setFont(new Font("Raleway", Font.BOLD, 18));
        image.add(namefield);
        // Phone
        phone = new JLabel("Phone Number");
        phone.setBounds(25, 150, 200, 30);
        phone.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(phone);
        // phone filed
        phonefield = new JTextField();
        phonefield.setBounds(250, 150, 300, 30);
        phonefield.setFont(new Font("Raleway", Font.BOLD, 18));
        image.add(phonefield);
        // timing
        timing = new JLabel("Timing");
        timing.setBounds(25, 200, 200, 30);
        timing.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(timing);
        // timing filed
        timingfield = new JTextField();
        timingfield.setBounds(250, 200, 300, 30);
        timingfield.setFont(new Font("Raleway", Font.BOLD, 18));
        image.add(timingfield);
        // cause
        cause = new JLabel("Cause");
        cause.setBounds(25, 250, 200, 30);
        cause.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(cause);
        // cause filed
        causefield = new JTextField();
        causefield.setBounds(250, 250, 300, 30);
        causefield.setFont(new Font("Raleway", Font.BOLD, 18));
        image.add(causefield);
        // payment
        payment = new JLabel("Payment");
        payment.setBounds(25, 300, 200, 30);
        payment.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(payment);
        // paymment filed
        paymentfield = new JTextField();
        paymentfield.setBounds(250, 300, 300, 30);
        paymentfield.setFont(new Font("Raleway", Font.BOLD, 18));
        image.add(paymentfield);
        // Jbutton
        back=new JButton("Back");
        back.setBounds(50,380,150,40);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(new Font("Raleway", Font.BOLD, 18));
        back.addActionListener(this);
        image.add(back);
        // Done
        done=new JButton("Done");
        done.setBounds(350,380,150,40);
        done.setBackground(Color.black);
        done.setForeground(Color.white);
        done.setFont(new Font("Raleway", Font.BOLD, 18));
        done.addActionListener(this);
        image.add(done);
        // Default
        setLayout(null);
        setSize(800, 600);
        setLocation(250, 150);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==back){
            System.exit(0);
        }
        else if(ae.getSource()==done){
            String Name=namefield.getText();
            String Phone=phonefield.getText();
            String Timing=timingfield.getText();
            String Cause=causefield.getText();
            String Payment=paymentfield.getText();
            try{
                HospitalManagementSystem conn=new HospitalManagementSystem();
                String query="insert into Appointment values()";
                conn.state.executeUpdate(query);
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[]args){
        new Appointment();
    }
}
