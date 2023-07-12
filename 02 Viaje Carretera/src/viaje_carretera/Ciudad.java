package viaje_carretera;

public class Ciudad {
    //Variables
        private String ciudadOrigen;
        private float numRuta;
        private float kmRuta;

    //Constructores
        public Ciudad(String ciudadOrigen, float numRuta, float kmRuta) {
            this.ciudadOrigen = ciudadOrigen;
            this.numRuta = numRuta;
            this.kmRuta = kmRuta;
        }

        public Ciudad(){}

    //Metodos
        public String getCiudadOrigen() {
            return ciudadOrigen;
        }

        public void setCiudadOrigen(String ciudadOrigen) {
            this.ciudadOrigen = ciudadOrigen;
        }

        public float getNumRuta() {
            return numRuta;
        }

        public void setNumRuta(float numRuta) {
            this.numRuta = numRuta;
        }

        public float getKmRuta() {
            return kmRuta;
        }

        public void setKlmRuta(float kmRuta) {
            this.kmRuta = kmRuta;
        }

 

    @Override
    public String toString() {
        return "Ciudad{" + "ciudadOrigen=" + ciudadOrigen + ", numRuta=" + numRuta + ", kmRuta=" + kmRuta + '}';
    }
   
    
    
    
}
