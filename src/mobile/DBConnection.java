/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class DBConnection {
    public static Connection getConnection () {

Connection conn = null;

try {

Class.forName("com.mysql.jdbc.Driver");
 
 conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop","root","");

} catch (Exception ex) {

System.out.println (ex.getMessage());
}
return conn;

}

}
    

