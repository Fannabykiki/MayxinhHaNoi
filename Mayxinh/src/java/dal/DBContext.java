/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {

    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
 /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber
                + ";databaseName=" + dbName;//+"; integratedSecurity=true";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
//        return DriverManager.getConnection(url);
    }

    /*Insert your other code right after this comment*/

 /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private final String serverName = "DESKTOP-VGNG77U\\FANNABY";
    private final String dbName = "banhang";
    private final String portNumber = "1433";
    private final String userID = "sa";
    private final String password = "123";

    public static void main(String[] args) {
        DBContext dBContext = new DBContext();
        try {
            System.out.println("Thanh Cong");
            System.out.println(dBContext.getConnection());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
