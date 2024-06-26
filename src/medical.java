import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import java.sql.SQLException;
public class medical extends JFrame implements ActionListener{
    JLabel consulation,DoctorsNotes,diagnostic,treatement,prescription,surgery,immunization;
    JTextField consultfield,notesfield,diagnosticfield,treatementfield,prescriptionfield,surgeryfield,immmunizatonfield;
    public medical(){

    }
    public void actionPerformed(ActionEvent ae){

    }
    public  static void main(String[]args){
        new medical();
    }
}
