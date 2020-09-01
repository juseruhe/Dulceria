
public class Producto6 {
    
protected final String codigo_Producto;
private String nombre_Producto;
private String  categoria;

public Producto6(String codigo_Producto,String nombre_Producto,String categoria){
if (codigo_Producto != null ){
    this.codigo_Producto = codigo_Producto;
} else {
    this.codigo_Producto = "";
}

setnombre_Producto(nombre_Producto);
setcategoria(categoria);

}

double totalPromedio(){
    return 0;
}

public String getcodigo_Producto(){
    return codigo_Producto;
}

public String getnombre_Producto(){
    return nombre_Producto;
}

public void setnombre_Producto(String nombre_Producto){
 if(nombre_Producto != null){
     this.nombre_Producto = nombre_Producto;
 }
 else {
     this.nombre_Producto = "";
 }
}

public String getcategoria(){
    return categoria;
}

public void setcategoria(String categoria){
 if(categoria != null){
     this.categoria = categoria;
 }
 else {
     this.categoria = "";
 }
}



}



