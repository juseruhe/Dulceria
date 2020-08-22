import javax.swing.JOptionPane;

public class Venta2 {
    
public static void main(final String[] args) {
    
    int Productos_Registrados = 0;

    Producto[] losProductos = new Producto [50];

    String Codigo,Nombre;

    int Precio,Cantidad,Unidades_Vendidas;

    int Total_Producto =0;

    int Menu = Integer.parseInt(JOptionPane.showInputDialog("Menú de Opciones\n 1.Adicionar Productos\n 2.Calcular Total Ventas\n 3.Salir"));

    if(Menu == 1) {

        Codigo = JOptionPane.showInputDialog("Digite el Código del Producto");
        Nombre = JOptionPane.showInputDialog("Digite el Nombre del Producto");
        Precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el Precio del Producto"));
        Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del Producto"));
        Unidades_Vendidas = Integer.parseInt(JOptionPane.showInputDialog("Digite las unidades vendidas del Producto"));

    Producto unProducto = new Producto(Codigo,Nombre,Precio,Cantidad,Unidades_Vendidas);


    losProductos[Productos_Registrados]=  unProducto;

    Productos_Registrados++;
    }
    
    else if(Menu == 2){

  for(int i=0; i<=Productos_Registrados;i++) {

   Total_Producto = Total_Producto + losProductos[i].Total_Producto();

   JOptionPane.showMessageDialog(null,"El Total de Todos los Productos es: " + Total_Producto);

  }

    }



}

}







