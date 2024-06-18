import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.Attributes.Name;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;

public class Employee extends JFrame implements ActionListener {
    JLabel name, proffesion, ID, email, phone, IDnumber, doj, maritial;
    JTextField namefield, idfield, emailfield, phonefield, idnumberfield, statusfield;
    JComboBox proffesionfield, idfieldsbox;
    JDateChooser dojfield;

    public Employee() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
        // Name
        name = new JLabel("Employee's Name: ");
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setForeground(Color.black);
        name.setBounds(25, 20, 200, 30);
        image.add(name);
        namefield = new JTextField();
        namefield.setFont(new Font("Arial", Font.PLAIN, 18));
        namefield.setBounds(250, 20, 250, 30);
        image.add(namefield);
        // Patient Id
        ID = new JLabel("Employee's ID: ");
        ID.setFont(new Font("Arial", Font.BOLD, 20));
        ID.setForeground(Color.black);
        ID.setBounds(25, 60, 180, 30);
        image.add(ID);
        String data[] = { "Aadhar Card", "Pan Card", "Voter Card", "Passport", "Driving License" };
        idfieldsbox = new JComboBox(data);
        idfieldsbox.setFont(new Font("Arial", Font.BOLD, 18));
        idfieldsbox.setBounds(250, 60, 250, 30);
        image.add(idfieldsbox);
        // Card
        IDnumber = new JLabel("Card Number: ");
        IDnumber.setFont(new Font("Arial", Font.BOLD, 20));
        IDnumber.setForeground(Color.black);
        IDnumber.setBounds(25, 100, 180, 30);
        image.add(IDnumber);
        idnumberfield = new JTextField();
        idnumberfield.setFont(new Font("Arial", Font.PLAIN, 18));
        idnumberfield.setBounds(250, 100, 250, 30);
        image.add(idnumberfield);
        // Phone
        phone = new JLabel("Phone Number: ");
        phone.setFont(new Font("Arial", Font.BOLD, 20));
        phone.setForeground(Color.black);
        phone.setBounds(25, 140, 180, 30);
        image.add(phone);
        phonefield = new JTextField();
        phonefield.setFont(new Font("Arial", Font.PLAIN, 18));
        phonefield.setBounds(250, 140, 250, 30);
        image.add(phonefield);
        // Email
        email = new JLabel("Email ID: ");
        email.setFont(new Font("Arial", Font.BOLD, 20));
        email.setForeground(Color.black);
        email.setBounds(25, 180, 180, 30);
        image.add(email);
        emailfield = new JTextField();
        emailfield.setFont(new Font("Arial", Font.PLAIN, 18));
        emailfield.setBounds(250, 180, 250, 30);
        image.add(emailfield);
        // Proffesion Field
        proffesion = new JLabel("Role: ");
        proffesion.setFont(new Font("Arial", Font.BOLD, 20));
        proffesion.setForeground(Color.black);
        proffesion.setBounds(25, 220, 180, 30);
        image.add(proffesion);
        String datas[] = { "Assistant Doctor", "Junior Doctor", "Senior Doctor", "Nurse", "Receptionist","Sweaper" };
        idfieldsbox = new JComboBox(datas);
        idfieldsbox.setFont(new Font("Arial", Font.BOLD, 18));
        idfieldsbox.setBounds(250, 220, 250, 30);
        image.add(idfieldsbox);
        // Default Information
        setLayout(null);
        setTitle("Employee Entry");
        setSize(800, 600);
        setLocation(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new Employee();
    }
}
