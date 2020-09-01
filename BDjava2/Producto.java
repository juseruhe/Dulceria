package BDjava2;

public class Producto {
    private int id;
    private String codigo_Producto;
    private String nombre_Producto;
    private String categoria;
    private int venta_Dia1;
    private int venta_Dia2;
    private int venta_Dia3;

public Producto(){

}

public Producto(String codigo_Producto,String nombre_Producto,String categoria, int venta_Dia1,
 int venta_Dia2,int venta_Dia3){

    this.id = id;
    this.codigo_Producto = codigo_Producto;
    this.nombre_Producto = nombre_Producto;
    this.categoria = categoria;
    this.venta_Dia1= venta_Dia1;
    this.venta_Dia2= venta_Dia2;
    this.venta_Dia3 = venta_Dia3;
}

public int getid(){
    return id;
}

public void setid(int id){
    this.id = id;
}


public String getcodigo_Producto(){
    return codigo_Producto;
}

public void setcodigo_Producto(String codigo_Producto){
    this.codigo_Producto = codigo_Producto;
}

public String getnombre_Producto(){
    return nombre_Producto;
}

public void setnombre_Producto(String nombre_Producto){
    this.nombre_Producto= nombre_Producto;
}

public String getcategoria(){
    return categoria;
}

public void setcategoria(String categoria){
    this.categoria= categoria;
}

public int getventa_Dia1(){
    return venta_Dia1;
}

public void setventa_Dia1(int venta_Dia1){
    this.venta_Dia1 = venta_Dia1;
}

public int getventa_Dia2(){
    return venta_Dia2;
}

public void setventa_Dia2(int venta_Dia2){
    this.venta_Dia2 = venta_Dia2;
}

public int getventa_Dia3(){
    return venta_Dia3;
}

public void setventa_Dia3(int venta_Dia3){
    this.venta_Dia3 = venta_Dia3;
}

@Override
public String toString(){
    return this.id+","+this.codigo_Producto+","+nombre_Producto+","+categoria+","+venta_Dia1+","+
    venta_Dia2+","+venta_Dia3+",";
}




}