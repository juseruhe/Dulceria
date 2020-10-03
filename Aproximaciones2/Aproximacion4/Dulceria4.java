
public class Dulceria4 {

private final String nit;
private String nombre_Dulceria;
private String direccion;
private Producto4[]  producto;
private int Numero_Productos;

public Dulceria4(String nit,String nombre_Dulceria,String direccion){
if(nit != null){

    this.nit= nit;
}
else{
    this.nit = "";
}

setnombre_Dulceria(nombre_Dulceria);
setdireccion(direccion);
producto = new Producto4[50];
Numero_Productos=0;

}


public String getnit(){
    return nit;
}


public String getnombre_Dulceria(){

    return  nombre_Dulceria;


  }



  public void setnombre_Dulceria(String nombre_Dulceria){

  if (nombre_Dulceria != null) {

      this.nombre_Dulceria = nombre_Dulceria;
  }

  else {

      this.nombre_Dulceria="";
  }

  }


  public String getdireccion(){

    return  direccion;


  }



  public void setdireccion(String direccion){

  if (direccion != null) {

      this.direccion= direccion;
  }

  else {

      this.direccion = "";
  }

  }


  public int getNumero_Productos(){

    return  Numero_Productos;


  }


public double promedioTodosProductos(){

   double promedio=0;

    for (int i=0; i<Numero_Productos;i++){

    
        promedio +=  producto[i].promedioVentas()/Numero_Productos;

    

    }

    return promedio;
}


public void adicionarProducto(String Codigo_Producto,String Nombre_Producto,String Categoria,
int Venta_Dia1,int Venta_Dia2,int Venta_Dia3){

Producto4  p = new Producto4(Codigo_Producto,Nombre_Producto,Categoria,Venta_Dia1,Venta_Dia2,Venta_Dia3);

producto[Numero_Productos] = p;

Numero_Productos++;

}


    
}