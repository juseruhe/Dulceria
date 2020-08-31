import java.util.Scanner;


public class Ventas7 {
    
    public static void main(String[] args) {
        
        Scanner Entrada = new Scanner(System.in);

        Dulceria7 miDulceria = new Dulceria7("111111","Dulceria_JSRH","Marichuela");

        String codigo,nombre,categoria;

        int venta1,venta2,venta3,venta4;

        double promedio = 0;

        int opcion=0;


        do{
       System.out.println("\nMenu de Opciones"); 
       System.out.println("[l]- Adicionar Producto de Dulce:  "); 
       System.out.println("[2]- Adicionar Producto de Bebidas:  "); 
       System.out.println("[3]- Adicionar Producto de Chocolate: "); 
       System.out.println("[4]- Calcular Promedio de Ventas"); 
       System.out.println("[5]- Salir \n"); 
       System.out.println("Escoja una Opcion:  ");
       opcion= Entrada.nextInt();

       
     
        switch(opcion){

  

    case 1: 
    Entrada.nextLine();
    System.out.println("Digite el Código del Producto de Dulce ");
    codigo = Entrada.next();

    System.out.println("Digite el nombre de Producto de Dulce");
    nombre = Entrada.next();

    System.out.println("Digite la categoría de Producto de Dulce");
     categoria = Entrada.next();

    System.out.println("Digite el Total de Ventas del Dia 1  de Producto de Dulce");
    venta1 = Entrada.nextInt();

    System.out.println("Digite el Total de Ventas del Dia 2  de Producto Dulce ");
    venta2 = Entrada.nextInt();

    try{

        miDulceria.adicionarProducto(codigo,nombre,categoria,venta1,venta2);
    }

    catch(Exception e){

        System.out.println(e.getMessage());
        System.out.println("Hay un Error");
     }

break;


case 2:  

Entrada.nextLine();

System.out.println("Digite el Código del Producto de Producto Bebidas");
    codigo = Entrada.next();

    System.out.println("Digite el nombre de Producto de Producto Bebidas ");
    nombre = Entrada.next();

    System.out.println("Digite la categoría de Producto de Producto Bebidas ");
     categoria = Entrada.next();

    System.out.println("Digite el Total de Ventas del Dia 1  de Producto Bebidas");
    venta1 = Entrada.nextInt();

    System.out.println("Digite el Total de Ventas del Dia 2  de  producto Bebidas");
    venta2 = Entrada.nextInt();

    System.out.println("Digite el Total de Ventas del Dia 3 de producto Bebidas");
            venta3 = Entrada.nextInt();

    try{

        miDulceria.adicionarProducto(codigo,nombre,categoria,venta1,venta2,venta3);
    }

    catch(Exception e){

        System.out.println(e.getMessage());
        System.out.println("Hay un Error");
    


    }

    break;

    case 3:  

Entrada.nextLine();

System.out.println("Digite el Código del Producto de Producto  Chocolate");
    codigo = Entrada.next();

    System.out.println("Digite el nombre de Producto de Producto  Chocolate");
    nombre = Entrada.next();

    System.out.println("Digite la categoría de Producto de Producto  Chocolate");
     categoria = Entrada.next();

    System.out.println("Digite el Total de Ventas del Dia 1  de Producto  Chocolate");
    venta1 = Entrada.nextInt();

    System.out.println("Digite el Total de Ventas del Dia 2  de Producto  Chocolate");
    venta2 = Entrada.nextInt();

    System.out.println("Digite el Total de Ventas del Dia 3  de Producto  Chocolate");
            venta3 = Entrada.nextInt();

 System.out.println("Digite el Total de Ventas del Dia 4 de Producto  Chocolate");
            venta4 = Entrada.nextInt();

    try{

        miDulceria.adicionarProducto(codigo,nombre,categoria,venta1,venta2,venta3,venta4);
    }

    catch(Exception e){

        System.out.println(e.getMessage());
        System.out.println("Hay un Error");
    


    }

    break;

    case 4: Entrada.nextLine();
    promedio = miDulceria.promedioTodosProductos();

    System.out.println("El Promedio de ventas de todos los productos es: "+promedio);

  break;

  

  default: System.out.println("Ha Seleccionado Salir.");


} }while(opcion != 5);

        

    }

}
      



    