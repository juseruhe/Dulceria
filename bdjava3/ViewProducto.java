package bdjava3;

import java.util.List;

public class ViewProducto {

    public void verProducto(Producto producto){

        System.out.println("Datos del Producto: "+producto);

    }

    public void verProductos(List<Producto>productos){

        for(Producto producto:productos){

            System.out.println("Datos del Producto: "+producto);
        }
    }

    
}