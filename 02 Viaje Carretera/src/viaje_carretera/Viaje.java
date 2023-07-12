package viaje_carretera;
import static java.lang.Math.abs;

public class Viaje {
    //Variables
        private Ciudad origen;
        private Ciudad destino;
        private float distancia;
        private Vehiculo vehiculo;
        private int cantPeajes;
        private float peaje;
        private float peajeCostoTotal;
        private float costoCombustible;

    //Constructor
        public Viaje(Ciudad origen, Ciudad destino, float distancia, Vehiculo vehiculo, int cantPeajes, float peaje, float peajeCostoTotal, float costoCombustible) { //, boolean mismaRuta) {
            this.origen = origen;
            this.destino = destino;
            this.distancia = distancia;
            this.vehiculo = vehiculo;
            this.cantPeajes = cantPeajes;
            this.peaje = peaje;
            this.peajeCostoTotal = peajeCostoTotal;
            this.costoCombustible = costoCombustible;
        }

        public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int cantPeajes, float costoCombustible) { //, boolean mismaRuta) {
            this.origen = origen;
            this.destino = destino;
            this.vehiculo = vehiculo;
            this.cantPeajes = cantPeajes;
            this.costoCombustible = costoCombustible;
        }

        public Viaje() {
        }

    //Metodos
        public float calculoDistacia() {

            if ( origen.getNumRuta() != destino.getNumRuta() ) {
                    distancia = destino.getKmRuta() - origen.getKmRuta();
                    distancia = abs(distancia);
                System.out.println("\nLa distancia entre ciudaddes es de " + distancia + " Km.\nLas mismas no se encuentran en la misma ruta.");
                return distancia;
            } else {
                distancia = origen.getKmRuta();
                System.out.println("\nLas ciudades ingresadas, se encuentran en la misma ruta.");
                return distancia;
            }
        }

        public float calculoCostoPeaje(Vehiculo vehiculo) {  

            if (vehiculo instanceof Auto || vehiculo instanceof Camioneta) {
                peaje = 250;
                System.out.println("\nEl monto por su vehiculo es: $" + peaje);
            }else if (vehiculo instanceof Camion) {
                peaje = 350;
                System.out.println("\nEl monto por su vehiculo es: $" + peaje);
            }

            peajeCostoTotal = peaje * cantPeajes;
            System.out.println("Usted debe pagar $"  + peajeCostoTotal + " de peaje.\n\n");
            return peajeCostoTotal;
        }

        public float calculoCostoCombustible() {
            float costoCombustible = vehiculo.calcularCostoDeCombustible(distancia);
            return costoCombustible;
        }

    
        public float  calculoCostotal() { 
            return calculoCostoCombustible() + peajeCostoTotal;
        }

        
        
    //Getters & Setters
        public Ciudad getOrigen() {
            return origen;
        }

        public void setOrigen(Ciudad origen) {
            this.origen = origen;
        }

        public Ciudad getDestino() {
            return destino;
        }

        public void setDestino(Ciudad destino) {
            this.destino = destino;
        }

        public float getDistancia() {
            return distancia;
        }

        public void setDistancia(float distancia) {
            this.distancia = distancia;
        }

        public Vehiculo getVehiculo() {
            return vehiculo;
        }

        public void setVehiculo(Vehiculo vehiculo) {
            this.vehiculo = vehiculo;
        }

        public int getCantPeajes() {
            return cantPeajes;
        }

        public void setCantPeajes(int cantPeajes) {
            this.cantPeajes = cantPeajes;
        }

        @Override
        public String toString() {
            return "Viaje{" + "vehiculo=" + vehiculo + '}';
        }
    
}
