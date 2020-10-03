
public class Dulceria5 {
    
    private final String nit;
    private String nombre_Dulceria;
    private String direccion;
    private ProductoDulces5[] producto1;
    private ProductoBebidas5[] producto2;
    private ProductoChocolates5[] producto3;
    private int numero_Productos1;
    private int numero_Productos2;
    private int numero_Productos3;


    public Dulceria5(String nit,String nombre_Dulceria,String direccion){
     if(nit != null) {
         this.nit = nit;
     } 

     else {
         this.nit = "";
     }

     setnombre_Dulceria(nombre_Dulceria);
     setdireccion(direccion);
     producto1 = new ProductoDulces5[50];
     producto2 = new ProductoBebidas5[50];
     producto3 = new ProductoChocolates5[50];

     numero_Productos1 = 0;
     numero_Productos2 = 0;
     numero_Productos3 = 0;

    }


    public String getnit(){
        return nit;
    }

    public String getnombre_Dulceria(){
        return nombre_Dulceria;
    }

    public void  setnombre_Dulceria(String nombre_Dulceria){
        
        if(nombre_Dulceria != null){
        
        this.nombre_Dulceria = nombre_Dulceria;

        } else {

            this.nombre_Dulceria= "";
        }


    }


    public String getdireccion(){
        return direccion;
    }

    public void  setdireccion(String direccion){
        
        if(direccion != null){
        
        this.direccion = direccion;

        } else {

            this.direccion= "";
        }


    }


    public int numero_Productos1(){
        return numero_Productos1;
    }


    public int numero_Productos2(){
        return numero_Productos2;
    }


    public int getnumero_Productos3(){
        return numero_Productos3;
    }


public double  totalTodosProductos(){

double promedio = 0;


for(int i=0; i<numero_Productos1;i++){

    promedio += producto1[i].promedioVentas()/numero_Productos1;
}


for(int i=0; i<numero_Productos2;i++){

    promedio += producto2[i].promedioVentas()/numero_Productos2;
}


for(int i=0; i<numero_Productos3;i++){

    promedio += producto3[i].promedioVentas()/numero_Productos3;
}

return promedio/3;
}

public void adicionarProductoDulces(String codigo_Producto,String nombre_Producto,String categoria,
int venta_Dia1,int venta_Dia2){

    producto1[numero_Productos1] = new ProductoDulces5(codigo_Producto,nombre_Producto,categoria,
    venta_Dia1,venta_Dia2);
    numero_Productos1++;
}


public void adicionarProductoBebidas(String codigo_Producto,String nombre_Producto,String categoria,
int venta_Dia1,int venta_Dia2,int venta_Dia3){

    producto2[numero_Productos2] = new ProductoBebidas5(codigo_Producto,nombre_Producto,categoria,
    venta_Dia1,venta_Dia2,venta_Dia3);
    numero_Productos2++;
}



public void adicionarProductoChocolates(String codigo_Producto,String nombre_Producto,String categoria,
int venta_Dia1,int venta_Dia2,int venta_Dia3,int venta_Dia4){

    producto3[numero_Productos3] = new ProductoChocolates5(codigo_Producto,nombre_Producto,categoria,
    venta_Dia1,venta_Dia2,venta_Dia3,venta_Dia4);
    numero_Productos3++;
}




}