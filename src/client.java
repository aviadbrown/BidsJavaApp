
import java.sql.Connection;
import java.sql.Date;
import java.lang.Integer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.get;

public class client {
    public void insertUpdateDeleteClient(char operation, Integer id, String fname, String lname,
            String address, String mphone, String hphone, String comments, String dateAdded)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps1, ps2, ps3;
        
        // i for insert
        if (operation == 'i')
        {
            try {
                ps1 = con.prepareStatement("INSERT INTO person(first_name,"
                        + " c_last_name, m_phone, h_phone, date_added, address, comments) VALUES (?,?,?,?,?,?,?)");
                ps1.setString(1, fname);
                ps1.setString(2, lname);
                ps1.setString(3, mphone);
                ps1.setString(4, hphone);
                ps1.setString(5, dateAdded);
                ps1.setString(6, address);
                ps1.setString(7, comments);     
            
                int valid1,valid2;
                valid1 = ps1.executeUpdate();
                if(valid1>0)
                { 
                    ps2 = con.prepareStatement("INSERT INTO client(p_id) VALUES (LAST_INSERT_ID())");
                    valid2 = ps2.executeUpdate();
                    if(valid2>0)
                    {
                        JOptionPane.showMessageDialog(null, "New Student Added");
                        return;
                    }
                }          
                
            } catch (SQLException ex) {
                handleError.showErrorMessage(true, "Adding was unsuccessful", null);
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
            }    
            
        }
    }
}