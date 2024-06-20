import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class UsernameNdPassword extends JFrame implements ActionListener{
    JLabel username,password;
    JButton save;
    JTextField usernamefield;
    JPasswordField passwordfield;
    UsernameNdPassword(){

    }   
    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String[]args){
        new UsernameNdPassword();
    }
}
