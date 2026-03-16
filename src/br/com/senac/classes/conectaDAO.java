package br.com.senac.classes;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {
    
    public Connection connectDB(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost/uc11?useSSL=false";
            String user = "root";
            String senha = "root";
            
            conn = DriverManager.getConnection(url, user, senha);
            System.out.println("Conectado com sucesso!");
            
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO" + erro.getMessage());
        }
        return conn;
    }
    
}
