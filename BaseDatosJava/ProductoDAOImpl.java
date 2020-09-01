

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl implements IProductoDAO{

@Override
public boolean registrar(Producto producto){

boolean registrar = false;
Statement stm= null;
Connection con= null;

String sql="INSERT INTO producto VALUES(NULL,'"+producto.getcodigo_Producto()+"','"+producto.getnombre_Producto()+"','"+producto.getcategoria()+"','"+producto.getventa_Dia1()+"','"+producto.getventa_Dia2()+"','"+producto.getventa_Dia3()+"')";

try {

    con = Conexion.conectar();
    stm = con.createStatement();
    registrar = true;
    stm.close();
    con.close();

} catch (SQLException e){

    System.out.println("Error: Clase ProductoDAOImpl, metodo registrar ");
    e.printStackTrace();
}

return registrar;

}

@Override
public List<Producto>obtener(){
Connection co=null;
Statement stm= null;
ResultSet rs = null;

String sql="SELECT * FROM producto ORDER BY ID";
List<Producto> listaProducto =  new ArrayList<Producto>();

try{
    co = Conexion.conectar();
    stm = co.createStatement();
    rs= stm.executeQuery(sql);
    while(rs.next()){

     Producto c = new Producto();
     c.setid(rs.getInt(1));
     c.setcodigo_Producto(rs.getString(2));
     c.setnombre_Producto(rs.getString(3));
     c.setcategoria(rs.getString(4));
     c.setventa_Dia1(rs.getInt(5));
     c.setventa_Dia2(rs.getInt(6));
     c.setventa_Dia3(rs.getInt(7));
     
     listaProducto.add(c);

    }

    stm.close();
    rs.close();
    co.close();
}  catch(SQLException e) {

    System.out.println("Error: Clase ProductoDAOImpl, metodo obtener ");
    e.printStackTrace();
}
return listaProducto;
}

@Override
public boolean actualizar(Producto producto){
Connection connect=null;
Statement stm= null;
boolean actualizar = false;

String sql="UPDATE producto SET codigo_producto='"+producto.getcodigo_Producto()+"',nombre_producto='"+producto.getnombre_Producto()+"',categoria='"+producto.getcategoria()+"',venta_dia1='"+producto.getventa_Dia1()+"',venta_dia2='"+producto.getventa_Dia2()+"',venta_dia3='"+producto.getventa_Dia3()+"'"+"WHERE id="+producto.getid();


try{
    connect = Conexion.conectar();
    stm = connect.createStatement();
     stm.execute(sql);
     actualizar= true;
  }  catch(SQLException e) {

    System.out.println("Error: Clase ProductoDAOImpl, metodo actualizar ");
    e.printStackTrace();
}

return actualizar;
}


@Override
public boolean eliminar(Producto producto){
Connection connect=null;
Statement stm= null;
boolean eliminar = false;

String sql="DELETE FROM producto WHERE id="+producto.getid();

try{
    connect = Conexion.conectar();
    stm = connect.createStatement();
     stm.execute(sql);
     eliminar= true;
  }  catch(SQLException e) {

    System.out.println("Error: Clase ProductoDAOImpl, metodo eliminar ");
    e.printStackTrace();
}

return eliminar;
}


}

