import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.jar.Attributes.Name;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

public class Employee extends JFrame implements ActionListener {
    JLabel name, proffesion, ID, email, phone, IDnumber, doj, maritial;
    JTextField namefield, emailfield, phonefield, idnumberfield;
    JRadioButton Single,Married,Divorsed;
    JComboBox proffesionfield, idfieldsbox;
    JDateChooser dojfield;
    JButton save,back;
    Random random=new Random();
    long ran;
    public Employee() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
        // Random
        ran = Math.abs(random.nextLong() % 9000L + 1000);
        JLabel form = new JLabel("Form No.: " + ran);
        form.setBounds(250, 10, 350, 35);
        form.setFont(new Font("Rubik", Font.BOLD, 30));
        image.add(form);
        // Name
        name = new JLabel("Employee's Name: ");
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setForeground(Color.black);
        name.setBounds(25, 70, 200, 30);
        image.add(name);
        namefield = new JTextField();
        namefield.setFont(new Font("Arial", Font.PLAIN, 18));
        namefield.setBounds(300, 70, 250, 30);
        image.add(namefield);
        // Patient Id
        ID = new JLabel("Employee's ID: ");
        ID.setFont(new Font("Arial", Font.BOLD, 20));
        ID.setForeground(Color.black);
        ID.setBounds(25, 110, 180, 30);
        image.add(ID);
        String data[] = { "Aadhar Card", "Pan Card", "Voter Card", "Passport", "Driving License" };
        idfieldsbox = new JComboBox(data);
        idfieldsbox.setFont(new Font("Arial", Font.BOLD, 18));
        idfieldsbox.setBounds(300, 110, 250, 30);
        image.add(idfieldsbox);
        // Card
        IDnumber = new JLabel("Card Number: ");
        IDnumber.setFont(new Font("Arial", Font.BOLD, 20));
        IDnumber.setForeground(Color.black);
        IDnumber.setBounds(25, 150, 180, 30);
        image.add(IDnumber);
        idnumberfield = new JTextField();
        idnumberfield.setFont(new Font("Arial", Font.PLAIN, 18));
        idnumberfield.setBounds(300, 150, 250, 30);
        image.add(idnumberfield);
        // Phone
        phone = new JLabel("Phone Number: ");
        phone.setFont(new Font("Arial", Font.BOLD, 20));
        phone.setForeground(Color.black);
        phone.setBounds(25, 190, 180, 30);
        image.add(phone);
        phonefield = new JTextField();
        phonefield.setFont(new Font("Arial", Font.PLAIN, 18));
        phonefield.setBounds(300, 190, 250, 30);
        image.add(phonefield);
        // Email
        email = new JLabel("Email ID: ");
        email.setFont(new Font("Arial", Font.BOLD, 20));
        email.setForeground(Color.black);
        email.setBounds(25, 230, 180, 30);
        image.add(email);
        emailfield = new JTextField();
        emailfield.setFont(new Font("Arial", Font.PLAIN, 18));
        emailfield.setBounds(300, 230, 250, 30);
        image.add(emailfield);
        // Proffesion Field
        proffesion = new JLabel("Role: ");
        proffesion.setFont(new Font("Arial", Font.BOLD, 20));
        proffesion.setForeground(Color.black);
        proffesion.setBounds(25, 270, 180, 30);
        image.add(proffesion);
        String datas[] = { "Assistant Doctor", "Junior Doctor", "Senior Doctor", "Nurse", "Receptionist","Sweaper" };
        proffesionfield = new JComboBox(datas);
        proffesionfield.setFont(new Font("Arial", Font.BOLD, 18));
        proffesionfield.setBounds(300, 270, 250, 30);
        image.add(proffesionfield);
        // Date of Joining
        doj=new JLabel("Date of Joining");
        doj.setBounds(25,310,250,30);
        doj.setFont(new Font("Arial", Font.BOLD, 20));
        doj.setForeground(Color.black);
        image.add(doj);
        dojfield=new JDateChooser();
        dojfield.setBounds(300,310,250,30);
        image.add(dojfield);
        // Status
        maritial=new JLabel("Maratial Status");
        maritial.setBounds(25,350,200,30);
        maritial.setFont(new Font("Arial", Font.BOLD, 20));
        maritial.setForeground(Color.black);
        image.add(maritial);
        Single=new JRadioButton("Single");
        Single.setBackground(Color.white);
        Single.setBounds(300,350,100,30);
        image.add(Single);
        // Unmaaried
        Married=new JRadioButton("Married");
        Married.setBounds(375,350,100,30);
        Married.setBackground(Color.white);
        image.add(Married);
        // Divorsed
        Divorsed=new JRadioButton("Divorsed");
        Divorsed.setBounds(500,350,100,30);
        Divorsed.setBackground(Color.white);
        image.add(Divorsed);
        // Group
        ButtonGroup group=new ButtonGroup();
        group.add(Single);
        group.add(Married);
        group.add(Divorsed);
        // Back
        back=new JButton("Back");
        back.setBounds(50,400,100,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(back);
        back.addActionListener(this);
        // Save
        save=new JButton("Next");
        save.setBounds(450,400,100,30);
        save.setBackground(Color.black);
        save.setForeground(Color.white);
        save.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(save);
        save.addActionListener(this);
        // Default Information
        setLayout(null);
        setTitle("Employee Entry");
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
        else if(ae.getSource()==save){
            String formno=" "+ran;
            String Name=namefield.getText();
            String IDnumber=idnumberfield.getText();
            String email=emailfield.getText();
            String phone=phonefield.getText();
            String Status=null;
            if(Single.isSelected()){
                Status="Single";
            }
            else if(Married.isSelected()){
                Status="Married";
            }
            else if(Divorsed.isSelected()){
                Status="Divorsed";
            }
            String IDproof=(String)idfieldsbox.getSelectedItem();
            String Professionfield=(String)proffesionfield.getSelectedItem();
            String Joining=((JTextField)dojfield.getDateEditor().getUiComponent()).getText();
            try{
                HospitalManagementSystem conn=new HospitalManagementSystem();
                String query="insert into Employee values('"+formno+"','"+Name+"','"+IDproof+"','"+IDnumber+"','"+phone+"','"+email+"','"+Professionfield+"','"+Joining+"','"+Status+"')";
                conn.state.executeUpdate(query);
                JOptionPane.showMessageDialog(rootPane, "Data Inserted Succesfully");
                if(Professionfield.equals("Senior Doctor")||Professionfield.equals("Receptionist")){
                    setVisible(false);
                    new UsernameNdPassword(ran).setVisible(true);
                }
                else{
                    System.exit(0);
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Employee();
    }
}
