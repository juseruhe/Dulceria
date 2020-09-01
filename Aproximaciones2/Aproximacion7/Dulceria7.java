
import java.util.ArrayList;

public class Dulceria7 {
    
    private final String nit;
private String nombre_Dulceria;
private String direccion;
private ArrayList producto;

public Dulceria7(String nit,String nombre_Dulceria,String direccion){
    if (nit != null ){
        this.nit = nit;
    } else {
        this.nit = "";
    }
    
    setnombre_Dulceria(nombre_Dulceria);
    setdireccion(direccion);
    producto = producto = new ArrayList();
}

public String getnit(){
    return nit;
}

public String getnombre_Dulceria(){
    return nombre_Dulceria;
}

public void setnombre_Dulceria(String nombre_Dulceria){
 if(nombre_Dulceria != null){
     this.nombre_Dulceria = nombre_Dulceria;
 }
 else {
     this.nombre_Dulceria = "";
 }
}

public String getdireccion(){
    return direccion;
}

public void setdireccion(String direccion){
 if(direccion != null){
     this.direccion= direccion;
 }
 else {
     this.direccion = "";
 }
}

public  double promedioTodosProductos(){

    double promedio = 0;

    for(int i=0; i<producto.size(); i++){

        promedio +=((Producto7)producto.get(i)).totalPromedio();

     

       
    }

    return promedio/3;
   }

   public void adicionarProducto(String codigo_Producto,String nombre_Producto,String categoria,
   int venta_Dia1,int venta_Dia2) throws Exception{

    producto.add(new ProductoDulces7(codigo_Producto, nombre_Producto, categoria, 
    venta_Dia1, venta_Dia2));

    

   }

   public void  adicionarProducto(String codigo_Producto,String nombre_Producto,String categoria,
   int venta_Dia1,int venta_Dia2,int venta_Dia3) throws Exception{

    producto.add(new ProductoBebidas7(codigo_Producto, nombre_Producto, categoria, 
    venta_Dia1, venta_Dia2, venta_Dia3));

    

   }


   public void  adicionarProducto(String codigo_Producto,String nombre_Producto,String categoria,
   int venta_Dia1,int venta_Dia2,int venta_Dia3,int venta_Dia4)
   throws Exception{

    producto.add(new ProductoChocolates7(codigo_Producto, nombre_Producto, categoria, 
    venta_Dia1, venta_Dia2, venta_Dia3, venta_Dia4));

   

   }



}