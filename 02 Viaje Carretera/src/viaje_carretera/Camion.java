package viaje_carretera;

public abstract class Camion extends Vehiculo{ 
    //Constructores
        public Camion(String tipoVehiculo, String marca, String patente, Combustible combustible) { // se agrego
            super(tipoVehiculo, marca, patente, combustible);
        }
    
    //Metodos
        @Override
        public float calcularCostoDeCombustible(float distancia) { // se agrego
            float consumoKm = (float) (distancia * 0.12 )* combustible.getPrecio();
            return consumoKm;
        }
}
