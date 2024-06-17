import javax.swing.*;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class Patient extends JFrame implements ActionListener {
    JLabel PatientID, name, ID, phone, email, room, cause, addmissionDate, gaurdian, card;
    JTextField patientId,namefield, emailfield, phonefield, causefield, datefield, gaurdianfield, cardfield;
    JComboBox idfield, roomfield;
    JButton logout, confirm;
    JDateChooser addmissiondatechooser;

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
        namefield.setBounds(250, 20, 250, 30);
        image.add(namefield);
        // Patient Id
        PatientID = new JLabel("Patient's ID: ");
        PatientID.setFont(new Font("Arial", Font.BOLD, 20));
        PatientID.setForeground(Color.black);
        PatientID.setBounds(25, 20, 180, 30);
        image.add(name);
        patientId = new JTextField();
        patientId.setFont(new Font("Arial", Font.PLAIN, 18));
        patientId.setBounds(250, 20, 250, 30);
        image.add(patientId);
        // ID
        ID = new JLabel("Patient's ID: ");
        ID.setFont(new Font("Arial", Font.BOLD, 20));
        ID.setForeground(Color.black);
        ID.setBounds(25, 60, 180, 30);
        image.add(ID);
        String data[] = { "Aadhar Card", "Pan Card", "Voter Card", "Passport", "Driving License" };
        idfield = new JComboBox(data);
        idfield.setFont(new Font("Arial", Font.BOLD, 18));
        idfield.setBounds(250, 60, 250, 30);
        image.add(idfield);
        // Card
        card = new JLabel("Card Number: ");
        card.setFont(new Font("Arial", Font.BOLD, 20));
        card.setForeground(Color.black);
        card.setBounds(25, 100, 180, 30);
        image.add(card);
        cardfield = new JTextField();
        cardfield.setFont(new Font("Arial", Font.PLAIN, 18));
        cardfield.setBounds(250, 100, 250, 30);
        image.add(cardfield);
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

        // cause
        cause = new JLabel("Addmit Reason: ");
        cause.setFont(new Font("Arial", Font.BOLD, 20));
        cause.setForeground(Color.black);
        cause.setBounds(25, 220, 180, 30);
        image.add(cause);
        causefield = new JTextField();
        causefield.setFont(new Font("Arial", Font.PLAIN, 18));
        causefield.setBounds(250, 220, 250, 30);
        image.add(causefield);
        // room
        room = new JLabel("Room Number: ");
        room.setFont(new Font("Arial", Font.BOLD, 20));
        room.setForeground(Color.black);
        room.setBounds(25, 260, 180, 30);
        image.add(room);
        String roomnumber[] = { "101", "102", "103", "104", "105", "201", "202", "203", "204", "205", "301", "302",
                "303", "304", "305", "401", "402", "403", "404", "405", "501", "502", "503", "504", "505" };
        roomfield = new JComboBox(roomnumber);
        roomfield.setFont(new Font("Arial", Font.BOLD, 18));
        roomfield.setBounds(250, 260, 250, 30);
        image.add(roomfield);
        // date
        addmissionDate = new JLabel("Date of Addmission");
        addmissionDate.setBounds(25, 300, 200, 30);
        addmissionDate.setFont(new Font("Arial", Font.BOLD, 20));
        addmissionDate.setForeground(Color.black);
        image.add(addmissionDate);
        addmissiondatechooser = new JDateChooser();
        addmissiondatechooser.setBounds(250, 300, 250, 30);
        image.add(addmissiondatechooser);
        // Gurdian
        gaurdian = new JLabel("Guardian: ");
        gaurdian.setFont(new Font("Arial", Font.BOLD, 20));
        gaurdian.setForeground(Color.black);
        gaurdian.setBounds(25, 350, 180, 30);
        image.add(gaurdian);
        gaurdianfield = new JTextField();
        gaurdianfield.setFont(new Font("Arial", Font.PLAIN, 18));
        gaurdianfield.setBounds(250, 350, 250, 30);
        image.add(gaurdianfield);
        // patient id
        PatientID = new JLabel("Patient's ID: ");
        PatientID.setFont(new Font("Arial", Font.BOLD, 20));
        PatientID.setForeground(Color.black);
        PatientID.setBounds(25, 390, 180, 30);
        image.add(PatientID);
        patientId = new JTextField();
        patientId.setFont(new Font("Arial", Font.PLAIN, 18));
        patientId.setBounds(250, 390, 250, 30);
        image.add(patientId);
        // Logout
        logout = new JButton("Logout");
        logout.setBounds(30, 550, 150, 40);
        logout.setFont(new Font("Arial", Font.BOLD, 20));
        logout.setForeground(Color.white);
        logout.setBackground(Color.black);
        image.add(logout);
        logout.addActionListener(this);
        // Confirm
        confirm = new JButton("Confirm");
        confirm.setBounds(400, 550, 150, 40);
        confirm.setFont(new Font("Arial", Font.BOLD, 20));
        confirm.setForeground(Color.white);
        confirm.setBackground(Color.black);
        image.add(confirm);
        confirm.addActionListener(this);
        // Default
        setTitle("Patient Details");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocation(250, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == logout) {
            System.exit(0);
        }
        else if (ae.getSource() == confirm) {
            // JLabel name, ID, phone, email, room, cause, addmissionDate,realseDate,
            // gaurdian, card;
            String PatientIDS=patientId.getText();
            String Name = namefield.getText();
            String sidfield = (String) idfield.getSelectedItem();
            String Card = cardfield.getText();
            String Phone = phonefield.getText();
            String Email = emailfield.getText();
            String Room = (String) roomfield.getSelectedItem();
            String Cause = causefield.getText();
            String Addmission = ((JTextField) addmissiondatechooser.getDateEditor().getUiComponent()).getText();
            String Guardian = gaurdianfield.getText();
            try {
                HospitalManagementSystem conn = new HospitalManagementSystem();
                String query = "insert into HospitalManagementSystem values('"+PatientIDS+"','" + Name + "','" + sidfield + "','" + Card
                        + "','" + Phone + "','" + Email + "','" + Room + "','" + Cause + "','" + Addmission + "','" + Guardian + "')";
                conn.state.executeUpdate(query);
                JOptionPane.showMessageDialog(phone, "Patient Added Succesfully");
                System.exit(0);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Patient();
    }
}
