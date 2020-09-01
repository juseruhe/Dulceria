package BDjava2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion{

    public static Connection conectar(){

      Connection con = null;

     String usuario = "root";
     String password = "";
     String url = "jdbc:mysql://localhost:3306/dulceria?user="+usuario+"&password="+password;

    

     try{
          con = DriverManager.getConnection(url);

          if(con != null){
         
            System.out.println("Conectado a la Base de Datos");
          }
}catch(SQLException e){

    System.out.println("No se pudo conectar a la Base de Datos");


    e.printStackTrace();
     }


return con;

    }


}