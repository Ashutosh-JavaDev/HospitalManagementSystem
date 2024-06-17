import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;
public class HospitalManagementSystem {
    Connection conn;
    Statement state;
    public HospitalManagementSystem()throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException ae){
            JOptionPane.showMessageDialog(null, ae, "Class Not Found", JOptionPane.ERROR_MESSAGE);
        }
    }
}
