
import java.util.Scanner;

public class Ventas {
    

    public static void main(String[] args) {
        
    Scanner Entrada = new Scanner(System.in);
    int Numero_Productos;

    Producto[] losproductos= new Producto[50];
 
   String codigo,nombre,categoria;
   int venta1,venta2,venta3;

   double promedioVentas;

   System.out.println("Digite la Cantidad de productos que desea registrar: ");
   Numero_Productos= Entrada.nextInt();




   for(int i=0;i<Numero_Productos;i++){

  System.out.println("Digite el Código de Producto N°"+(i+1)+":");
  codigo = Entrada.next();

  System.out.println("Digite el Nombre de Producto N°"+(i+1)+":");
  nombre = Entrada.next();


  System.out.println("Digite la Categoría de Producto N°"+(i+1)+":");
  categoria = Entrada.next();

  System.out.println("Digite el total de ventas del día 1 de Producto N°"+(i+1)+":");
  venta1 = Entrada.nextInt();

  System.out.println("Digite el total de ventas del día 2 de Producto N°"+(i+1)+":");
  venta2 = Entrada.nextInt();


  System.out.println("Digite el total de ventas del día 3 de Producto N°"+(i+1)+":");
  venta3 = Entrada.nextInt();

  Producto unproducto = new Producto();

  unproducto.Codigo_Producto = codigo;
  unproducto.Nombre_Producto = nombre;
  unproducto.Categoria = categoria;
  unproducto.Venta_Dia1 = venta1;
  unproducto.Venta_Dia2 = venta2;
  unproducto.Venta_Dia3 = venta3;

  losproductos[i] = unproducto;

   }
  for(int i=0; i <Numero_Productos;i++){

  double total_ventas = losproductos[i].Venta_Dia1 + losproductos[i].Venta_Dia2
  +losproductos[i].Venta_Dia3;

 promedioVentas= total_ventas/3; 

 System.out.println("El promedio de Ventas del producto "+ losproductos[i].Nombre_Producto+
 " es: $"+promedioVentas+"COP");

   }



   }


   


    }
