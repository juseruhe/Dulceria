
public class ProductoDulces5 {
    
  private final String codigo_Producto;
  private String nombre_Producto;
  private String categoria;
  private int venta_Dia1;
  private int venta_Dia2;

  public String getcodigo_Producto(){

    return codigo_Producto;
 
  }

  
  public String getnombre_Producto(){

    return nombre_Producto;
 
  }

  public void setnombre_Producto(String nombre_Producto){

  if(nombre_Producto != null){

  this.nombre_Producto = nombre_Producto;

  } else {

    this.nombre_Producto = "";
  }
 
  }

  public String getcategoria(){

    return categoria;
 
  }

  public void setcategoria(String categoria){

  if(categoria!= null){

  this.categoria= categoria;

  } else {

    this.categoria = "";
  }
 
  }

  public int getventa_Dia1(){

    return venta_Dia1;
 
  }

  public void setventa_Dia1(int venta_Dia1){

  if(venta_Dia1 != 0){

  this.venta_Dia1 = venta_Dia1;

  } else {

    this.venta_Dia1 = 0;
  }
 
  }


  public int getventa_Dia2(){

    return venta_Dia2;
 
  }

  public void setventa_Dia2(int venta_Dia2){

  if(venta_Dia2 != 0){

  this.venta_Dia2 = venta_Dia2;

  } else {

    this.venta_Dia2= 0;
  }
 
  }

ProductoDulces5(String codigo_Producto,String nombre_Producto,String categoria,
int venta_Dia1,int venta_Dia2){

if(codigo_Producto != null){

  this.codigo_Producto = codigo_Producto;
}

else{
  this.codigo_Producto = "";
}

setnombre_Producto(nombre_Producto);
setcategoria(categoria);
setventa_Dia1(venta_Dia1);
setventa_Dia2(venta_Dia2);


}

  double promedioVentas(){

return (venta_Dia1+venta_Dia2)/2;

  }
  
  

  
  
  




}