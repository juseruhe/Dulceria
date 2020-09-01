
import java.util.Scanner;

public class Ventas3 {
    
  public static void main(String[] args) {
      
    Scanner Entrada = new Scanner(System.in);

    int Numero_Productos = 0;
     int Opcion = 0;

     Producto3[] losproductos = new Producto3[50];

    String codigo, nombre, categoria;

    int venta1, venta2, venta3;

    double promedioVentas;


    System.out.println("Digite el numero de productos que quiere registrar:");
     Numero_Productos = Entrada.nextInt();

   for(int i=0;i<Numero_Productos;i++){

    System.out.println("Digite el Código de Producto:");
    codigo = Entrada.next();

    System.out.println("Digite el Nombre de Producto:");
    nombre = Entrada.next();

    System.out.println("Digite la Categoría de Producto:");
    categoria = Entrada.next();

    System.out.println("Digite el total de ventas del día 1 de Producto:");
    venta1 = Entrada.nextInt();

    System.out.println("Digite el total de ventas del día 2 de Producto:");
    venta2 = Entrada.nextInt();

    System.out.println("Digite el total de ventas del día 3 de Producto:");
    venta3 = Entrada.nextInt();

    Producto3 unproducto = new Producto3(codigo, nombre, categoria, venta1, venta2, venta3);

    losproductos[i] = unproducto;


      
   

    
        


   }

   
   for(int i=0;i<Numero_Productos;i++){

    promedioVentas = losproductos[i].promedioVentas();
    
    System.out.println("El Promedio de Ventas del producto "+losproductos[i].getNombre_Producto()+" es: $"
    +promedioVentas+" COP");
    
     }


  }


}