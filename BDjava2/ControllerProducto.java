package BDjava2;
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


    public void actulizar(Producto producto){

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

    
}