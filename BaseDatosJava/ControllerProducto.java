
 
import java.util.ArrayList;
import java.util.List;

public class ControllerProducto {

    private ViewProducto vista = new ViewProducto();
     
    public ControllerProducto(){

    };

    public void registrar(Producto producto){
IProductoDAO dao = new ProductoDAOImpl();
dao.registrar(producto);

    }


    public void actualizar(Producto producto){

        IProductoDAO dao = new ProductoDAOImpl();
        dao.actualizar(producto);
    }


    public void eliminar(Producto producto){

        IProductoDAO dao = new ProductoDAOImpl();
        dao.eliminar(producto);
    }

    public void verProductos(){

    List<Producto>productos = new ArrayList<Producto>();

    IProductoDAO dao= new ProductoDAOImpl();
    productos = dao.obtener();
    vista.verProductos(productos);

    }
    
    public void obtenerbyid(int id){
        Producto producto = new Producto();
        IProductoDAO dao = new ProductoDAOImpl();
        producto = dao.obtenerbyid(id);
        vista.verProducto(producto);
        
        
        
    }

    
}