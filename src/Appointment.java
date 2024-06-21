import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
public class Appointment extends JFrame implements ActionListener {
    public Appointment(){
        //Default
        setLayout(null);
        setSize(800,600);
        setLocation(250,150);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

    }
}
