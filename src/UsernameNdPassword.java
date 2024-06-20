import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class UsernameNdPassword extends JFrame implements ActionListener {
    JLabel username, password, confirm;
    JButton save, back;
    JTextField usernamefield;
    JPasswordField passwordfield, confirmfield;
    long ran;

    public UsernameNdPassword(long ran) {
        this.ran = ran;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/pexels-scottwebb-311458.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
        // Username
        username = new JLabel("UserName:");
        username.setBounds(100, 100, 200, 30);
        username.setForeground(Color.black);
        username.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(username);
        // username Textfield
        usernamefield = new JTextField();
        usernamefield.setBounds(350, 100, 200, 30);
        image.add(usernamefield);
        // Password
        password = new JLabel("Password:");
        password.setBounds(100, 150, 200, 30);
        password.setForeground(Color.black);
        password.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(password);
        // password Textfield
        passwordfield = new JPasswordField();
        passwordfield.setBounds(350, 150, 200, 30);
        image.add(passwordfield);
        // Password
        confirm = new JLabel("Re-Enter:");
        confirm.setBounds(100, 205, 200, 30);
        confirm.setForeground(Color.black);
        confirm.setFont(new Font("Arial", Font.BOLD, 20));
        image.add(confirm);
        // password Textfield
        confirmfield = new JPasswordField();
        confirmfield.setBounds(350, 205, 200, 30);
        image.add(confirmfield);
        // Button
        save = new JButton("Save");
        save.setBackground(Color.black);
        save.setForeground(Color.white);
        save.setBounds(450, 270, 100, 30);
        save.setFont(new Font("Raleway", Font.BOLD, 20));
        image.add(save);
        save.addActionListener(this);
        // Back
        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(100, 270, 100, 30);
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        image.add(back);
        back.addActionListener(this);
        // Default
        setLayout(null);
        setSize(800, 600);
        setLocation(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    public UsernameNdPassword(String string) {
        // TODO Auto-generated constructor stub
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            System.exit(0);
        } else if (ae.getSource() == save) {
            String formno = "" + ran;
            String Username = usernamefield.getText();
            String Password = passwordfield.getText();
            String Confirm = confirmfield.getText();
            if (!Password.equals(Confirm)) {
                JOptionPane.showMessageDialog(rootPane, "Password Not Matched");
                return;
            } else if (Password.equals("") || Confirm.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Please Enter the Password");
                return;
            } 
            else if(Password.length()<8||Password.length()>16||Confirm.length()<8||Confirm.length()>16){
                JOptionPane.showMessageDialog(rootPane, "Password Length Should be 8-16");
            }else if (Password.equals(Confirm)) {
                try {
                    HospitalManagementSystem conn = new HospitalManagementSystem();
                    String query = "insert into UsernamePassword values('" + formno + "','" + Username + "','"
                            + Password + "')";
                    conn.state.executeUpdate(query);
                    JOptionPane.showMessageDialog(rootPane, "Data Inserted Succesfully");

                    System.exit(0);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new UsernameNdPassword("");
    }
}
