
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Persona {
    //Variables
        protected String nombre;
        protected String dni;
        protected LocalDate fechaNacimiento;
        protected String domicilio;

    //Constructores
        public Persona(String nombre, String dni, LocalDate fechaNacimiento, String domicilio) {
            this.nombre = nombre;
            this.dni = dni;
            this.fechaNacimiento = fechaNacimiento;
            this.domicilio = domicilio;
        }

    //Getters 
        public String getNombre() {
            return nombre;
        }   
        public String getDni() {
            return dni;
        }
        public LocalDate getFechaNacimiento() {
            return fechaNacimiento;
        }
        public String getDomicilio() {
            return domicilio;
        }
        
    //Setters
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setDni(String dni) {
            this.dni = dni;
        }
        public void setFechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }
        public void setDomicilio(String domicilio) {
            this.domicilio = domicilio;
        }
    
    //Metodos Extras
        public void calcularEdad(){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            Period edad = Period.between(fechaNacimiento, LocalDate.now());
            System.out.println(String.format("Edad: %d años, %d meses y %d días",
                    edad.getYears(),
                    edad.getMonths(),
                    edad.getDays())
            );

        }
        
        public void calcularDiasVividos(LocalDate diaNacimiento){
            LocalDate inicio = diaNacimiento;
            LocalDate hoy = LocalDate.now();
            Duration dd = Duration.between(inicio.atStartOfDay(), hoy.atStartOfDay());
            System.out.println("Dias transcurridos: " + dd.toDays() + " Dias");
        }
        
        public abstract void cobrar();
}
