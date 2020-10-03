package POO.Poli;

public class VehiculoDeportivo extends Vehiculo{
    private int cilindrada;

    public VehiculoDeportivo(String matricula,String marca,String modelo,
    int cilindrada){
     super(matricula, marca, modelo);
     this.cilindrada = cilindrada;

    }

    @Override
    public String mostrarDatos(){
    
        return "La Matricula: "+matricula+"\nLa Marca: "+marca+"\n El Modelo: "+modelo+
        "\n Cilindrada: "+cilindrada;
    }
    


}