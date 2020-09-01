
public class Producto2 {
    
String Codigo_Producto;
String Nombre_Producto;
String Categoria;
int Venta_Dia1;
int Venta_Dia2;
int Venta_Dia3;

Producto2(String Codigo_Producto,String Nombre_Producto,String Categoria,int Venta_Dia1,
int Venta_Dia2,int Venta_Dia3){

    this.Codigo_Producto = Codigo_Producto;
    this.Nombre_Producto = Nombre_Producto;
    this.Categoria= Categoria;
    this.Venta_Dia1 = Venta_Dia1;
    this.Venta_Dia2 = Venta_Dia2;
    this.Venta_Dia3 = Venta_Dia3;


}


double promedioVentas(){

    return (Venta_Dia1+Venta_Dia2+Venta_Dia3)/3;
}


}