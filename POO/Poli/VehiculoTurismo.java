package POO.Poli;

public class VehiculoTurismo  extends Vehiculo{
    private int nPuertas;

    public VehiculoTurismo(String matricula,String marca,String modelo,int nPuertas){
      super(matricula, marca, modelo);
      this.nPuertas = nPuertas;
}


public int getnPuertas(){

return nPuertas;

}

@Override
public String mostrarDatos(){

    return "La Matricula: "+matricula+"\nLa Marca: "+marca+"\n El Modelo: "+modelo+
    "\n La Cantidad de Puertas: "+nPuertas;
}


}