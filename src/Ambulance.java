import javax.swing.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ambulance extends JFrame implements ActionListener {
    JLabel name, start, arrive, cause, phone;
    JTextField namefield, startfield, causefield, arrivefield, phonefield;
    JButton confirm,back;

    public Ambulance() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
        // Name
        name = new JLabel("Name:");
        name.setBounds(25, 50, 150, 30);
        name.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(name);
        // Name field
        namefield = new JTextField();
        namefield.setBounds(250, 50, 150, 30);
        namefield.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(namefield);
        // start
        start = new JLabel("Pickup Point:");
        start.setBounds(25, 120, 150, 30);
        start.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(start);
        // Startfield
        startfield = new JTextField();
        startfield.setBounds(250, 120, 150, 30);
        startfield.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(startfield);
        // end
        arrive = new JLabel("Arriving Point:");
        arrive.setBounds(25, 190, 150, 30);
        arrive.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(arrive);
        // Startfield
        arrivefield = new JTextField();
        arrivefield.setBounds(250, 190, 150, 30);
        arrivefield.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(arrivefield);
        // start
        cause = new JLabel("Cause:");
        cause.setBounds(25, 260, 150, 50);
        cause.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(cause);
        // Startfield
        causefield = new JTextField();
        causefield.setBounds(250, 260, 150, 30);
        causefield.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(causefield);
        // start
        phone = new JLabel("Phone No.:");
        phone.setBounds(25, 330, 150, 30);
        phone.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(phone);
        // Startfield
        phonefield = new JTextField();
        phonefield.setBounds(250, 330, 150, 30);
        phonefield.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(phonefield);
        // JButton
        confirm=new JButton("Confirm");
        confirm.setBounds(400,400,100,30);
        confirm.setBackground(Color.black);
        confirm.setForeground(Color.white);
        confirm.setFont(new Font("Raleway",Font.BOLD,20));
        confirm.addActionListener(this);
        image.add(confirm);
        // back
        back=new JButton("Back");
        back.setBounds(25,400,100,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(new Font("Raleway",Font.BOLD,20));
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
        if(ae.getSource()==back){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Ambulance();
    }
}
