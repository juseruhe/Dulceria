
public class Producto4 {

private final String Codigo_Producto;
private String Nombre_Producto;
private String Categoria;
private int Venta_Dia1;
private int Venta_Dia2;
private int Venta_Dia3;

public String getCodigo_Producto(){

    return  Codigo_Producto;


  }



  


  public String getNombre_Producto(){

      return  Nombre_Producto;


    }



    public void setNombre_Producto(String Nombre_Producto){

    if (Nombre_Producto != null) {

        this.Nombre_Producto = Nombre_Producto;
    }

    else {

        this.Nombre_Producto = "";
    }

    }


    public String getCategoria(){

      return  Categoria;


    }



    public void setCategoria(String Categoria){

    if (Categoria != null) {

        this.Categoria = Categoria;
    }

    else {

        this.Categoria = "";
    }

    }


    public int getVenta_Dia1(){

      return  Venta_Dia1;


    }



    public void setVenta_Dia1(int Venta_Dia1){

    if (Venta_Dia1 !=  0) {

        this.Venta_Dia1 = Venta_Dia1;
    }

    else {

        this.Venta_Dia1= 0;
    }

    }


    public int getVenta_Dia2(){

      return  Venta_Dia2;


    }



    public void setVenta_Dia2(int Venta_Dia2){

    if (Venta_Dia2 != 0) {

        this.Venta_Dia2 = Venta_Dia2;
    }

    else {

        this.Venta_Dia2 = 0;
    }

    }


    public int getVenta_Dia3(){

      return  Venta_Dia3;


    }



    public void setVenta_Dia3(int Venta_Dia3){

    if (Venta_Dia3 != 0) {

        this.Venta_Dia3 = Venta_Dia3;
    }

    else {

        this.Venta_Dia3 = 0;
    }
}

Producto4(String Codigo_Producto,String Nombre_Producto,String Categoria,
int Venta_Dia1,int Venta_Dia2,int Venta_Dia3){

if(Codigo_Producto != null) { 

    this.Codigo_Producto = Codigo_Producto;
} else {
    this.Codigo_Producto="";
}

setNombre_Producto(Nombre_Producto);
setCategoria(Categoria);
setVenta_Dia1(Venta_Dia1);
setVenta_Dia2(Venta_Dia2);
setVenta_Dia3(Venta_Dia3);



}

double promedioVentas(){

    return (Venta_Dia1 + Venta_Dia2 + Venta_Dia3) /3;
  }




    
}