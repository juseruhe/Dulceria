import java.util.List;

public interface IProductoDAO {
    public boolean registrar(Producto producto);
    public List<Producto>obtener();
    public boolean actualizar(Producto producto);
    public boolean eliminar(Producto producto);


}