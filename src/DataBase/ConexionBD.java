
package DataBase;

import java.sql.*;

public class ConexionBD {
    Connection cn;
    public Connection conexion(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn= DriverManager.getConnection("jdbc:mysql://localhost/sistema","root","");
            System.out.println("Ingreso al sistema");
    }catch(Exception e){
            System.out.println(e.getMessage());
    }return cn;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
        
    }
    
    
}
