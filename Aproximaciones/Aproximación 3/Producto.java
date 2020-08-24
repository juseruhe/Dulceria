

import javax.swing.JOptionPane;

public class Producto {
    
private String Codigo_Producto;
private String Nombre_Producto; 
private int Precio_Producto,Cantidad_Producto,Unidades_Vendidas;

public String getCodigo_Producto() {
return Codigo_Producto;
}
public void setCodigo_Producto( String Codigo_Producto) {
    if (Codigo_Producto != null)
        this.Codigo_Producto = Codigo_Producto;
    else
        this.Codigo_Producto = "";
}

public String getNombre_Producto() {
    return Nombre_Producto;

}

public void setNombre_Producto( String Nombre_Producto)

{
    if (Nombre_Producto != null)

        this.Nombre_Producto = Nombre_Producto;
    else
        this.Nombre_Producto = "";

}

public int getPrecio_Producto() {
    return Precio_Producto;

}

public void setPrecio_Producto( int Precio_Producto) {
    if (Precio_Producto != 0)
        this.Precio_Producto = Precio_Producto;

    else
        this.Precio_Producto = 0;

}

public int Cantidad_Producto() {
    return Cantidad_Producto;

}

public void setCantidad_Producto( int Cantidad_Producto)

{
    if (Cantidad_Producto >= 0)
        this.Cantidad_Producto = Cantidad_Producto;
    else
        this.Cantidad_Producto = 0;

}

public double getUnidades_Vendidas() {
    return Unidades_Vendidas;
}

public void setUnidades_Vendidas(int Unidades_Vendidas) {
    if (Unidades_Vendidas >= 0)
        this.Unidades_Vendidas = Unidades_Vendidas;
    else
        this.Unidades_Vendidas = 0;

}

Producto(String Codigo_Producto,String Nombre_Producto,int Precio_Producto,
        int Cantidad_Producto,int Unidades_Vendidas) {

setCodigo_Producto(Codigo_Producto);
setNombre_Producto(Nombre_Producto); setPrecio_Producto(Precio_Producto); 
setCantidad_Producto(Cantidad_Producto); setUnidades_Vendidas(Unidades_Vendidas);
}

void Total_Producto() {

JOptionPane.showMessageDialog(null,"El Total de "+ Nombre_Producto + " es: "+ Precio_Producto *Unidades_Vendidas);
   
}
   








}