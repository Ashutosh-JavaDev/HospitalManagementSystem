import javax.swing.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ambulance extends JFrame implements ActionListener {
    JLabel name, start, arrive, cause, phone, ambluancenumber, driver;
    JTextField namefield, startfield, causefield, arrivefield, phonefield, ambluancenumberfield, driverfield;
    JButton confirm, back;

    public Ambulance() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
        JLabel titile = new JLabel("Ambluance Service");
        titile.setBounds(300, 10, 300, 40);
        titile.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(titile);
        // Name
        name = new JLabel("Name:");
        name.setBounds(25, 70, 200, 30);
        name.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(name);
        // Name field
        namefield = new JTextField();
        namefield.setBounds(250, 70, 200, 30);
        namefield.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(namefield);
        // start
        start = new JLabel("Pickup Point:");
        start.setBounds(25, 120, 200, 30);
        start.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(start);
        // Startfield
        startfield = new JTextField();
        startfield.setBounds(250, 120, 200, 30);
        startfield.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(startfield);
        // end
        arrive = new JLabel("Destination Point:");
        arrive.setBounds(25, 170, 200, 30);
        arrive.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(arrive);
        // Startfield
        arrivefield = new JTextField();
        arrivefield.setBounds(250, 170, 200, 30);
        arrivefield.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(arrivefield);
        // cause
        cause = new JLabel("Cause:");
        cause.setBounds(25, 220, 200, 30);
        cause.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(cause);
        // cause field
        causefield = new JTextField();
        causefield.setBounds(250, 220, 200, 30);
        causefield.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(causefield);
        // phone
        phone = new JLabel("Phone No.:");
        phone.setBounds(25, 270, 200, 30);
        phone.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(phone);
        // phonefield
        phonefield = new JTextField();
        phonefield.setBounds(250, 270, 200, 30);
        phonefield.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(phonefield);
        // driver
        driver = new JLabel("Driver Name.:");
        driver.setBounds(25, 320, 200, 30);
        driver.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(driver);
        // driver field
        driverfield = new JTextField();
        driverfield.setBounds(250, 320, 200, 30);
        driverfield.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(driverfield);
        // ambluance
        ambluancenumber = new JLabel("Ambluance No:");
        ambluancenumber.setBounds(25, 370, 200, 30);
        ambluancenumber.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(ambluancenumber);
        // ambluance field
        ambluancenumberfield = new JTextField();
        ambluancenumberfield.setBounds(250, 370, 200, 30);
        ambluancenumberfield.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(ambluancenumberfield);
        // JButton
        confirm = new JButton("Confirm");
        confirm.setBounds(400, 420, 150, 30);
        confirm.setBackground(Color.black);
        confirm.setForeground(Color.white);
        confirm.setFont(new Font("Raleway", Font.BOLD, 20));
        confirm.addActionListener(this);
        image.add(confirm);
        // back
        back = new JButton("Back");
        back.setBounds(25, 420, 100, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.addActionListener(this);
        image.add(back);
        // Default
        setLayout(null);
        setTitle("Ambluance");
        setSize(800, 600);
        setLocation(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            System.exit(0);
        }
        else if(ae.getSource()==confirm){
            String Name=namefield.getText();
            String Start=startfield.getText();
            String Arrive=arrivefield.getText();
            String Cause=causefield.getText();
            String Phone=phonefield.getText();
            String DriverName=driverfield.getText();
            String AmbluanceNumber=ambluancenumberfield.getText();
            try{
                HospitalManagementSystem conn=new HospitalManagementSystem();
                String query="select*from Employee where Employee_Name='"+DriverName+"'";
                ResultSet result=conn.state.executeQuery(query);
                if(result.next()){
                    String query2="insert into Ambluance values('"+Name+"','"+Start+"','"+Arrive+"','"+Cause+"','"+Phone+"','"+DriverName+"','"+AmbluanceNumber+"')";
                    conn.state.executeUpdate(query2);
                    JOptionPane.showMessageDialog(phone, "Data Updated Succesfully");
                    System.exit(0);
                }
                else{
                    JOptionPane.showMessageDialog(phone, "This  Driver is not in Your List");
                    return;
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Ambulance();
    }
}
