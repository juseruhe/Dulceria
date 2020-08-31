public class ProductoBebidas7 extends Producto7 {
    private  int venta_Dia1;
    private  int venta_Dia2;
    private  int venta_Dia3;

    ProductoBebidas7(String codigo_Producto,String nombre_Producto,String categoria,
    int venta_Dia1,int venta_Dia2,int venta_Dia3)throws Exception
    {
    
    super(codigo_Producto,nombre_Producto,categoria);
    setventa_Dia1(venta_Dia1);
    setventa_Dia2(venta_Dia2);
    setventa_Dia3(venta_Dia3);
    
    }
    

    public double totalPromedio(){
        return (venta_Dia1 + venta_Dia2+venta_Dia3) /3;
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
    




}