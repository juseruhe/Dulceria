
public abstract class Producto7 {
    protected final String codigo_Producto;
private String nombre_Producto;
private String  categoria;

public Producto7(String codigo_Producto,String nombre_Producto,String categoria)
throws Exception{
    if (codigo_Producto.trim().equals(""))
        throw new Exception("Valor invalido de Codigo de Producto");
     if(codigo_Producto.matches(".*[a-zA-Z] .*"))
        throw new Exception("El código del producto no puede tener caracteres");
    
    this.codigo_Producto = codigo_Producto;
    setnombre_Producto(nombre_Producto);
    setcategoria(categoria);
    
}


public abstract double totalPromedio();

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