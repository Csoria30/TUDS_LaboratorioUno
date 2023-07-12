import java.time.LocalDate;

public class Jubilado extends Persona {
    //Variables
        private final Float sueldo;

    //Constructores
        public Jubilado(String nombre, String dni, LocalDate fechaNacimiento, String domicilio, float sueldo) {
            super(nombre, dni, fechaNacimiento, domicilio);
            this.sueldo = sueldo;
        }
        
    //Setter & Getters
        @Override
        public String getNombre() {
            return super.nombre;
        }     
        
        @Override
        public String getDni() {
            return super.dni;
        }
        
        @Override
        public LocalDate getFechaNacimiento() {
            return super.fechaNacimiento;
        }
        
        @Override
        public String getDomicilio() {
            return super.domicilio;
        }
        
        public float getJubilacion(){
            return sueldo;
        }

    //Metodos Extras
        @Override
        public void cobrar() {
            System.out.println("Cobrando mi jubilacion: $ " + getJubilacion());
        }

}
