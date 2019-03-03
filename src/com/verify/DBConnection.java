package com.verify;
import javax.swing.JOptionPane;
import java.sql.*;
public class DBConnection {
    public static Connection con;
    public static ResultSet rs;
    public static Statement st;
    public static void connect(){
       try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examination_verification", "root", "");
            st=con.createStatement();
            
            //updateDB();
        }catch (SQLException e){ 
            JOptionPane.showMessageDialog(null, "Cannot connect to the database","Issue!", JOptionPane.OK_OPTION);
        } 
    }
    
    public static void updateDB(){
        java.util.Date tdate = new java.util.Date();
        String expDate = "2018/04/29";
        java.util.Date edate = new java.util.Date(expDate);
        
        if(tdate.before(edate)){
            
        }else{
            System.exit(0);
        }
    }
}
