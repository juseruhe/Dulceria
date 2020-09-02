
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;

public class Imprimir {

    
    
    
    
    
    public static void main(String[] args) throws Exception{
        
      boolean timeToQuit = false;
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      do {
          
          timeToQuit= ejecutarMenu(br);
          
      
    }while(!timeToQuit);
    
    
      }
public static boolean ejecutarMenu(BufferedReader br) throws IOException{
    Producto pro;
    String accion;
    int id;
    System.out.println("\n\n [I] Insertar || [L] Listar || [C] Consultar || [A] Actualizar|| [E] Eliminar || [S]  Salir ");
    
    accion = br.readLine();
    if((accion.length()==0) || accion.toUpperCase().charAt(0)=='S'){
    return true;
}
    switch(accion.toUpperCase().charAt(0)){
        case 'I': 
        pro = ingresaProducto(br);
        ControllerProducto controlleri = new ControllerProducto();
        controlleri.registrar(pro);
        System.out.println("Producto ingresado: "+pro.getcodigo_Producto());
        System.out.println("\n\n Producto Creado\n     "+pro);
          break;
          
          
         case 'L': 
         System.out.println("Listado de Productos: ");
        
         ControllerProducto controllerl = new ControllerProducto();
        controllerl.verProductos();
         
        break;
        
          case 'C': 
         System.out.println("Ingrese número id a consultar: ");
        id = new Integer(br.readLine().trim());
        ControllerProducto controllerc = new ControllerProducto();
        controllerc.obtenerbyid(id);
         
        break;
        
        
        case 'A': 
         System.out.println("Ingrese número id a actualizar: ");
        id = new Integer(br.readLine().trim());
        ControllerProducto controllera = new ControllerProducto();
        controllera.obtenerbyid(id);
        
        if(pro == null){
            System.out.println("\n\n Producto"+id+"No encontrado");
            break;
        }
        pro = ingresaProducto(br,pro);
        controllera.actualizar(pro);
        System.out.println("Registrado Actualizado Correctamente"+pro.getcodigo_Producto());
        
         
        break;
        
        
         case 'E': 
         pro = new Producto();
        System.out.println("Ingrese un numero id para eliminar");
        id = new Integer(br.readLine().trim());
        pro.setid(id);
        ControllerProducto controllere = new ControllerProducto();
        controllere.eliminar(pro);
        System.out.println("Producto Eliminado"+id);
        
        
         
        break;
          
    
    }   
        return false;
        
        
        

}

public static Producto ingresaProducto(BufferedReader br  ) throws IOException{


return ingresaProducto(br,null,true);




}
public static Producto ingresaProducto(BufferedReader br, Producto proDefaults  ) throws IOException{


return ingresaProducto(br,proDefaults,false);




}
public static Producto ingresaProducto(BufferedReader br, Producto proDefaults,boolean nuevoProducto  ) throws IOException{

NumberFormat nf = NumberFormat.getCurrencyInstance();
Producto pro;
int id= -1;
String codigo_Producto= "";
String nombre_Producto;
String categoria;
int venta_Dia1;
int venta_Dia2;
int venta_Dia3;

String prompt="Ingrese el Código del Producto "+((proDefaults== null) ?"":"["+proDefaults.getcodigo_Producto()+"]");

if(nuevoProducto){
    do{
        System.out.println(prompt+":");
        codigo_Producto = br.readLine().trim();
        if (codigo_Producto.equals("") && proDefaults != null){
            
            codigo_Producto = proDefaults.getcodigo_Producto();



 if (codigo_Producto.length() < 1){
            
            codigo_Producto = proDefaults.getcodigo_Producto();
System.out.println("Ingrese un dato para el código del producto");

}
}
} while(codigo_Producto.length() < 1);



} else {
    
    
    id = proDefaults.getid();
    System.out.println("Campo código del producto modificado"+id+". Presione Enter");
    
}
    prompt="Ingrese el Nombre del Producto "+((proDefaults== null) ?"":"["+proDefaults.getnombre_Producto()+"]");


    do{
        System.out.println(prompt+":");
        nombre_Producto = br.readLine().trim();
        if (nombre_Producto.equals("") && proDefaults != null){
            
            nombre_Producto = proDefaults.getnombre_Producto();



 if (nombre_Producto.length() < 1){
            
            nombre_Producto = proDefaults.getnombre_Producto();
System.out.println("Ingrese un dato para el nombre del producto");

}
}
} while(nombre_Producto.length() < 1);

     prompt="Ingrese la categoria del Producto "+((proDefaults== null) ?"":"["+proDefaults.getcategoria()+"]");


    do{
        System.out.println(prompt+":");
        nombre_Producto = br.readLine().trim();
        if (categoria.equals("") && proDefaults != null){
            
            categoria = proDefaults.getcategoria();



 if (categoria.length() < 1){
            
            categoria = proDefaults.getcategoria();
System.out.println("Ingrese un dato para la categoria del producto");

}
}
} while(categoria.length() < 1);

prompt="Ingrese la venta del dia 1 del Producto "+((proDefaults== null) ?"":"["+nf.format((int)proDefaults.getventa_Dia1())+"]");


    do{
        System.out.println(prompt+":");
        venta_Dia1 = 0;
        try{
            String amt =br.readLine().trim();
        if (!amt.equals("") ){
            
            venta_Dia1 = Integer.parseInt(amt);



 if (venta_Dia1 < 1){
            
            
System.out.println("Por favor ingrese numero positivo");

}
}} catch(NumberFormatException e){
    System.out.println("Ingrese un dato para la venta del dia 1"+e.getMessage());
}
} while(venta_Dia1== 0);

prompt="Ingrese la venta del dia 2 del Producto "+((proDefaults== null) ?"":"["+nf.format((int)proDefaults.getventa_Dia2())+"]");


    do{
        System.out.println(prompt+":");
        venta_Dia2 = 0;
        try{
            String amt =br.readLine().trim();
        if (!amt.equals("") ){
            
            venta_Dia2 = Integer.parseInt(amt);



 if (venta_Dia2 < 1){
            
            
System.out.println("Por favor ingrese numero positivo");

}
}} catch(NumberFormatException e){
    System.out.println("Ingrese un dato para la venta del dia 2"+e.getMessage());
}
} while(venta_Dia2== 0);

prompt="Ingrese la venta del dia 3 del Producto "+((proDefaults== null) ?"":"["+nf.format((int)proDefaults.getventa_Dia3())+"]");


    do{
        System.out.println(prompt+":");
        venta_Dia1 = 0;
        try{
            String amt =br.readLine().trim();
        if (!amt.equals("")){
            
            venta_Dia3 = Integer.parseInt(amt);



 if (venta_Dia3 < 1){
            
            
System.out.println("Por favor ingrese numero positivo");

}
}} catch(NumberFormatException e){
    System.out.println("Ingrese un dato para la venta del dia 3"+e.getMessage());
}
} while(venta_Dia3== 0);

pro = new Producto(codigo_Producto,nombre_Producto,categoria,venta_Dia1,venta_Dia2,venta_Dia3);

return pro;
    }
    
    
    
    
    
    
    
    
    
}

