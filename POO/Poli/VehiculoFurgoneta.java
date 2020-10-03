package POO.Poli;

public class VehiculoFurgoneta extends Vehiculo{
    
    private int carga;

    public VehiculoFurgoneta(String matricula,String marca,String modelo,
    int carga){
     super(matricula, marca, modelo);
     this.carga = carga;

    }

    @Override
    public String mostrarDatos(){
    
        return "La Matricula: "+matricula+"\nLa Marca: "+marca+"\n El Modelo: "+modelo+
        "\n Carga: "+carga;
    }




}