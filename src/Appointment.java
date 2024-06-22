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
        newPatient.setBounds(150, 20, 250, 35);
        newPatient.setFont(new Font("Arial", Font.BOLD, 25));
        image.add(newPatient);
        // Name
        name = new JLabel("Patient's Name");
        name.setBounds(25, 100, 200, 20);
        name.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(name);
        // Name filed
        namefield = new JTextField();
        namefield.setBounds(200, 100, 250, 20);
        namefield.setFont(new Font("Raleway", Font.BOLD, 18));
        image.add(namefield);
        // Phone
        phone = new JLabel("Phone Number");
        phone.setBounds(25, 130, 200, 20);
        phone.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(phone);
        // phone filed
        phonefield = new JTextField();
        phonefield.setBounds(200, 130, 250, 20);
        phonefield.setFont(new Font("Raleway", Font.BOLD, 18));
        image.add(phonefield);
        // timing
        timing = new JLabel("Timing");
        timing.setBounds(25, 160, 200, 20);
        timing.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(timing);
        // timing filed
        timingfield = new JTextField();
        timingfield.setBounds(200, 160, 250, 20);
        timingfield.setFont(new Font("Raleway", Font.BOLD, 18));
        image.add(timingfield);
        // cause
        cause = new JLabel("Cause");
        cause.setBounds(25, 190, 200, 20);
        cause.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(cause);
        // cause filed
        causefield = new JTextField();
        causefield.setBounds(200, 190, 250, 20);
        causefield.setFont(new Font("Raleway", Font.BOLD, 18));
        image.add(causefield);
        // payment
        payment = new JLabel("Payment");
        payment.setBounds(25, 220, 200, 20);
        payment.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(payment);
        // paymment filed
        paymentfield = new JTextField();
        paymentfield.setBounds(200, 220, 250, 20);
        paymentfield.setFont(new Font("Raleway", Font.BOLD, 18));
        image.add(paymentfield);
        // Jbutton
        back=new JButton("Back");
        back.setBounds(25,400,100,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        image.add(back);
        // Done
        done=new JButton("Done");
        done.setBounds(200,400,100,30);
        done.setBackground(Color.black);
        done.setForeground(Color.white);
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
    }
    public static void main(String[]args){
        new Appointment();
    }
}
