public class Dulceria6 {
    
private final String nit;
private String nombre_Dulceria;
private String direccion;
private Producto6[] producto;
private int numero_Productos;

public Dulceria6(String nit,String nombre_Dulceria,String direccion){
    if (nit != null ){
        this.nit = nit;
    } else {
        this.nit = "";
    }
    
    setnombre_Dulceria(nombre_Dulceria);
    setdireccion(direccion);
    producto = new Producto6[50];
    numero_Productos = 0;
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

    for(int i=0; i<numero_Productos; i++){

        promedio += producto[i].totalPromedio();
    }

    return promedio/3;
   }


   public void adicionarProductoDulces(String codigo_Producto,String nombre_Producto,String categoria,
   int venta_Dia1,int venta_Dia2){

    producto[numero_Productos] = new ProductoDulces6(codigo_Producto, nombre_Producto, categoria, 
    venta_Dia1, venta_Dia2);

    numero_Productos++;

   }

   public void  adicionarProductoBebidas(String codigo_Producto,String nombre_Producto,String categoria,
   int venta_Dia1,int venta_Dia2,int venta_Dia3){

    producto[numero_Productos] = new ProductoBebidas6(codigo_Producto, nombre_Producto, categoria, 
    venta_Dia1, venta_Dia2, venta_Dia3);

    numero_Productos++;

   }


   public void  adicionarProductoChocolates(String codigo_Producto,String nombre_Producto,String categoria,
   int venta_Dia1,int venta_Dia2,int venta_Dia3,int venta_Dia4){

    producto[numero_Productos] = new ProductoChocolates6(codigo_Producto, nombre_Producto, categoria, 
    venta_Dia1, venta_Dia2, venta_Dia3, venta_Dia4);

    numero_Productos++;

   }




}