package projet_java_2;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Driver;
import static  java.lang.Class.forName;
import java.sql.SQLException;


public class MyConnection {

    public static   Connection Connect(){
          Connection con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/projet_java","root","");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
        }return con;
    }

    
}
