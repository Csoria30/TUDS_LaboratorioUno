package viaje_carretera;

public class Combustible {
    //Variables
        private String tipoCimbustible;
        private float precio;

    //Constructores
        public Combustible(String tipoCimbustible, float precio) { // se agrego
            this.tipoCimbustible = tipoCimbustible;
            this.precio = precio;
        }

        public Combustible() { // se agrego

        }

    //Metodos
        public String getTipoCimbustible() {
            return tipoCimbustible;
        }

        public void setTipoCimbustible(String tipoCimbustible) {
            this.tipoCimbustible = tipoCimbustible;
        }

        public float getPrecio() {
            return precio;
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }

}
