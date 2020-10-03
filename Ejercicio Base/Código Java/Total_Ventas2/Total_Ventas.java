import java.util.Scanner;

public class Total_Ventas {

    public static void main(String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Digite la Cantidad de Productos que desea registrar: ");
		int Productos_Registrados = Entrada.nextInt();
		
		int TotalProductos=0;
		
		for(int i=1;i<=Productos_Registrados;i++){
		    
		    System.out.println("Digite el código del Producto: ");
		String Codigo_Producto = Entrada.next();
		
		   System.out.println("Digite el nombre del Producto: ");
		String Nombre_Producto = Entrada.next();
		
		   System.out.println("Digite el Precio del Producto: ");
		  int Precio_Producto = Entrada.nextInt();
		    
		     System.out.println("Digite la Cantidad del Producto: ");
		int Cantidad_Producto = Entrada.nextInt();
		
		   System.out.println("Digite las unidades Vendidas del Producto: ");
		int Unidades_Vendidas = Entrada.nextInt();
		
		int TotalProducto = Precio_Producto * Unidades_Vendidas;
		
		System.out.println("El Total de Ventas del "+ Nombre_Producto+ " es: " + TotalProducto);
		
		
		 TotalProductos+=TotalProducto;
		
		    
		}
		
		System.out.println("El Total de Ventas de Todos los Productos es: " + TotalProductos);
		
	}

    
}
