package viaje_carretera;

public abstract class Vehiculo {
    //Variables
        protected String tipoVehiculo;
        protected String marca;
        protected String patente;
        protected Combustible combustible;
    
    //Constructores
        public Vehiculo(String tipoVehiculo, String marca, String patente, Combustible combustible) {
            this.tipoVehiculo = tipoVehiculo;
            this.marca = marca;
            this.patente = patente;
            this.combustible = combustible;
        }

        public Vehiculo() {}
    
    //Metodos
        public abstract float calcularCostoDeCombustible(float distancia);

    @Override
    public String toString() {
        return "Vehiculo{" + "tipoVehiculo=" + tipoVehiculo + ", marca=" + marca + ", patente=" + patente + ", combustible=" + combustible + '}';
    }
}
