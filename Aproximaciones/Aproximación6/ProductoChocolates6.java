public class ProductoChocolates6 extends Producto6 {
    
    private  int venta_Dia1;
    private  int venta_Dia2;
    private  int venta_Dia3;
    private  int venta_Dia4;

    ProductoChocolates6(String codigo_Producto,String nombre_Producto,String categoria,
    int venta_Dia1,int venta_Dia2,int venta_Dia3,int venta_Dia4){
    
    super(codigo_Producto,nombre_Producto,categoria);
    setventa_Dia1(venta_Dia1);
    setventa_Dia2(venta_Dia2);
    setventa_Dia3(venta_Dia3);
    setventa_Dia3(venta_Dia4);
    
    }

    double totalPromedio(){
        return (venta_Dia1 + venta_Dia2+venta_Dia3+venta_Dia4) /4;
    }
  
    public int venta_Dia1(){
        return venta_Dia1;
    }
    
    public void setventa_Dia1(int venta_Dia1){
     if(venta_Dia1 != 0){
         this.venta_Dia1 = venta_Dia1;
     }
     else {
         this.venta_Dia1 = 0;
     }
    }
    
    
    public int venta_Dia2(){
        return venta_Dia2;
    }
    
    public void setventa_Dia2(int venta_Dia2){
     if(venta_Dia2 != 0){
         this.venta_Dia2 = venta_Dia2;
     }
     else {
         this.venta_Dia2 = 0;
     }
    }

    public int venta_Dia3(){
        return venta_Dia3;
    }
    
    public void setventa_Dia3(int venta_Dia3){
     if(venta_Dia3 != 0){
         this.venta_Dia3 = venta_Dia3;
     }
     else {
         this.venta_Dia3 = venta_Dia3;
     }
    }

   

    public int venta_Dia4(){
        return venta_Dia4;
    }
    
    public void setventa_Dia4(int venta_Dia4){
     if(venta_Dia4 != 0){
         this.venta_Dia4 = venta_Dia4;
     }
     else {
         this.venta_Dia4 = venta_Dia4;
     }
    }
    



}