/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_java_2;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dhias
 */
public class MyConnection {
    public static   Connection getConnection(){
            Connection con=null;
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/projet_java","root","");
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }return con;
    }
    
}
