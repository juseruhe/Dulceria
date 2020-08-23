import javax.swing.JOptionPane;

public class Producto {
    
String Codigo_Producto,Nombre_Producto;
int Precio_Producto,Cantidad_Producto,Unidades_Vendidas;

Producto(String Codigo_Producto,String Nombre_Producto,int Precio_Producto,
int Cantidad_Producto, int Unidades_Vendidas){

this.Codigo_Producto = Codigo_Producto;
this.Nombre_Producto = Nombre_Producto;
this.Precio_Producto = Precio_Producto;
this.Cantidad_Producto = Cantidad_Producto;
this.Unidades_Vendidas = Unidades_Vendidas;


}

void Total_Producto() {

 JOptionPane.showMessageDialog(null,"El Total de "+ Nombre_Producto + " es: "+ Precio_Producto *Unidades_Vendidas);



}






}




