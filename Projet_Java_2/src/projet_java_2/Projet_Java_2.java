
package projet_java_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Projet_Java_2 {

    public static void main(String[] args) {
        
        try {
        Connection conn = MyConnection.connect();
        PreparedStatement ps;
        String query="INSERT INTO `utilisateur`(`login`, `password`) VALUES (?,?)";
        ps=conn.prepareStatement(query);
        ps.setString(1,"aymen");
        ps.setString(2, "kefi");        
        ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
       

        

    }
    
}
