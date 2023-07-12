package viaje_carretera;

public abstract class Auto extends Vehiculo{ 
    //Constructores
        public Auto ( String tipoVehiculo, String marca, String patente, Combustible combustible ) {
            super(tipoVehiculo, marca, patente, combustible);
        }

    //Metodos
        @Override 
        public float calcularCostoDeCombustible ( float distancia ) {
            float consumoKm = (float) (distancia * 0.07) * combustible.getPrecio() ;            
            return consumoKm;
        }
}
