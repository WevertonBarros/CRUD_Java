package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author weverton
 */
public class ConnectionDAO {
    
    public Connection connectDB(){
        
        Connection conn = null ;
    
        try {
            
            String url = "jdbc:mysql://localhost:3306/database?user=root&password=123";
            conn = DriverManager.getConnection(url) ;
                    
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, erro.getMessage());
            
        }
        return conn ;
    }   
    
    
}
