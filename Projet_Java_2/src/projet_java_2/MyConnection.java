/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_java_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Driver; 
import static java.lang.Class.forName;
import java.sql.SQLException;

/**
 *
 * @author dhias
 */
public class MyConnection {


    
    public static Connection connect()
    {
      Connection con=null;
      try {

      Class.forName("com.mysql.cj.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projetjava?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root","");

      }catch (SQLException | ClassNotFoundException e){
          System.out.println("ERROR "+e.getMessage());
      }

      return con;

    }
        
    
            
        

   
}
