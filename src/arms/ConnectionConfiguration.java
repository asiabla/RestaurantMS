/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arms;

/**
 *
 * @author Joanna
 */

import java.sql.*;

public class ConnectionConfiguration {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, user, password);
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        return conn;
    }
    private final static String url = "jdbc:mysql://localhost:3306/arms?useSSL=false";
    private final static String user = "root";
    private final static String password = "";
    private final static String driver = "com.mysql.jdbc.Driver";

}