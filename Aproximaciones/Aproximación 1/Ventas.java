

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ventas {
    
    public static void main(String[] args) {
        
    Scanner Entrada = new Scanner(System.in);

     int Productos_Registrados;

     Productos[]  losProductos =  new Productos[50];

     String Codigo,Nombre;

     int Precio,Cantidad,Unidades_Vendidas,Total_Producto,Total_Productos=0;

     

     
    Productos_Registrados = Integer.parseInt(JOptionPane.showInputDialog("Digite la Cantidad de Productos que desea registrar :")) ;

    for (int i= 1 ; i<=Productos_Registrados; i++) {

    Codigo = JOptionPane.showInputDialog("Digite el Código del Producto");
    Nombre = JOptionPane.showInputDialog("Digite el Nombre del Producto");
    Precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el Precio del Producto"));
    Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del Producto"));
    Unidades_Vendidas = Integer.parseInt(JOptionPane.showInputDialog("Digite las unidades vendidas del Producto"));
    Total_Producto = Cantidad * Unidades_Vendidas;

      JOptionPane.showMessageDialog(null,"El Total de ventas del " + Nombre+ " es de : " + Total_Producto);

    
    Total_Productos+=Total_Producto;

    Productos unproducto = new Productos();

    unproducto.Codigo_Producto = Codigo;
    unproducto.Nombre_Producto = Nombre;
    unproducto.Precio_Producto = Precio;
    unproducto.Cantidad_Producto = Cantidad;
    unproducto.Unidades_Vendidas = Unidades_Vendidas;
    

    losProductos[i] = unproducto;

   



    }


    JOptionPane.showMessageDialog(null,"El Total de Ventas de Todos los Productos es:  " + Total_Productos);


}

}