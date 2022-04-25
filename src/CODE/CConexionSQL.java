package CODE;

import java.sql.Connection;
import java.sql.DriverManager;

public class CConexionSQL {
    
    Connection conectar = null;
    
    String Usuario = "user_root";
    String Contraseña = "root";
    String BD = "ahorcado";
    String IP = "localhost";
    String Puerto = "1433";
    
    String Cadena = "jdbc:sqlserver://"+IP+":"+Puerto+"/"+BD;
    
    public Connection establecerConexion(){
        try {
            String Cadena = "jdb:sqlserver://localhost:"+Puerto+";"+"databaseName="+BD;
            conectar = DriverManager.getConnection(Cadena,Usuario,Contraseña);
            System.out.println("CONEXION EXITOSA");
        } catch (Exception e) {
            System.out.println("ERROR: No se conecto a la base de datos");
        }
        return conectar;
    }
}
