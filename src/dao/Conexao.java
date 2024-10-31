
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {
    
    String url,user,password;
    Connection con;
    
    public Conexao(){
    
        url="jdbc:postgresql://localhost:5432/biblioteca";
        user="postgres";
        password="123456";
        
        try {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao estabelecer conexão,Erro: "+e);
        }
    }
    public Connection obterConexao(){
        return con;
    }
    
    
    
    
}
