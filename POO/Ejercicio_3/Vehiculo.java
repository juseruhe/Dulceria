package POO.Ejercicio_3;

public class Vehiculo {
    
    private String marca;
    private String modelo;
    private Double precio;


Vehiculo(String marca,String modelo,Double precio){

    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;


}


public Double getPrecio(){

return precio ;

}


public String mostrarDatos(){


return "La Marca es "+marca+" ,el Modelo es "+modelo+" y el Precio es $"+precio+".\n";

}





}