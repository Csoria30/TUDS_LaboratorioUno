
import java.time.LocalDate;
import java.util.Scanner;

public class Trabajador extends Persona implements Aportes {
    //Variables
        Scanner leer = new Scanner (System.in);
        private float sueldo;

    //Constructores
        public Trabajador(String nombre, String dni, LocalDate fechaNacimiento, String domicilio, float sueldo) {
            super(nombre, dni, fechaNacimiento, domicilio);
            this.sueldo = sueldo;
        }

    //Getters & Setter
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
        
        public float getSueldo() {
            return sueldo;
        }
        
        public void setSueldo(float sueldo) {
            this.sueldo = sueldo;
        }

    //Metodos Extras
        
        @Override
        public void cobrar() {
            hacerAportes();
            System.out.println("Monto a cobrar: $ " + getSueldo());
        }

        @Override
        public void hacerAportes() {
            float aportes = ( getSueldo() * 10 ) / 100;
            setSueldo(getSueldo() - aportes);
            System.out.println(
                    "\nDe su sueldo se le descuenta el 10% para sus aportes jubilatorios.\n" + 
                    "Descuentos: $ " + aportes
            );
        }

}
