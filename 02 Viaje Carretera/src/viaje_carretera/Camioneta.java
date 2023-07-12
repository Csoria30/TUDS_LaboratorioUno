package viaje_carretera;

public abstract class Camioneta extends Vehiculo {
    //Constructores
        public Camioneta(String tipoVehiculo, String marca, String patente, Combustible combustible) {
            super(tipoVehiculo, marca, patente, combustible);
        }

    //Metodos
        @Override
        public float calcularCostoDeCombustible(float distancia) {
            float consumoKm = (float) (distancia * 0.10) * combustible.getPrecio();
            return consumoKm;
        }
}
