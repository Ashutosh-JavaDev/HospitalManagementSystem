import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class Patient extends JFrame implements ActionListener {
    JLabel name, ID, phone, email, room, cause, date, gaurdian, card;
    JTextField namefield, emailfield, phonefield, causefield, datefield, gaurdianfield, cardfield;
    JComboBox idfield, roomfield;

    Patient() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
        // Name
        name = new JLabel("Patient's Name: ");
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setForeground(Color.black);
        name.setBounds(25, 20, 180, 30);
        image.add(name);
        namefield = new JTextField();
        namefield.setFont(new Font("Arial", Font.PLAIN, 18));
        namefield.setBounds(225, 20, 200, 30);
        image.add(namefield);
        // ID
        ID = new JLabel("Patient's ID: ");
        ID.setFont(new Font("Arial", Font.BOLD, 20));
        ID.setForeground(Color.black);
        ID.setBounds(25, 60, 180, 30);
        image.add(ID);
        String data[] = { "Aadhar Card", "Pan Card", "Voter Card", "Passport", "Driving License" };
        idfield = new JComboBox(data);
        idfield.setFont(new Font("Arial", Font.BOLD, 18));
        idfield.setBounds(225, 60, 200, 30);
        image.add(idfield);
        // Card
        card = new JLabel("Card Number: ");
        card.setFont(new Font("Arial", Font.BOLD, 20));
        card.setForeground(Color.black);
        card.setBounds(25, 100, 180, 30);
        image.add(card);
        cardfield = new JTextField();
        cardfield.setFont(new Font("Arial", Font.PLAIN, 18));
        cardfield.setBounds(225, 100, 200, 30);
        image.add(cardfield);
        // Phone
        phone = new JLabel("Phone Number: ");
        phone.setFont(new Font("Arial", Font.BOLD, 20));
        phone.setForeground(Color.black);
        phone.setBounds(25, 140, 180, 30);
        image.add(phone);
        phonefield = new JTextField();
        phonefield.setFont(new Font("Arial", Font.PLAIN, 18));
        phonefield.setBounds(225, 140, 200, 30);
        image.add(phonefield);
        // Email
        email = new JLabel("Email ID: ");
        email.setFont(new Font("Arial", Font.BOLD, 20));
        email.setForeground(Color.black);
        email.setBounds(25, 180, 180, 30);
        image.add(email);
        emailfield = new JTextField();
        emailfield.setFont(new Font("Arial", Font.PLAIN, 18));
        emailfield.setBounds(225, 180, 200, 30);
        image.add(emailfield);
        // room
        room = new JLabel("Room Number: ");
        room.setFont(new Font("Arial", Font.BOLD, 20));
        room.setForeground(Color.black);
        room.setBounds(25, 180, 180, 30);
        image.add(room);
        String roomnumber[] = { "101", "102", "103", "104", "105", "201", "202", "203", "204", "205", "301", "302",
                "303", "304", "305", "401", "402", "403", "404", "405", "501", "502", "503", "504", "505" };
        roomfield = new JComboBox(roomnumber);
        roomfield.setFont(new Font("Arial", Font.PLAIN, 18));
        roomfield.setBounds(225, 180, 200, 30);
        image.add(roomfield);
        // cause
        cause = new JLabel("Addmit Reason: ");
        cause.setFont(new Font("Arial", Font.BOLD, 20));
        cause.setForeground(Color.black);
        cause.setBounds(25, 220, 180, 30);
        image.add(cause);
        causefield = new JTextField();
        causefield.setFont(new Font("Arial", Font.PLAIN, 18));
        causefield.setBounds(225, 220, 200, 30);
        image.add(causefield);
        // date
        date = new JLabel("Addmit Date: ");
        date.setFont(new Font("Arial", Font.BOLD, 20));
        date.setForeground(Color.black);
        date.setBounds(25, 180, 180, 30);
        image.add(email);
        emailfield = new JTextField();
        emailfield.setFont(new Font("Arial", Font.PLAIN, 18));
        emailfield.setBounds(225, 180, 200, 30);
        image.add(emailfield);
        // Default
        setTitle("Patient Details");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocation(250, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new Patient();
    }
}
