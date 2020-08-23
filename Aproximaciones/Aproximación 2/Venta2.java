import javax.swing.JOptionPane;

public class Venta2 {
    
public static void main(final String[] args) {
    
    int Productos_Registrados ;


    String Codigo,Nombre;

    int Precio,Cantidad,Unidades_Vendidas;

    int Agregar = 0;

    int Menu = Integer.parseInt(JOptionPane.showInputDialog("Menú de Opciones\n 1.Total de Ventas \n 2.Salir"));

    switch(Menu) {


    case 1:    

    Productos_Registrados = Integer.parseInt(JOptionPane.showInputDialog("Digite La Cantidad de Productos que desea Registrar:"));
    
    for (int i=1; i<=Productos_Registrados; i++) {
    
    
    Codigo = JOptionPane.showInputDialog("Digite el Código del Producto");
        Nombre = JOptionPane.showInputDialog("Digite el Nombre del Producto");
        Precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el Precio del Producto"));
        Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del Producto"));
        Unidades_Vendidas = Integer.parseInt(JOptionPane.showInputDialog("Digite las unidades vendidas del Producto"));
        
    Producto unProducto = new Producto(Codigo,Nombre,Precio,Cantidad,Unidades_Vendidas);

     
      unProducto.Total_Producto();
     
    
      int Total = unProducto.Precio_Producto*unProducto.Unidades_Vendidas;

  

      Agregar += Total;

    };


    JOptionPane.showMessageDialog(null,"El Total de todos los Productos es: " + Agregar);
  
    break;

    
    
   default:  JOptionPane.showMessageDialog(null,"Número de Consulta Equivocado");


   


  break;



}

    }

}









