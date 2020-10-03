import java.util.Scanner;

public class Ventas5 {

    public static void main(String[] args) throws Exception {
        
    Scanner Entrada= new Scanner(System.in);

    Dulceria5 miDulceria = new Dulceria5("111111","Dulceria_JSRH","Santa_Librada");

    String codigo,nombre,categoria;

    double promedio=0;


    System.out.println("Digite la cantidad de Productos de Dulce:");
    int numeroproductos1 = Entrada.nextInt();

    for(int i=0;i<numeroproductos1;i++){
    
        int venta1,venta2;


        System.out.println("Digite el Código del Producto de Dulce N°"+(i+1));
        codigo = Entrada.next();

        System.out.println("Digite el nombre de Producto de Dulce N°"+(i+1));
        nombre = Entrada.next();

        System.out.println("Digite la categoría de Producto de Dulce N°"+(i+1));
         categoria = Entrada.next();

        System.out.println("Digite el Total de Ventas del Dia 1  de Producto de Dulce N°"+(i+1));
        venta1 = Entrada.nextInt();

        System.out.println("Digite el Total de Ventas del Dia 2  de Dulce N°"+(i+1));
        venta2 = Entrada.nextInt();

        miDulceria.adicionarProductoDulces(codigo,nombre,categoria,venta1,venta2);


    }

    System.out.println("Digite la cantidad de Productos de Bebidas:");
    int numeroproductos2 = Entrada.nextInt();


    for(int i=0;i<numeroproductos2;i++){
    
        int venta1,venta2,venta3;


        System.out.println("Digite el Código del Producto de Bebidas N°"+(i+1));
        codigo = Entrada.next();

        System.out.println("Digite el nombre de Producto de Bebidas N°"+(i+1));
        nombre = Entrada.next();

        System.out.println("Digite la categoría de Producto de Bebidas N°"+(i+1));
         categoria = Entrada.next();

        System.out.println("Digite el Total de Ventas del Dia 1  de Bebidas N°"+(i+1));
        venta1 = Entrada.nextInt();

        System.out.println("Digite el Total de Ventas del Dia 2  de Bebidas N°"+(i+1));
        venta2 = Entrada.nextInt();

        System.out.println("Digite el Total de Ventas del Dia 3  de Bebidas N°"+(i+1));
        venta3 = Entrada.nextInt();

        miDulceria.adicionarProductoBebidas(codigo,nombre,categoria,venta1,venta2,venta3);


    }


    System.out.println("Digite la cantidad de Productos de Chocolate:");
    int numeroproductos3 = Entrada.nextInt();


    for(int i=0;i<numeroproductos3;i++){
    
        int venta1,venta2,venta3,venta4;


        System.out.println("Digite el Código del Producto de Chocolate N°"+(i+1));
        codigo = Entrada.next();

        System.out.println("Digite el nombre de Producto de Chocolate N°"+(i+1));
        nombre = Entrada.next();

        System.out.println("Digite la categoría de Producto de Chocolate N°"+(i+1));
         categoria = Entrada.next();

        System.out.println("Digite el Total de Ventas del Dia 1  de Chocolate N°"+(i+1));
        venta1 = Entrada.nextInt();

        System.out.println("Digite el Total de Ventas del Dia 2  de Chocolate N°"+(i+1));
        venta2 = Entrada.nextInt();

        System.out.println("Digite el Total de Ventas del Dia 3  de Chocolate N°"+(i+1));
        venta3 = Entrada.nextInt();

        System.out.println("Digite el Total de Ventas del Dia 4 de Chocolate N°"+(i+1));
        venta4 = Entrada.nextInt();


        miDulceria.adicionarProductoChocolates(codigo,nombre,categoria,venta1,venta2,venta3,venta4);


    }

    promedio = miDulceria.totalTodosProductos();

    System.out.println("El Promedio de ventas de todos los productos es: "+promedio);

    


    }
    
}