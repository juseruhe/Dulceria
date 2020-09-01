package BDjava2;

public class Imprimir {

    public static void main(String[] args) {
        
        Producto producto = new Producto("pro01","ChocoBreaks","Chocolate",50000,30000,20800);

        ControllerProducto controller = new ControllerProducto();

        controller.registrar(producto);

        controller.verProductos();

        producto.setid(14);
        producto.setnombre_Producto("Frunas");
        controller.actulizar(producto);


        producto.setid(1);
        controller.eliminar(producto);
    }
    
}
