import java.util.Scanner;

public class Ventas2{
    
 public static void main( String[] args) {

      Scanner Entrada = new Scanner(System.in);

     int Numero_Productos = 0;
      int Opcion = 0;

      Producto2[] losproductos = new Producto2[50];

     String codigo, nombre, categoria;

     int venta1, venta2, venta3;

     double promedioVentas;


    
     while (Opcion != 3) {
       
      System.out.println("Menú de Opciones:\n Digite una Opción");
      System.out.println("1. Adicionar Producto");
      System.out.println("2. Calcular Promedio de Ventas");
      System.out.println("3. Salir");
      Opcion = Entrada.nextInt();
 
        

         if (Opcion == 1) {

             
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

              Producto2 unproducto = new Producto2(codigo, nombre, categoria, venta1, venta2, venta3);

  losproductos[Numero_Productos] = unproducto;

  Numero_Productos++;
    }

  else if(Opcion==2){

 for(int i=0;i<Numero_Productos;i++){

promedioVentas = losproductos[i].totalVentas();

System.out.println("El Promedio de Ventas del producto "+losproductos[i].Nombre_Producto+" es: $"
+promedioVentas+" COP");

 }


 




 




   }


}

 }

}

 